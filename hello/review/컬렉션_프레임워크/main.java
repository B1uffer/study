import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();
        //Map<Key, Value>
        // 병신아 map은 key - value의 쌍으로 이루어진 일종의 배열이다
        // key는 데이터를 구분지어주기 위해 사용되는 것이고 중복 불가
        // value는 key에 매칭되어 있는 데이터로 중복이 된다 병신아

        map.put("a", 1);
        // put(Key, Value);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);

        Set<String> set = map.keySet();

        for(String str : set) {

            System.out.println(str + " : " + map.get(str));
        }

        System.out.println();

        
        Collection<Object> values = map.values();
        
        for(Object obj : values) {

               System.out.println(obj);
                
        }

        System.out.println();

        Set<Map.Entry<String, Object>> set2 = map.entrySet();

        // entrySet() 메서드는 Map 타입에 선언된 Entry라는 타입의 객체를 리턴함
        // Entry 객체에는 하나의 키, 하나의 값이 저장됨
        // getKey(), getValue()를 활용해서 key, value를 가져올 수 있다

        for(Map.Entry<String, Object> entry : set2) {

            System.out.println(entry.getKey() + " : " + entry.getValue());
            
        }

        System.out.println();

        Map<String, Object> map2 = new HashMap<>();
        
        map2.put("a", 1);
        map2.put("b", 2);

        // containsKey, containsValue는 매개변수로 key, value를 넘겨서
        // 데이터가 존재하는지 확인해준다. return은 boolean
        
        System.out.println(map2.containsKey("a"));
        System.out.println(map2.containsKey("c"));
        System.out.println(map2.containsValue(3));
        System.out.println(map2.containsValue(2));

        System.out.println();


        // remove()
        Map<String, Object> map3 = new HashMap<>();

        map3.put("a",1);
        map3.put("b",2);

        System.out.println(map3.size());
        // size 확인 후
        map3.remove("a");
        // map3의 key인 a 데이터를 삭제한다
        System.out.println(map3.size());

        System.out.println();

        // TreeMap() : 정렬되어있는 key들의 배열
        // HashMap의 경우 List와는 다르게 순서가 존재하지 않음 넣는대로 들어감
        // 근데 TreeMap()은 map이 정렬되어있다! 와!
        // 순서는 숫자 > 알파벳 대문자 > 알파벳 소문자 > 한글 순이다
        Map<String,Object> treemap2 = new TreeMap<>();
        
        treemap2.put("A","a");
        treemap2.put("한글","b");
        treemap2.put("1","c");
        treemap2.put("a","d");

        Set<Map.Entry<String,Object>> set3 = treemap2.entrySet();

        for(Map.Entry<String,Object> entry : set3) {

            System.out.println(entry.getKey() + " : " + entry.getValue());
            
        }
    }
}