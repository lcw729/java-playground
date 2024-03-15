package DBMS;

public class StudentMain {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        StudentVO vo = new StudentVO();
        /*
        vo.setMemberno(1);
        vo.setName("lcw");
        vo.setKor(50);
        vo.setEng(50);
        vo.setMath(50);

        int result = dao.insert(vo);
        if (result > 0) {
            System.out.println("회원 등록 성공!");
        } else {
            System.out.println("회원 등록 실패!");
        }
        */

        vo = dao.selectOne(1);
        System.out.println(vo.getName());
    }
}
