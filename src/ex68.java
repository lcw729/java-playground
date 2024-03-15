import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ex68 {
    public static void main(String[] args) {
        // 맵 Map
        // : 키와 값으로 된 데이터 구조
        // : JSON, XML 데이터 구조와 연결 역할
        // : 인덱스 없고 순서 없음

        // 키-문자열 값타입
        Map<String, String> map = new HashMap<>();
        map.put("username", "hong");
        map.put("password", "1234");
        System.out.println(map);

//        System.out.println(map.get("username"));
//        System.out.println(map.get("password"));

        // for each
//        for (String key: map.keySet()){
//            System.out.println(map.get(key));
//        }

        // 이터레이터
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key);
            System.out.println(map.get(key));
//            System.out.println(it.next());
//            System.out.println(map.get(it.next()));
        }
    }
}
