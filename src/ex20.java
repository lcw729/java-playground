public class ex20 {
    public static void main(String[] args) {
        // 중첩반복문에서의 제어 : break continue label
        // 레이블 : 반복문의 제어 위치
        loop1: for (int i=0; i<5; i++) { // 1
            System.out.println(i);
        loop2: for(int j=0; j<5; j++){ // 2
                if(j > 3)
                    break loop1; // 제어의 대상은 break의 바로 위에 있는 반복문
                if (j % 2 == 1)
                    continue loop1;
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
