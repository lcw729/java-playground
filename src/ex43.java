// 다형성 : 폴리모피즘
//      : 자식클래스가 자기클래스 또는 부모클래스의 타입을 모두 가질 수 있는 것
// 이유 : 타입의 유연성을 가지기 위해서 타입이 정확하지 않더라도 객체(참조변수)를 전달 가능

class Parent {
    String name = "Parent";
    void parentMethod() {
        System.out.println("Parent 내 이름은 " + this.name);
    }
}

class Child extends Parent {
    String name = "Child";
    void childMethod() {
        System.out.println("Child 내 이름은 " + this.name);
    }
}

public class ex43 {
    public static void main(String[] args) {
        Child child1 = new Child();

        // 1. 업캐스팅 : 자식객체가 부모클래스 타입을 가지는 것
        // 1. 대입연산자를 통해서 강제형변환 될 때
        Parent parent = new Child();
        System.out.println(parent.name); // Parent
        // 2. 형변환 연산자를 통해서 - 강제형변환
        Parent parent2 = (Parent) child1;
        System.out.println(parent2.name);

        // 2. 다운캐스팅 : 자식객체가 자식클래스의 타입을 갖는 것
        // 1. 형변환 연산자를 통해서 - 강제형변환
        Child child = (Child) parent;
        child.childMethod();
        child.parentMethod();


        //                 v다운캐스팅 v 업캐스팅
        //                 +-------+--------+
        //Child클래스 객체 = | Child + Parent |
        //                 +-------+--------+

        // 4가지 형태
        Parent a = new Parent();
        Child b = new Child();
        Parent c = new Child(); // 업캐스팅
        // Child d = new Parent(); // 불가능 - 다형성과 무관함
        Child e = (Child) c; // 다운캐스팅

    }
}
