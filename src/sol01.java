import java.util.Scanner;

public class sol01 {
    public static void main(String[] args) {
        int[] alba = new int[]{1, 0, 1, 0, 1, 0, 1}; // 월 화 수 목 금 토 일

        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

        if (alba[day - 1] == 1) {
            System.out.println("oh my god");
        } else {
            System.out.println("enjoy~");
        }
    }
}
