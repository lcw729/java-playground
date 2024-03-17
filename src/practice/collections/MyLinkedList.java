package practice.collections;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // 추가
        list.add("유재석");
        list.add("조세호");
        list.add("강호동");

        // 조회
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // 추가
        list.addFirst("차은우");
        System.out.println(list.getFirst());
        list.addLast("류준열");
        System.out.println(list.getLast());
        list.add(2, "최우식");

        System.out.println("----------------------------");
        for (String name: list) {
            System.out.println(name);
        }

        // 삭제
        System.out.println("----------------------------");
        list.removeLast();
        list.removeFirst();
        for (String name: list) {
            System.out.println(name);
        }

        // 변경
        list.set(0, "이수근");
    }
}
