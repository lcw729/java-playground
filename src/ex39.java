// 상속 관계에서 생성자 호출되는 순서(초기화 순서)
class Energy {
    int price = 1000;
    public Energy() { // 기본 생성자
        System.out.println("Energy - 기본 생성자");
    }

    public Energy(int price) {
        this.price = price;
        System.out.println("Energy - 필드가 있는 생성자");
    }
}

class WindEnergy extends Energy {
    int price = 2000;


    public WindEnergy() {
        System.out.println("Wind - 기본 생성자");
    }

    public WindEnergy(int price) {
        super(price); // 부모의 필드 생성자 호출 !
        // 반드시 첫줄에 넣어야 됨.

        this.price = price;
        System.out.println("Wind - 필드 생성자");
    }
}

// this. : 자기 클래스의 필드/메소드 접근
// this() : 자기 클래스의 생성자 함수 호출
// super. : 부모클래스의 필드/메소드 접근
// super() : 부모클래스의 생성자 함수 호출
public class ex39 {
    public static void main(String[] args) {
        WindEnergy we1 = new WindEnergy();
        WindEnergy we2 = new WindEnergy(3000);
    }
}
