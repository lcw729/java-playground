import java.util.Scanner;

// 컴퓨터와 369 게임하기
public class sol04 {
    public static void main(String[] args) {
        boolean myTurn = false;
        int num = 1;
        Scanner scanner = new Scanner(System.in);


        while (true) {
            String nextNum = Integer.toString(++num);
            boolean clap = nextNum.chars().anyMatch(
                    c -> c == '3' || c == '6' || c == '9'
            );
            if (!myTurn) {
                if (clap) System.out.println("X");
                else System.out.println(nextNum);

                myTurn = true;
            } else {
                String now = scanner.next();

                if (clap) {
                    if (!now.equals("X")) {
                        System.out.println("컴퓨터 승리!");
                        return;
                    }
                } else {
                    if (!now.equals(nextNum)) {
                        System.out.println("컴퓨터 승리!");
                        return;
                    }
                }

                myTurn = false;
            }
        }
    }
}