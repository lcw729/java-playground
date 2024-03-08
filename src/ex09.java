public class ex09 {
    public static void main(String[] args) {
        // 산술 : + - * / %    << >> >>> (비트단위 이동연산자)
        int i = 10;
        int j = 3;
        System.out.println( i + j );
        System.out.println( i - j );
        System.out.println( i * j );
        System.out.println( i / j ); // 나눗셈의 몫
        System.out.println( i % j ); // 나눗셈의 나머지

        // 나머지 연산자 %
        int k = 123;

        // 연습문제 - 나머지 연산자를 이용하여
        /*
        1. 일의 자릿수 3을 출력하시오.
        2. 십의 자릿수 2를 출력하시오.
        3. 백의 자릿수 1을 출력하시오.
        4. 소숫점 첫째자리를 출력하시오.
        5. 소숫점 첫째자리에서 반올림하여 출력하시오.
        6. 소숫점 둘째자리에서 반올림하여 출력하시오.
         */
        System.out.println(k % 10);
        System.out.println((k / 10) % 10);
        System.out.println(k / 100);

        double d = 3.567;
        System.out.println((int)((d * 10) % 10));
        /*
        소숫점 없애기
        1. Math.floor
        2. (int) 형변환연산자
         */
        System.out.println(Math.round(d));
        System.out.println(Math.round(d * 10)/10.0);
        /*
        반올림하기
        1. Math.round
        2. 0.5 더하고 -> (int) 형변환연산자
         */
    }
}
