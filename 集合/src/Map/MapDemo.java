package Map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
* Map接口的实现类：HashMap
* */
public class MapDemo {
    public static void main(String[] args) {
        function2();
    }

    /*
    * 获取Map集合
    * 步骤：
    *      1.调用map的entrySet()方法将集合中的映射关系对象,存储到Set集合
    *      2.迭代Set集合,Set集合元素是映射关系对象
    *      3.通过映射关系对象方法 getKet, getValue获取键值对
    * */
    private static void function2() {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("猪某",20);
        map.put("西红柿",18);

        Set<Map.Entry<String,Integer>> set = map.entrySet();
        Iterator<Map.Entry<String,Integer>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String,Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "    " + value);
        }
    }

    /*
    * Map集合的遍历
    *   1.调用map集合的keySet()方法，获取所有的键存储到Set集合中
    *   2.遍历Set集合，取出元素，调用map集合的get()方法，获取值
    * */
    private static void function1() {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("猪某",20);
        map.put("西红柿",18);
        map.put("东红柿",11);
        map.put("东红",11);

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key + "    " + value);
        }

        for(String key:set){
            Integer value = map.get(key);
            System.out.println(key + "    " + value);
        }
    }

    /*
    * 将键值对存储到集合中
    * V put(K,V) K 作为键的对象, V作为值的对象
    * 重复的键则将原有的值覆盖
    *
    * V get(K) 通过键对象,获取值对象
    * 如果集合中没有这个键,返回null
    *
    *  V remove(K)   移除集合中的键值对,返回键对应的值
    * */
    private static void function() {
        //键是字符串,值是整数
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("猪某",20);
        map.put("西红柿",18);
        map.put("西红柿",22);
        System.out.println(map);  //{猪某=20, 西红柿=22}

        Integer s = map.get("猪某");
        System.out.println(s);  //20
        Integer z = map.get("猪大爷");
        System.out.println(z);  //null

        Integer v = map.remove("猪某");
        System.out.println(v); //20
        System.out.println(map);  // {西红柿=22}
    }
}
