public class ex08 {
    public static void main(String[] args) {
        // 단항 : ++ -- !(논리반전) (타입) ~(비트반전)
        int i = 10;
        i++; // i = i + 1;
        System.out.println(i); // 11
        System.out.println(i--); // 11
        System.out.println(i); // 10

        boolean b = true;
        System.out.println(!b);
        System.out.println(!!b);

        int j = 20;
        short s = (short) j; // 작은 타입 <= 큰 타입 : 강제형변환

        int k = 10; // 32bit 00000...1010
        int m = ~k; //       11111...0101
        String binaryString = String.format("%32s", Integer.toBinaryString(k)).replace(" ","0");
        System.out.println(binaryString);
    }
}
