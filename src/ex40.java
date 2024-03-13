// 오버라이드 (Override)
// : 부모클래스의 메소드를 자식클래스에서 재정의한다.
// : 부모클래스의 메소드는 무시된다.

class Machine {
    String name = "일반기계";
    void work() {
        System.out.println("일한다.");
    }
}

class CoffeeMachine extends Machine {
    // 오버라이드 메소드 : 반환타입 함수이름 매개변수 동일
    // 어노테이션 : @로 시작하는 컴파일 지시어.
    // 역할 : 개발자나 컴파일러에게 해당 속성을 알려줌
    String name = "커피머신";

    @Override
    void work() {
        System.out.println("커피 내린다.");
    }
}

public class ex40 {
}
