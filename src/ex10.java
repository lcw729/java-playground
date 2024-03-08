public class ex10 {
    public static void main(String[] args) {
        // << >> >>> (비트단위 이동연산자)
        int k = -1;
        String binaryString = String.format("%32s", Integer.toBinaryString(k)).replace(" ", "0");
        System.out.println(binaryString);
        /*
        최상위비트 0이면 양수, 1이면 음수

        컴퓨터가 음수를 만드는 방법
        - 2의 보수 : 1의 보수 + 1
        - 1의 보수 : 0 -> 1 1 -> 0

        +1 -> -1
        - 0000...0001 => 1111...1110 => 1111...1111
         */

        // << : 왼쪽으로 비트이동 *2의 효과
        //    : LSB(맨왼쪽)은 0이 들어옴.
        //    : MSB는 0이면 0, 1이면 1로 지켜진다.
        int i = 1; // 0000...0001
        System.out.println( i << 1 );  // 0 000...0010
        System.out.println( 1 << 1);   // 0 000...0010  2
        System.out.println( -1 << 1 ); // 1 111...1110 -2

        // >> : 오른쪽으로 비트이동 /2의 효과
        //    : 양수이면 MSB(맨오른쪽)이 0이 들어옴.
        //    : 음수이면 MSB가 1이 들어옴.
        System.out.println( 1 >> 1 );  // 0 000...0000  0
        System.out.println( -1 >> 1 ); // 1 111...1111 -1

        // >>> : 오른쪽으로 비트이동하되 논리적 이동.
        //     : 양수든 음수든 0이 들어옴.
        System.out.println( -1 >>> 1 ); // 0 111...1111 127
    }
}
