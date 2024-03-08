import java.util.ArrayList;
import java.util.Random;

public class sol02 {
    public static void main(String[] args) {
        ArrayList<Integer> lotto = new ArrayList<Integer>();

        Random rand = new Random();
        while (lotto.size() < 6) {
            int num = rand.nextInt(45) + 1;

            // 기본 데이터 타입을 해당 타입의 래퍼 클래스로 자동 변환하는 오토박싱(auto-boxing) 기능
            // num : int (기본 데이터 타입) => Integer (참조형 타입)
            if (lotto.contains(num)) {
                System.out.println("중복 되었습니다.");
            } else {
                lotto.add(num);
            }
        }

        System.out.println(lotto);
    }
}
