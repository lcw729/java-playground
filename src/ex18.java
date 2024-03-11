import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        //반복문의 제어문 : break continue
        //break : 반복문 중단
        //continue : 증감식으로 이동
        for( int i=0; i<10; i++ ){
            if( i > 5 )
                break;
            System.out.println( i );
        }
        for( int i=0; i<10; i++) {
            if( i%2 == 0 ){
                continue;
            }
            System.out.println( i );
        }

        // 연습문제
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int total = 0;
        for (int i = 1; i <= num; i++) {
            if(!isPrime(i)) continue;
            System.out.println(i);
            total += 1;
        }

        System.out.println(total);
    }

    static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i <= (int)Math.sqrt(num); i++){
            if (num%i == 0)
                return false;
        }
        return true;
    }
}
