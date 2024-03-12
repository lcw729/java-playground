class MyClass{
    // 메소드 4가지 패턴
    // 매개변수 X 반환형 X
    void func1() {
        System.out.println("func1");
    }
    // 매개변수 O 반환형 X
    void func2(int x, int y) {
        System.out.println(x + " " + y);
    }
    // 매개변수 X 반환형 O
    int func3() {
        System.out.println("func3");
        return 10;
    }
    // 매개변수 O 반환형 0
    int func4(int x, int y) {
       return  x + y;
    }
}

public class ex28 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
    }
}
