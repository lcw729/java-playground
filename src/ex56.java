public class ex56 {
    public static void main(String[] args) {
        // throws 문
        //  : 자신을 호출한 메소드에 예외처리를 떠넘기는 것.
        try {
            myFunc();
        } catch (ArithmeticException e) {
            System.out.println("산술 연산 에러 발생!");
        } catch (Exception e) {
            MyException e2 = (MyException) e;
            e2.printMessage();
        }
    }

    static void myFunc() throws Exception {
        System.out.println("myFunc");
        System.out.println(10/0);

        // 강제로 예외 발생
        int i = 10;
        if (i < 10) {
            MyException myException = new MyException();
            myException.message = "사용자 예외";
            throw myException;
        }
    }
}

// 내 코드를 깔끔하게 빨리 처리하기 위해서
class MyException extends Exception {
    String message = "";
    public void printMessage() {
        System.out.println(this.message);
    }
}