public class ex55 {
    public static void main(String[] args) {
        try {
            int[] nums = {10, 20, 30};
            String name = null;
//            System.out.println(nums[3]);
//            System.out.println(10/0);
            System.out.println(name.toLowerCase());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 예외발생!");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("산술 예외발생!");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("그외의 예외발생!");
            e.printStackTrace();
        } finally {
            // 예외가 발생하든 안하든 무조건 호출되는 블럭
            // 마무리 정리하는 코드
            System.out.println("FINALLY");
        }
    }
}
