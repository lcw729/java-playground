import java.util.Scanner;

public class sol06 {
    public static void main(String[] args) {
        // 별찍기

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i <= (num / 2); i++) {
            for (int j = 0; j < (num / 2) - i; j++)
                System.out.print(" ");
            for (int j = 0; j < i * 2 + 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
