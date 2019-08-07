package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* 每种集合的底层的数据结构不同,例如ArrayList是数组,LinkedList底层是链表,
* 用迭代器定义了统一的判断元素和取元素的方法
*
* Iterator接口，找实现类
* ArrayList 重写方法 iterator(),返回了Iterator接口的实现类的对象
* */
public class IteratorDemo {
    public static void main(String[] args) {
        function();
    }

    private static void function() {
        Collection<String> coll = new ArrayList<String>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        // 用迭代器对集合ArrayList中的元素进行取出
        // 调用集合的iterator()方法取出Iterator接口的实现类的对象it
        Iterator<String> it = coll.iterator();


        // 接口实现类对象,调用方法hasNext()判断集合中是否有元素
        // 接口实现类对象,调用方法next()取出集合中的元素
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
