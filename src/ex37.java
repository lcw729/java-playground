class Wood {
    int price = 1000;

    void burn() {
        System.out.println("불탄다.");
    }
}

class WoodDesk extends Wood{
    String color = "흰색";

    void study() {
        System.out.println("공부를 한다.");
    }
}

class WoodChair extends Wood{
    String color = "갈색";

    void sit() {
        System.out.println("앉는다.");
    }
}


public class ex37 {
    public static void main(String[] args) {
        WoodDesk woodDesk = new WoodDesk();
        System.out.println(woodDesk.color);
        woodDesk.study();

        WoodChair woodChair = new WoodChair();
        System.out.println(woodChair.color);
        woodChair.sit();
    }
}
