import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ex63_client {
    public static void main(String[] args) {
        int[][] tictactoe = new int[3][3];
        String[] bucket = new String[9];
        Socket socket = null;
        socket = new Socket();

        try {
            socket.connect(
                    new InetSocketAddress("172.16.21.217", 5001)
//                    new InetSocketAddress("127.0.0.1", 5001)
            );
            System.out.println("서버 접속 성공!");

            // 서버에 데이터 보내기
            byte[] bytes = null;
            String message = null;

            OutputStream os = socket.getOutputStream();
            InputStream is = socket.getInputStream();
            Scanner scanner = new Scanner(System.in);
            String myNickname = scanner.next();

            while(true) {
                // 데이터 입력
                message = scanner.next();

                // 데이터 보내기
                bytes = message.getBytes("UTF-8");
                os.write(bytes);
                os.flush();
                System.out.println("데이터보내기 성공!");

                // 서버로 부터 데이터 받기
                bytes = new byte[1024];
                int readByteCount = is.read(bytes);
                message = new String(bytes, 0, readByteCount, "UTF-8");
                System.out.println("데이타받기 성공:" + message);
                if (message.startsWith("c")) {
                    if (message.equals(myNickname))
                        System.out.println("승리!!");
                    else
                        System.out.println("패배!!");
                    break;
                }

                // 2차원 배열 업데이트
                bucket = message.split(",");
                for (int i = 0; i < 9; i++) {
                    tictactoe[i / 3][i % 3] = Integer.parseInt(bucket[i]);
                }
                System.out.println(tictactoe);
            }

            os.close();
            is.close();
        } catch (Exception e) {
            System.out.println("서버 접속 오류!");
        }
    }
}
