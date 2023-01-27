package streams;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> empMap = new HashMap<>();
        empMap.put(1001, "Sachin");
        empMap.put(1002, "Rahul");
        empMap.put(1003, "Dinesh");
        empMap.put(1004, "Rohit");

        for (Map.Entry<Integer, String> m : empMap.entrySet()) {
            System.out.println(m.getKey() + "---" + m.getValue());
        }
    }
}
