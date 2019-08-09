package Map;

import Set.Person;
import java.util.Map;
import java.util.HashMap;

/*
* 使用HashMap集合,存储自定义的对象
*
* 自定义类作为键时，需要重写hashCode()和equals()方法，来保证键的唯一性
* */
public class hashMapDemo {
    public static void main(String[] args) {
        function();
    }

    private static void function() {

        HashMap<Person,String> map = new HashMap<Person,String>();
        map.put(new Person("小花",16),"山西");
        map.put(new Person("红领巾",12),"北京");

        for(Map.Entry<Person,String> entry : map.entrySet()){
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"..."+value);
        }

        for(Person key : map.keySet()){
            String value = map.get(key);
            System.out.println(key+"..."+value);
        }
    }
}
