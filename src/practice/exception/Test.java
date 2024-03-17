package practice.exception;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
           String name = scanner.next();
           StringChecker stringChecker = new StringChecker();
           stringChecker.CheckStringLength(name);
        } catch (CustomException e) {
            e.printMessage();
        }

        Calculator calculator = new Calculator(10);
        calculator.divide(5);
        System.out.println(calculator.number);

        calculator.divide(0);
        calculator.divide(2);
        System.out.println(calculator.number);

        try {
            method2();
        } catch (ClassNotFoundException e) {
            System.out.println("해당 클래스가 없습니다.");
        }
        /*
        try (InputStreamReader is = new InputStreamReader(System.in);) {
            System.out.println(is.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
         */
    }

    public static void method2() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String2");
    }
}