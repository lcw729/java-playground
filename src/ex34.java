class Book{
    // 속성
    int price = 1000;

    // 행동
    void read() {
        System.out.println("책을 읽는다.");
    }

    // 생성자 함수
    // 패턴 : public 반환타입생략 클래스이름() { }
    public Book() {
        this.price = 2000;
        System.out.println("생성자 함수 호출됨.");
    }
}

public class ex34 {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book.price);
    }
}
