// 서버는 3x3 정수형 2차 배열에 바둑판의 정보를 static으로 가진다.

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

class TicTacToe {
    static int[][] myBoard = new int[3][3];
    String[] in = new String[4];
    String calculate(String strFromClient) {
        in = strFromClient.split(",");
        switch (in[0]) {
            case "c1": {
                int x = Integer.parseInt(in[1]);
                int y = Integer.parseInt(in[2]);
                this.myBoard[x][y] = 1;
                break;
            }
            case "c2": {
                int x = Integer.parseInt(in[1]);
                int y = Integer.parseInt(in[2]);
                this.myBoard[x][y] = 2;
                break;
            }
        }

        String str = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                str += myBoard[i][j];
                if (i != 2 || j != 2)
                    str += ",";
            }
        }
        return str;
    }
}
public class ex63_server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        TicTacToe ticTacToe = new TicTacToe();
            try {
                while (true) {
                    serverSocket = new ServerSocket();
                    serverSocket.bind(
                            new InetSocketAddress("127.0.0.1", 5001));
                    System.out.println("서버 연결을 기다리는 중...");
                    Socket socket = serverSocket.accept();
                    InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();

                    System.out.println("서버가 연결을 수락함:" + isa.getHostName());
                    InputStream is = socket.getInputStream();
                    OutputStream os = socket.getOutputStream();

                    while (true) {
                        // 클라이언트 데이터를 수신한다.
                        byte[] bytes = null;
                        String message = null;

                        bytes = new byte[1024];
                        int readByteCout = is.read(bytes);
                        message = new String(bytes, 0, readByteCout, "UTF-8");
                        System.out.println("서버가 데이터받기 성공함.");
                        System.out.println("서버가 받은 데이터:" + message);

                        // 문자열 생성
                        bytes = ticTacToe.calculate(message).getBytes("UTF-8");
                        os.write(bytes);
                        os.flush();
                        System.out.println("데이터보내기 성공!");
                    }
                }
            } catch (Exception e) {
                System.out.println("서버 초기화 에러!");
            }

    }
}
