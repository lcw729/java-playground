import java.util.Scanner;

public class sol03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num < 0 || num > 10) {
            System.out.println("1 ~ 10사이의 수를 입력해주세요.");
            return;
        }

        for (int i = 1; i <= num; i++) {
            if (i == 3 || i == 6 || i == 9) {
                System.out.print("X ");
            } else {
                System.out.printf("%d ", i);
            }
        }
    }
}
