package practice.exception;

public class Calculator {
    int number;

    public Calculator(int number) {
        this.number = number;
    }

    void divide (int operator) {
        try {
            this.number = this.number / operator;
        } catch (ArithmeticException e) {
            System.out.println("0이 아닌 다른 값을 입력해주세요. ");
        } finally {
            System.out.println("divide 함수 종료");
        }
    }
}
