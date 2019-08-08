package Set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
* Set接口：元素不能重复，并且没有索引
*
* 实现类：HashSet
* 特点：无序集合，存和取的顺序不同，无索引，元素不能重复
*       底层数据结构为哈希表
* 哈希表：根据对象的数据结合相应的算法计算出所该存放的位置。
* */
public class HashSetDemo {
    public static void main(String[] args) {
        function1();
    }

    /*
    * HashSet存放原则：hashCode()+ equals()
    *   根据Object类中的hashCode()方法计算出存放位置，
    *   当两个对象计算出的结果一样，则出现哈希冲突
    *   调用对象的equals()方法，比较两个对象是不是同一个对象，
    *   若是，则不存放；否则，存入表中
    *
    *   存放自定义的对象时，就必须重写这两个方法，建立比较方式
    * */
    private static void function1() {
        Set<String> set = new HashSet<String>();
        set.add(new String("aa"));
        set.add(new String("aa"));
        set.add(new String("bb"));
        set.add(new String("bb"));
        System.out.println(set); // [aa, bb]

        Set<Person> per = new HashSet<Person>();
        per.add(new Person("二师兄",60));
        per.add(new Person("二师兄",60));
        per.add(new Person("老猪",80));
        per.add(new Person("老猪",80));

        /*
        * 方法重写前：hashCode()每次计算的都是不同的整数：
        *       [二师兄 is 60, 二师兄 is 60, 老猪 is 80, 老猪 is 80]
        * 重写后 ：
        *       [老猪 is 80, 二师兄 is 60]
        */
        System.out.println(per);
    }

    /*
    * 访问里面的元素只可以用iterator()和foreach
    * */
    private static void function() {
        Set<String> set = new HashSet<String>();
        set.add("aa");
        set.add("bb");
        set.add("cc");
        set.add("dd");

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for(String  s : set){
            System.out.println(s);
        }
    }


}
