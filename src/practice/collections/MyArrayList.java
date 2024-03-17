package practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임 워크 (List, Set, Map)
        List<String> list = new ArrayList();

        // 추가
        list.add("이채원");
        list.add("마동석");
        list.add("임영웅");
        list.add("유재석");

        // 확인
        System.out.println(list.get(3));
        System.out.println(list.size()); // 4

        // 제거
        list.remove("임영웅");
        System.out.println(list.size()); // 3

        // 정렬
        System.out.println(list); // [이채원, 마동석, 유재석]
        Collections.sort(list);
        System.out.println(list); // [마동석, 유재석, 이채원]

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list); // [이채원, 유재석, 마동석]

        for (String name : list)
            System.out.println(name);

        // 변경
        list.set(1, "신세경");
        System.out.println(list.get(1));

        // 확인
        System.out.println(list.indexOf("이채원"));
        System.out.println(list.contains("유재석") ? "포함O" : "포함X");

        // 전체 삭제
        list.clear();
        System.out.println(list.isEmpty() ? "지움" : "못지움");
    }
}
