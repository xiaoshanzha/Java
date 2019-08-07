package Generic_泛型;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;



/*
* 泛型: 指明了集合中存储数据的类型  <数据类型>
* Collection 包中已经涉及
* */
public class GenericDemo {
    public static void main(String[] args) {
        function1();
    }

    /*
    * 泛型的通配符
    * */
    private static void function1(){
        ArrayList<String> array = new ArrayList<String>();
        HashSet<Integer> set = new HashSet<Integer>();

        array.add("123");
        array.add("456");

        set.add(789);
        set.add(890);

        /*
        * 借用Itera()函数对两个集合进行遍历，
        * */
        Itera(array);
        Itera(set);
    }

    /*
    * 要求可以同时迭代两个集合
    * 参数：不能写ArrayList,也不能写HashSet
    *
    * 泛型的通配，可匹配所有的数据类型
    * */
    private static void Itera(Collection<?>coll) {
        Iterator<?> it = coll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    private static void function() {
        ArrayList<Integer> array = new ArrayList<Integer> ();
        array.add(123);
        array.add(456);

        Integer[] i = new Integer[array.size()];
        array.toArray(i);  //集合转成数组
        Integer[] j = i;   //数组可直接用“=”赋值
        for(Integer k : j){
            System.out.println(k);
        }
    }
}
