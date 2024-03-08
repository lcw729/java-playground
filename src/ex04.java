import java.lang.reflect.Type;

public class ex04 {
    public static void main(String[] args) {
        // 형변환 type casting
        /*
        형변환 공식
        1. 작은 정수형 -> 큰 정수형 (문제없음)
        2. 큰 정수형 -> 작은 정수형 (표현범위 벗어나면 값잘림)
        3. 실수형 -> 정수형 (값잘림, 소숫점 날아감)
        4. 정수형 -> 실수형 (문제없음)
         */

        // 자동 형변환 : 대입(산술)연산자를 통해 자동으로 형변환 됨.
        // 수동 형변환 : 형변환 연산자(타입)을 통해 형변환 할 때.

        /*
         자동 형변환 예
         1. 같은 타입끼리 연산될 때
            int * int => int
            long * long => long
         */
        int i = 10;
        int j = 10;
        int k = i * j;

        /*
        2. 다른 타입끼리 연산될 때 => 더 큰 타입으로 변환
            int * long => long
            long * float => float
         */
        long m = 10 * 20L;

        // 3. 작은 타입에서 큰 타입으로 대입될 때 => 큰 타입으로 변경
        long a = 10; // int

        // 4. 큰 타입에서 작은 타입으로 대입될 때
        int b = (int) 20L; // 형변환 안됨. 수동형변환 필요.

        // 수동(강제) 형변환
        // 형변환 연산자 사용
        // 주의할 점! => 표현범위를 벗어나면 값 잘림(쓰레기 값)
        // 작은 타입 = (작은 타입)큰 타입
        int c = (int) 20L;

        // 연습문제
        short num1 = 10;
        int num2 = 20;
        float num3 = num1; // 자동형변환
        System.out.println(num3);
        num1 = (short) num2; // int -> short
        System.out.println(num1);
        System.out.println(num2 * num3); // int * float => float

    }
}
