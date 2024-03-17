package practice.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("상추");
        set.add("쌈장");
        set.add("삼겹살");
        set.add("깻잎");
        set.add("소금");
        System.out.println("----------------------------");
        for (String s : set) {
            System.out.println(s);
        }

        // 확인
        if (set.contains("삼겹살")) {
            System.out.println("출발");
        } else {
            System.out.println("삼겹살 사야함");
        }

        // iterator
        System.out.println("----------------------------");
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // 삭제
        set.remove("삼겹살");
        set.clear();
        System.out.println(set.isEmpty() ? "다 삼" : "아직 덜 삼");

        System.out.println("----------------------------");
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);

        setB.add(1);
        setB.add(3);
        setB.add(5);

        setA.addAll(setB);
        System.out.println(setA); // [1, 2, 3, 5]

        setA.removeAll(setB);
        System.out.println(setA); // [2]
    }
}
