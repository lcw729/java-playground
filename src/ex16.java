public class ex16 {
    public static void main(String[] args) {
        /*
        반복문 for while do-while
              70%  29%   1%
        패턴
        for( 초기화1; 조건식2; 증감식4 ) {
          실행문3;
        }
         1 => 2 => 3 => 4 => 234 234 2(false 탈출)
         */
        for( int i=0; i<5; i++ ){
            System.out.println( i );
        }
        /*
        초기식,조건식,증감식을 잘못쓰면 무한루프에 걸린다.
        for( int i=0;    ; i++ ){
            System.out.println( i );
        }
        무한루프을 만드는 방법
        1. for( ; ; )
        2. while( true )
        */

        // 1번 문제
        for (int i = 1; i <= 100; i++) {
            if ((i % 5 == 0) || (i % 3 == 0))
                System.out.println(i);
        }

        // 2번 문제
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        // 3번 문제
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 3)
                total += 1;
        }
        System.out.println(total);

        // 4번 문제
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 2 || i % 10 == 7)
                count += 1;
        }
        System.out.printf("밟은 벽돌: %d \n밝지않은 벽돌: %d", 100 - count, count);
    }
}
