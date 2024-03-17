package practice.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

public class MyHashMap {
    public static void main(String[] args) {
        // 맵 (Key, Value)
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        // 데이터 추가
        map.put("유재석", 10);
        map.put("박명수", 20);
        map.put("김종국", 30);

        System.out.println("총 고객 수 : " + map.size());

        // 조회
        System.out.println(map.get("유재석"));

        // 확인
        if (map.containsKey("서장훈")) {
            int point = map.get("서장훈");
            map.put("서장훈", ++point);
        } else {
            System.out.println("서장훈님, 신규 등록");
            map.put("서장훈", 1);
        }

        // 삭제
        map.remove("유재석");
        System.out.println(map.get("유재석"));

        // iterator
        // map.keySet();
        // map.values();
        Iterator iter = map.keySet().iterator();
        while (iter.hasNext()) {
            Object key = iter.next();
            Integer value = map.get(key);
            System.out.println(key + value.toString());
        }
    }
}
