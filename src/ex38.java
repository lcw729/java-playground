// 생성자 함수 - 메소드 오버로딩이 가능하다.
// : 매개변수의 타입과 개수를 다르게 함으로 함수를 확장하는 것

class Robot {
    String color = "빨강";
    int price = 1000;

    // 기본(필드가 없는) 생성자 함수
    public Robot() {

    }

    // 필드가 있는 생성자 함수
    public Robot(String color) {
        this.color = color;
    }

    public Robot(String color, int price) {
        this.color = color;
        this.price = price;
    }
}
public class ex38 {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        System.out.println(robot1.color + robot1.price);

        Robot robot2 = new Robot("빨간색");
        System.out.println(robot2.color + robot2.price);

        Robot robot3 = new Robot("레인보우", 3000);
        System.out.println(robot3.color + robot3.price);
    }
}
