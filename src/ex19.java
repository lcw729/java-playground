import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        /*
        for (int i = 0; i < num; i++){
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++)
                System.out.print("*");

            System.out.println();
        }
         */


        //2. 별찍기3
        //입력 예) 5이상의 홀수
        //5
        //출력 예)
        //*****
        //*  **
        //* * *
        //**  *
        //*****
        //입력 예)
        //7
        //출력 예)
        //*******
        //*    **
        //*   * *
        //*  *  *
        //* *   *
        //**    *
        //*******
        n = scanner.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if( i==0 || i == n-1 ){ //첫행 마지막행
                    System.out.print("*");
                }
                else if( j==0 || j == n-1 ){ //중간행
                    System.out.print("*");
                }else if(n-1-i == j) { //대각선
                    System.out.print("*");
                }else{
                    System.out.print(" ");//그외
                }
            }
            System.out.println();
        }
    }
}
