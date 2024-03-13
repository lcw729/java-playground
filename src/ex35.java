class StaticClass {
    int a;
    static int b = 0; // 프로그램 시작 시 초기화됨.
    static { // 클래스 호출 시 처음 한 번만 호출됨
        b = 5;
        System.out.println("static block!");
    }

    // 생성자 함수
    StaticClass() { // 코드가 실행될 때 호출됨
        System.out.println("생성자 함수");
        a = 3;
        b = 7;
    }
}

public class ex35 {
    public static void main(String[] args) {
        System.out.println(StaticClass.b); // 5
        StaticClass s = new StaticClass(); // 생성자 함수 실행 !
        System.out.println(StaticClass.b); // 7
    }
}
