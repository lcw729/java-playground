package practice.exception;

public class CustomException extends Exception{
    String message;

    CustomException(String message) {
        this.message = message;
    }

    void printMessage() {
        System.out.println(this.message);
    }
}
