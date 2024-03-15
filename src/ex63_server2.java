// https://lagged.kr/p/1378/
//기능 및 설계 요구사항
//1. 2인용 통신을 이용한 온라인 게임
//2. 서버프로그램 1개 + 클라이언트 프로그램 2개 => 내가 서버를 해본다
//   클라1 <---> 서버 <--> 클라2
//3. 서버는 3x3 정수형 2차 배열에 바둑판의 정보를 static으로 가진다.
//4. 0은 빈 칸, 1은 O, 2는 X 이다.
//5. 출력예)
// 클라1 "c1,0,0,O" 전송 후 서버는 "1,0,0,0,0,0,0,0,0"를 받는다.
// 서버 "c1,0,0,O" 수신 후 서버는 "1,0,0,0,0,0,0,0,0"을 보낸다.
// 클라2 "c2,0,1,X" 전송 후 서버는 "1,2,0,0,0,0,0,0,0"를 받는다.
// 서버 "c2,0,0,X" 수신 후 서버는 "1,2,0,0,0,0,0,0,0"을 보낸다.
//6. 클라1이나 클라2가 서버의 정보를 요청한다.
//  "info"라고 보내면, 서버는 현재의 정보를 보낸다.
//  "info" => "1,2,0,0,0,0,0,0,0"
//6. 게임판 출력 양식은
//- X -
//- X O
//- - -
//7. 게임판정
//가로,세로,대각선 방향으로 O/X가 3개 연속되면, 승리하게 된다.

//개발순서
//서버 : int[][] map = new int[3][3];
//클라1 : "c1,0,0,O" 문자열을 서버로 전송
//서버 : "c1,0,0,O"을 꼼마 단위로 문자열배열로 만들고,
//       map 정수배열 값을 업데이트한다.
//서버 : "1,0,0,0,0,0,0,0,0" 문자열을 클라1에게 전송한다.
//클라1 : "1,0,0,0,0,0,0,0,0" 문자열을 꼼마단위로 분석해서,
//       map 정수배열 값을 업데이트한다.
//서버 : 게임판정을 해서 승리한 클라이언트 이름을 출력한다.

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ex63_server2 {
    static int[][] map = new int[3][3];

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {

            serverSocket = new ServerSocket();
            serverSocket.bind(
                    new InetSocketAddress("172.16.21.217", 5001));


            while (true) {
                System.out.println("서버가 연결을 기다리는 중...");
                Socket socket = serverSocket.accept(); //Blocking..대기중..
                InetSocketAddress isa =
                        (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("서버가 연결을 수락함:" + isa.getHostName());

                InputStream is = socket.getInputStream();
                OutputStream os = socket.getOutputStream();

                while (true) {
                    //클라이언트 데이타를 수신한다.
                    byte[] bytes = null;
                    String message = null;

                    bytes = new byte[1024]; //1024바이트만큼 버퍼메모리 생성
                    int readByteCount = is.read(bytes);
                    message = new String(bytes, 0, readByteCount, "UTF-8");
                    System.out.println("서버가 데이타받기 성공함.");
                    System.out.println("서버가 받은 데이타:" + message);


                    if (message.equals("info")) {
                        message = getInfo();
                    } else {
                        String[] mapString = message.split(",");
                        int row = Integer.parseInt(mapString[1]);
                        int col = Integer.parseInt(mapString[2]);
                        map[row][col] = mapString[3].equals("O") ? 1 : 2;

                        message = getInfo();

                        if (((map[0][0] != 0) && (map[0][0] == map[1][1]) && (map[1][1] == map[2][2]))
                                || ((map[0][2] != 0) && (map[0][2] == map[1][1]) && (map[1][1] == map[2][0]))) {
                            message = mapString[0];
                        }
                        for (int i = 0; i < 3; i++) {
                            if (((map[i][0] != 0) && (map[i][0] == map[i][1]) && (map[i][1] == map[i][2]))
                                    || ((map[0][i] != 0) && (map[0][i] == map[1][i]) && (map[1][i] == map[2][i]))) {
                                message = mapString[0];
                            }
                        }
                    }

                    //서버에서 클라로 데이타 보내기
                    bytes = message.getBytes("UTF-8");
                    os.write(bytes);
                    os.flush(); //버퍼에 있는 데이타 밀어내기
                    System.out.println("서버가 클라에게 데이타보내기 성공");

                    if (message.equals("exit")) { //"exit"문자열이면 서버 종료!
                        break;
                    }
                }
                is.close();
                os.close();
                socket.close();
            }
        } catch (Exception e) {
            System.out.println("서버 초기화 에러!");
            e.printStackTrace();
        }
    }

    static String getInfo() {
        String[] mapString = new String[9];
        int k = 0;
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                mapString[k++] = String.valueOf(map[i][j]);
            }
        }
        return String.join(",", mapString);
    }
}