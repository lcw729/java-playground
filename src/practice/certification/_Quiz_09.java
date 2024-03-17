package practice.certification;

import java.util.ArrayList;
import java.util.Iterator;

public class _Quiz_09 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("유재석", "Java"));
        students.add(new Student("조세호", "Python"));
        students.add(new Student("한소희", "Linux"));
        students.add(new Student("이채원", "Java"));

        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            Student student = iter.next();
            if (student.certification.equals("Java")) {
                System.out.println(student.name);
            }
        }
    }
}
