import java.util.ArrayList;
import java.util.Random;

public class ex14 {
    public static void main(String[] args) {

        /*
        Random random = new Random();
        int num1 = random.nextInt(6) + 1;
        int num2 = random.nextInt(6) + 1;

        System.out.printf("%d %d\n",num1, num2);

        if((num1 % 2 == 0) && (num2 % 2 == 0)) {
            System.out.println("철수 승!");
        } else if((num1 % 2 != 0) && (num2 % 2 != 0)){
            System.out.println("영희 승!");
        } else {
            System.out.println("무승부");
        }
         */

        Random random = new Random();
        int a1 = random.nextInt(6) + 1;
        int a2 = random.nextInt(6) + 1;
        System.out.printf("철수 주사위1 수: %d \n", a1);
        System.out.printf("철수 주사위2 수: %d \n", a2);

        int b1 = random.nextInt(6) + 1;
        int b2 = random.nextInt(6) + 1;
        System.out.printf("영희 주사위1 수: %d \n", b1);
        System.out.printf("영희 주사위2 수: %d \n", b2);

        int total1 = a1 * 10 + a2;
        int total2 = b1 * 10 + b2;

        System.out.printf("%d %d\n",total1, total2);

        if(total1 > total2) {
            System.out.println("철수 승!");
        } else if(total1 < total2){
            System.out.println("영희 승!");
        } else {
            System.out.println("무승부");
        }
    }
}
