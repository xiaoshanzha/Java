package ForEach;

import java.util.ArrayList;
import java.util.List;

/*
* 增强for循环格式：
*      for(数据类型 变量名 ： 数组或集合){
*
*      }
* */
public class ForEachDemo {
    public static void main(String[] args) {
        function();
    }

    /*
    * 好处：方便
    * 弊端：没有索引，不能操作容器里面的元素
    * */
    private static void function() {
        int[] arr = {1,3,2};
        for(int i : arr){
            System.out.println(i);
        }

        /*
        * 遍历时，也可以调用对象的方法
        * */
        String[] str = {"abc","asdd","cb"};
        for(String s : str){
            System.out.println(s.length()); //3，4，2
        }

        /*
        * 也可以遍历自定义类型
        * */
        ArrayList<Person> array = new ArrayList<Person>();
        array.add(new Person("aa",20));
        array.add(new Person("bb",18));
        for(Person p : array){
            System.out.println(p);
        }
    }
}
