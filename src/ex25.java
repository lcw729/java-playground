/*
객체지향프로그래밍(OOP)
모든 사물을 객체(물건)로 추상화(모델링, 설계)하는 프로그래밍 기법
예) 자동차
- 속성(변수, 필드)과 행동(매소드, 함수)으로 구분해서
 */

// 클래스 선언부
class Car {
    // 속성 = 변수(필드) = 멤버변수
    int price = 1000;
    String name = "Guest";

    // 행동(동작) = 함수(메소드) = 멤버함수
    void run() {
        System.out.printf("%s가 달립니다.\n", this.name);
    }

    void buy() {
        System.out.printf("%s의 가격은 %d원 입니다.\n", this.name, this.price);
    }
}
public class ex25 {
    public static void main(String[] args) {
        // 클래스 생성 및 호출부
        // 클래스이름 객체이름 = new 클래스이름();
        Car genesis = new Car(); // Heap 영역에 할당
        genesis.name = "genesis";
        genesis.price = 100;

        genesis.run();
        genesis.buy();

    }
}
