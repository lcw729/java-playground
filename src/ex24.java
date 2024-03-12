import java.util.Random;

public class ex24 {
    public static void main(String[] args) {
        /*
        // 2차배열
        // 1.
        int[][] arrNum1 = new int[3][3]; // 3행3열 정수형 2차배열

        // 2.
        int[][] arrNum2 = new int[][]{
                {10, 20, 30},
                {40, 50, 60}}; // 2행3열

        // 3.
        int[][] arrNum3 = {
                {10, 20, 30},
                {40, 50, 60}}; // 2행3열

        // 4.
        int[][] arrNum4 = new int[2][];
        arrNum4[0] = new int[3];
        arrNum4[1] = new int[3];

        // 행의 길이
        System.out.println(arrNum2.length);
        // 열의 길이
        System.out.println(arrNum2[0].length);
        System.out.println(arrNum2[1].length);
         */

        // 연습문제
        int[][] nums = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < 9; i++) {
            int num = random.nextInt(100) + 1;
            nums[i / 3][i % 3] = num;
        }

        int min = 101;
        int max = -1;
        for (int[] numArr : nums) {
            for (int num : numArr) {
                if (max <= num) max = num;
                if (min >= num) min = num;
                System.out.printf("%d ", num);
            }
            System.out.println();
        }

        System.out.println();
        System.out.printf("max: %d, min: %d\n", max, min);

        int[][] data = {{0, 1, 2},
                {1, 2, 0},
                {2, 1, 0}};

        for (int[] row: data) {
            for (int element: row){
                switch (element){
                    case 0:
                        System.out.print("#");
                        break;
                    case 1:
                        System.out.print("*");
                        break;
                    case 2:
                        System.out.print("+");
                        break;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
