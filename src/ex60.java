//연습문제 
// 혼자서 온도를 조절하는 보일러(Boiler)를 스레드로 설계해보자.
// Thread 클래스를 상속하여 만드시오.
// 실제 온도 변수 : int realTemp = 23;  초기값
// 설정 온도 변수 : int setTemp = 20; 초기값
//              설정 함수 : setSetTemp(int setTemp)
// 무한루프를 돌면서 : 실제 온도와 설정 온도를 출력하시오.
//                 : 1초마다 내부 온도를 설정온도에 +/- 1도씩 바꿀수있다.
// 출력값 : 실제온도:23, 설정온도:20
//         실제온도:22, 설정온도:20
//         실제온도:21, 설정온도:20
//         실제온도:20, 설정온도:20 빙고!
//  setSetTemp( 22 );
//         실제온도:21, 설정온도:22
//         실제온도:22, 설정온도:22 빙고!

import java.util.Scanner;

class Boiler extends Thread {
    private int realTemp = 23; // 실제 온도
    private int setTemp = 20; // 설정 온도

    boolean isBingo = false;

    void setSetTemp(int temp) {
        isBingo = false;
        this.setTemp = temp;
    }
    @Override
    public void run () {
        while (true) {
            System.out.println("실제온도:" + realTemp + ", 설정온도:" + setTemp);

            if (realTemp > setTemp) {
                realTemp--;
            } else if (realTemp < setTemp) {
                realTemp++;
            } else {
                System.out.println("빙고");
                isBingo = true;
                break; // Thread 종료
            }

            try{
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}

public class ex60 {
    public static void main(String[] args) {
        Boiler boiler = new Boiler();

        do {
            if( boiler.isBingo == true)
                System.out.println("설정 온도는?");
                Scanner scanner = new Scanner(System.in);
                int temp = scanner.nextInt();

                boiler = null; // GC가 객체 해제한다.
                boiler = new Boiler();
                boiler.setSetTemp(temp);
                boiler.start();
        } while (true);
    }
}