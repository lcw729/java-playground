package practice.coffee;

public class Coffee <T>{
    T clientName;

    void ready() {
        System.out.println("커피 준비 완료: " + clientName);
    }
}
