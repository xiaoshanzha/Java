package Integer;

/*
* 了解自动装箱、自动拆箱
* 自动装箱 ：将基本数据类型,直接变成对象
* 自动拆箱 ： 将对象中的数据变回基本数据类型
* */
public class IntegerDemo1 {
    public static void main(String[] args) {
        function1();
    }

    /*
    * 装拆箱题目
    * */
    private static void function1(){

        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i==j);// false 对象地址
        System.out.println(i.equals(j));// true  继承Object重写equals,比较的对象数据

        Integer a = 500;
        Integer b = 500;
        System.out.println(a==b);//false
        System.out.println(a.equals(b));//true

        //数据在byte范围内（<=127）,JVM不会重新new对象
        Integer aa = 127; // Integer aa = new Integer(127)
        Integer bb = 127; // Integer bb = aa;
        System.out.println(aa==bb); //true
        System.out.println(aa.equals(bb));//true
    }
    // 自动装拆箱好处：基本类型和引用类直接运算
    // 坏处：可能出现空指针异常 ：Integer in = null；
    private static void function() {

        //将基本数据类型1直接变成对象
        Integer in = 1;  // Integer in = new Integer(1)
        //in是引用类型，不能和基本类型运算，自动拆箱
        in = in + 1;  //  in + 1 ==> in.inValue() + 1;
        System.out.println(in);  //2
    }
}
