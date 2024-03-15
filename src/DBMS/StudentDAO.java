package DBMS;
import java.sql.*;
import java.net.ConnectException;

public class StudentDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public StudentDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydb", //Host
                    "root", //사용자
                    "mysql123" //암호
            );
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.close();
            } catch (Exception ex) {
                e.printStackTrace();
            }
        }
        if (conn != null)
            System.out.println("데이터베이스 접속 성공!!");
    }


    public int insert(StudentVO vo) {
        int result = 0;
        try {
            String sql = "INSERT INTO student (memberno, name, kor, eng, math)" +
                        "VALUES (" + vo.getMemberno() + ", '"
                        + vo.getName() + "', "
                        + vo.getKor() + ", "
                        + vo.getEng() + ", "
                        + vo.getMath() + ")";

            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public StudentVO selectOne(String name) {
        StudentVO vo = new StudentVO();

        try {
            String sql = "SELECT * FROM student WHERE name=\'" + name + "\'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                vo.setMemberno(rs.getInt("memberno"));
                vo.setName(rs.getString("name"));
                vo.setKor(rs.getInt("kor"));
                vo.setEng(rs.getInt("eng"));
                vo.setMath(rs.getInt("math"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return vo;
    }
}
