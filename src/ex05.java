public class ex05 {
    public static void main(String[] args) {
        String str1 = new String("안녕"); // 새로운 문자열 객체 생성
        String str2 = "안녕"; // 같은 내용의 리터럴 객체있는지 확인
        String str3 = "안녕"; // 같은 내용의 리터럴 객체있는지 확인
        // 있으면, 새로 생성 안하고 주소 값만 복사
        String str4 = new String("안녕"); // 새로운 문자열 객체 생성

        // 리터럴을 바로 입력한 데이터는 문자열이 같은 경우 하나의 객체를 공유
        System.out.println(str1 == str2); // false
        System.out.println(str2 == str3); // true
        System.out.println(str3 == str4); // false
        System.out.println(str4 == str1); // false

        // 문자열 연결 연산자 +
        // 산술 연산자 +
        System.out.println("한글" + "만세");
        System.out.println("한글" + 10);
        System.out.println(10 + "한글");
        System.out.println(10 + 20);

        System.out.println("한글" + 10 + 20); // 연산자 우선순위 좌 => 우
        System.out.println(10 + 20 + "한글");

        // 기본자료형 => 문자열형으로 변환
        String str = String.valueOf(10);
        // 문자열형 => 정수형
        int num = Integer.parseInt("10");
        System.out.println(num);
    }
}
