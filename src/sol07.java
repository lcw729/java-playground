import java.util.ArrayList;
import java.util.Scanner;

public class sol07 {
    public static void main(String[] args) {
        /*
        Sn=(1)+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+...+n)
        임의의 정수 n이 주어질 때 이 수열의 합 Sn을 구하는 프로그램을 작성하시오.
         */
        ArrayList<Integer> arr = new ArrayList<Integer>(0);

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int total = 0;
        for (int i = 0; i <= num; i++) {
            if (arr.isEmpty()) arr.add(i);
            else {
                int current = arr.get(i - 1) + i; // 1+2 + 3
                arr.add(current); // [1, 1+2, 1+2+3 ...]
                total += current;
            }
        }

        System.out.println(total);
    }
}
