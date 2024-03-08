import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        /*
        Scanner 클래스 함수들
        nextLine() : 문자열을 입력받되 엔터칠 때까지 (공백포함)
        next() : 문자열의 공백까지만 입력받음
        nextInt() : 문자열을 받아서 정수로 반환해줌.
        nextFloat() :           실수로 반환해줌.
        nextDouble() :          실수로 반환해줌.
         */

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        System.out.println(str1);

        // java.util.InputMismatchException
        // next() 함수에 저장된 버퍼메모리가 정리되지 않아서이다.
        // 해결방안 : nextLine()함수를 한 번 실행해준다.
        String str2 = scanner.next();
        System.out.println(str2);

        int num1 = scanner.nextInt();
        System.out.println(num1);

        scanner.close(); // scanner 객체가 사용중인 메모리 정리
    }
}
