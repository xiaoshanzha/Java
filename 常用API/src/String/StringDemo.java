package String;

/*
* 字符串是一个常量，一旦创建，不能改变
* */
public class StringDemo {
    public static void main(String[] args) {
        function2();
    }

    /*
    * 字符串定义方式2个；
    * 直接 = ； 使用String类的构造方法
    * */
    private static void function() {
        String str1 = new String("abc");
        String str2 = "abc";
        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1==str2);//引用数据类型,比较对象的地址 false
        System.out.println(str1.equals(str2));//true,因为String重写了equals;
    }

    /*
    * 构造方法：String(char[] value) 传递字符数组
    * */
    private static void function2() {
        char[] ch = {'a','b','c','d','e','f'};
        String s = new String(ch);
        System.out.println(s);

        String s1 = new String(ch,1,4);
        System.out.println(s1);
    }
    /*
    * 构造方法  String(byte[] bytes)  传递字节数组
    * */
    private static void function1() {

        byte[] bytes = {97,98,99,100};
        //调用String类的构造方法,传递字节数组
        String s = new String(bytes);
        System.out.println(s);

        byte[] bytes1 ={65,66,67,68,69};
        //调用String构造方法,传递数组,传递2个int值
        String s1 = new String(bytes1,1,3);
        System.out.println(s1);
    }

}
