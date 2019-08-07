package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
* Collection 接口中的方法是集合所有实现类必须拥有的方法
* ArrayList implements List
* List extends Collection
*
* 以下为  ：使用Collection接口的实现类
* */
public class CollectionDemo {
    public static void main(String[] args) {
        function();
    }

    /*
    * Collection接口的方法：
    *
    * void clear() 清空集合中的所有元素，集合本身依然存在
    *
    * boolean contains(Object o) 判断对象是否存在于集合中,存在返回true
    *
    * Object[] toArray() 将集合中的元素,转成一个数组中的元素, 集合转成数组
    *                    返回的是一个类型为Object的存储对象的数组
    *
    * boolean remove(Object o)移除集合中指定的元素
    * */
    private static void function() {

        // 接口多态的方式调用
        Collection<String> coll = new ArrayList<String>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll); //[aaa, bbb, ccc]

        boolean b = coll.contains("cc");
        System.out.println(b);  //false

        Object[] objs = coll.toArray();
        System.out.println(Arrays.toString(objs)); //[aaa, bbb, ccc]

        boolean bb = coll.remove("bbb");
        System.out.println(bb);  //true
        System.out.println(coll);  // [aaa, ccc]

        coll.clear();
        System.out.println(coll);  //[]

    }
}

/*
* Java中三种长度的表现形式
*   数组.length
*   字符串.length()
*   集合.size()
* */
