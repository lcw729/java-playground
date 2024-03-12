class BallFactory{
    int ballCount = 100;
    void make() {
        this.ballCount++;
        System.out.println("축구공 생산!");
    }
}

class FoodFactory {
    static int foodCount = 200;
    static void make() {
        foodCount++;
        System.out.println("도시락 생성");
    }
}
public class ex27 {

    // 전역변수 또는 중요한 데이터 저장용
    public static BallFactory myballFactory;
    public static void main(String[] args) {
        BallFactory ballFactory = new BallFactory();
        System.out.println(ballFactory.ballCount);

        // static 변수/함수는 클래스이름 뒤에 점을 찍어서 접근
        System.out.println(FoodFactory.foodCount);
        // 예)
        System.out.println(Math.random());
    }
}

