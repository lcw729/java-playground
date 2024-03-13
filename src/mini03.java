import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 성적 관리 프로그램
// 클래스 설계
class Student {
    String name;
    int kor;
    int eng;
    int math;
    int total;
    double avg;

    // 생성자
    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = kor + eng + math;
        this.avg = (double) this.total / 3;
    }

    public void CalculateScore() {
        this.total = this.kor +  this.eng +  this.math;
        this.avg = (double) this.total / 3;
    }
}

public class mini03 {
    public static List<Student> list = new ArrayList<Student>();

    static Student findStudent(String name) {
        for (Student current : list) {
            if (current.name.equals(name))
                return current;
        }
        return null;
    }

    public static void main(String[] args) {
        list.add(new Student("홍길동", 70, 80, 90));

        // ArrayList 관련 함수들 : 전체지우기, 추가, 삭제, 검색(직접 코드로)
        Scanner scanner = new Scanner(System.in);
        OUT: while (true) {
            System.out.print("1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 : ");
            int num = scanner.nextInt();
            switch (num) {
                case 1: {// 1. 입력
                    System.out.print("이름 입력");
                    String name = scanner.next();

                    System.out.print("국어점수 입력");
                    int kor = scanner.nextInt();
                    System.out.print("영어점수 입력");
                    int eng = scanner.nextInt();
                    System.out.print("수학점수 입력");
                    int math = scanner.nextInt();

                    Student student = new Student(name, kor, eng, math);
                    list.add(student);
                    break;
                }
                case 2: // 2. 전체 출력
                    for (Student current : list) {
                        System.out.printf("이름: %s 국어: %d 영어: %d 수학: %d 총점: %d 평균: %f\n"
                                , current.name
                                , current.kor
                                , current.eng
                                , current.math
                                , current.total
                                , current.avg
                        );
                    }
                    break;
                case 3:
                    System.out.print("검색할 사람의 이름 : ");
                    String searchName = scanner.next();
                    Student target = findStudent(searchName);
                    System.out.printf("이름: %s 국어: %d 영어: %d 수학: %d 총점: %d 평균: %f\n"
                            , target.name
                            , target.kor
                            , target.eng
                            , target.math
                            , target.total
                            , target.avg
                    );
                    break;
                case 4:
                    System.out.print("수정할 사람의 이름 : ");
                    String updateName = scanner.next();
                    System.out.print("수정할 내용은? 1.국어 2.영어 3.수학 : ");
                    int updateSubject = scanner.nextInt();
                    target = findStudent(updateName);
                    switch (updateSubject){
                        case 1:
                            System.out.print("국어점수 수정: ");
                            int newScore = scanner.nextInt();
                            target.kor = newScore;
                            break;
                        case 2:
                            System.out.print("영어점수 수정: ");
                            newScore = scanner.nextInt();
                            target.eng = newScore;
                            break;
                        case 3:
                            System.out.print("수학점수 수정: ");
                            newScore = scanner.nextInt();
                            target.math = newScore;
                            break;
                    }
                    target.CalculateScore();
                    break;
                case 5:
                    System.out.print("삭제할 사람의 이름 : ");
                    String deleteName = scanner.next();
                    target = findStudent(deleteName);
                    list.remove(target);
                    break;
                case 6:
                    System.out.println("종료");
                    break OUT;
            }
        }
    }
}
