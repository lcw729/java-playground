import org.w3c.dom.ls.LSOutput;

class People {
    void think() {
        System.out.println("생각한다.");
    }
}

class Man extends People {
    @Override
    void think() {
        System.out.println("남자가 생각한다.");
    }

    void shave() {
        System.out.println("면도한다.");
    }
}

class Woman extends People {
    @Override
    void think() {
        System.out.println("여자가 생각한다.");
    }

    void makeup() {
        System.out.println("화장한다.");
    }
}

public class ex44 {
    public static void main(String[] args) {
        // 1. 업캐스팅
        People people = new Man();
        people.think(); // 오버라이드된 메소드가 실행된다.

        // 2. 다운캐스팅 : 자식객체가 부모클래스의 타입으로
        // 변경되었다가, 다시 자식클래스 타입을 가지는 것
        ((Man) people).shave();

        // 다형성을 이용해서 Man 객체와 Woman 객체도 전달해보자.
        myFunc(new Man());
        myFunc(new Woman());

    } // main

    static void myFunc(People p) {
        // instanceof 연산자 : 객체 타입을 확인하는 연산자.
        if (p instanceof Man) {
            ((Man)p).shave();
        }
        ((Man) p).shave();
        ((Woman) p).makeup();
    }

} // class
