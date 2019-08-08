package List;

/*
* List接口继承Collection接口
* 有很多实现类：ArrayList,LinkedList
* 特点：有序，有索引，元素可以重复
*
* 特有方法：带有索引
* 注意：带有索引的操作，应防止越界的问题
* */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        function1();
    }

    /*
    * 迭代器并发修改异常： java.util.ConcurrentModificationException
    *       遍历的过程中，使用了集合的方法修改了集合的长度
    * */
    private static void function1() {
        List<String> list = new ArrayList<String>();
        list.add("aa");
        list.add("bb");
        list.add("cc");

        /*
        * 迭代器获取集合中的元素，并判断是否有“bb”对象
        * 若有，集合添加元素“BB”
        * */
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            if(s.equals("bb")) {
                list.add("BB");
            }
            System.out.println(s);
        }
    }

    /*
    * add(int index, E)    将元素插入到列表的指定索引上
    * remove(int index)    移除指定索引上的元素   返回被删除之前的元素
    * set(int index, E)    修改指定索引上的元素   返回被修改之前的元素
    * */
    private static void function() {
        List<String> list = new ArrayList<String>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        System.out.println(list);  //[aa, bb, cc, dd]

        list.add(1,"ee");
        System.out.println(list); // [aa, ee, bb, cc, dd]

        list.remove(2);
        System.out.println(list);  // [aa, ee, cc, dd]

        list.set(0,"ww");
        System.out.println(list);  // [ww, ee, cc, dd]
    }


}
