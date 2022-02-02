package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1922876", "Apple Iphone");
        map.put("1922877", "Apple Ipad");
        map.put("2136861", "Samsung Galaxy");
        map.put("2136863", "Samsung Tablet");

        System.out.println("1922877 : " + map.get("1922877"));// Key를 이용해서 value값 찾기

        System.out.println("--------------------");
        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.printf("%s:%s\n", entry.getKey(),entry.getValue());// key 와 value 값 모두를 Entry 객체로 반환
        }

        System.out.println("--------------------");
        for(String s: map.keySet()){
            System.out.printf("%s\n",s);//key 요소만 Set 객체로 반환
        }
        System.out.println("--------------------");
        for(String s : map.values()){
            System.out.printf("%s\n",s);//value 요소만 Collection 타입으로 반환
        }

    }

}