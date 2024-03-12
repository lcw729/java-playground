public class ex31 {
    static void echo() {
        System.out.println("echo");
    }

    static void echo(int x) {
        System.out.println("echo:" + x);
    }

    static void calc(int a) {
        System.out.println(a);
    }

    static int calc(int a, int b) {
        return a + b;
    }

    static int calc(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        echo();
        echo(2);

        // 예) println
        System.out.println();
        System.out.println(10);
        System.out.println("야호~");

        calc(1);
        System.out.println(calc(1, 5));
        System.out.println(calc(4, 2, 3));
    }
}
