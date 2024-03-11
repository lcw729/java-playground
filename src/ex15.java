import java.util.Random;
import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        //조건문 - switch문
        //패턴
        //     정수,문자,문자열
        int a = 10;
        switch ( a ) {
            case 9:
                System.out.println("9");
                break;
            case 10:
                System.out.println("10");
                break;
            default:
                System.out.println("그외의 값");
                break;
        }
        int a2 = 11;
        switch ( a2 ) {
            case 9:
            case 10:
                System.out.println("9 or 10");
                break;
            default:
                System.out.println("그외의 값");
                break;
        }

        Random random = new Random();
        int num = random.nextInt(6);
        System.out.println(num);

        switch (num) {
            case 0:
                System.out.println("음악을 틀러준다.");
                break;
            case 1:
                System.out.println("간식을 준다.");
                break;
            case 2:
                System.out.println("주인의 영상을 틀어준다.");
                break;
            case 3:
                System.out.println("산책을 시켜준다.");
                break;
            default:
                System.out.println("잘못된 코드입니다.");

        }

        int num2 = random.nextInt(12) + 1;
        System.out.println(num2);

        switch (num2) {
            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("가을");
                break;
            case 12: case 1: case 2:
                System.out.println("겨울");
                break;
        }

    }
}
