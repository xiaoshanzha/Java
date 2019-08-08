package List;

import java.util.LinkedList;

/*
* LinkedList : 用链表实现，查询慢，增删快
*
* 提供了大量首尾操作的方法
* */
public class LinkedListDemo {
    public static void main(String[] args) {
        function();
    }

    /*
    * addFirst(E) 添加到链表的开头
    * addLast(E) 添加到链表的结尾
    *
    * E getFirst() 获取链表的开头
    * E getLast() 获取链表的结尾
    *
    * E removeFirst() 移除并返回链表的开头
    * E removeLast() 移除并返回链表的结尾
    * */
    private static void function() {
        LinkedList<String> link = new LinkedList<String>();
        link.addLast("ni zhen bang");
        link.add("aa");
        link.add("bb");
        link.addFirst("ni hao");
        System.out.println(link);   //[ni hao, ni zhen bang, aa, bb]

        System.out.println(link.getFirst()); //ni hao
        System.out.println(link.getLast());  //bb

        System.out.println(link.removeFirst());  //ni hao
        System.out.println(link.removeLast());  //bb
        System.out.println(link);  //[ni zhen bang, aa]

    }
}
