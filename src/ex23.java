import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ex23 {
    public static void main(String[] args) {
        // 배열 Array
        /*
        1. 같은 타입의 데이터를 연속적 공간에 나열해 놓은 데이터구조
        2. 생성 시 크기가 고정되고 이후에는 변경 불가
        3. 인덱스는 0부터 부여됨
         */

        // 정수형 1차 배열
        // 1.
        int[] arrNum1 = new int[3];
        // 값이 0으로 초기화된다.
        System.out.println(Arrays.toString(arrNum1));
        arrNum1[0] = 1;
        arrNum1[1] = 2;
        arrNum1[2] = 3;
        // 2.
        int[] arrNum2 = new int[]{1,2,3};
        // 3.
        int[] arrNum3 = {1, 2, 3};
        // 4.
        int arrNum4[] = {1, 2, 3};

        /*
        안되는 경우
        int[] a;
        a = {3, 4, 5};
         */

        // 반복문을 이용한 데이터 읽기
        // 1. 일반반복문 - for while
//        for (int i=0; i<arrNum1.length; i++)
//            System.out.println(arrNum1[i]);

        // 2. for-each(향상된 for문)
//        for (int num : arrNum1)
//            System.out.println(num);

        int total = 0;
        int indexTwenty = -1;
        int[] nums = {10, 30, 20, 50, 40};
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            System.out.println(nums[i]);
            if (nums[i] == 20)  indexTwenty = i;
        }

        System.out.printf("length: %d\n", nums.length);
        System.out.printf("total: %d\n",total);
        System.out.printf("%d 번째\n", indexTwenty + 1);

        // 배열의 정렬 - 오름차순
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        Integer[] nums2 = {10, 20, 30, 40, 50};
        Arrays.sort(nums2, Collections.reverseOrder());
        System.out.println(Arrays.toString(nums2));
    }
}
