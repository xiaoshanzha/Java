package Integer;


/*
* Integer类，封装基本数据类型int
* 将字符串转成基本数据类型int
* */
public class IntegerDemo {
    public static void main(String[] args) {
        function3();
    }


    /*
    * 静态成员变量
    * MAX_VALUE   所能表示的最大值
    * MIN_VALUE
    *
    * 静态成员方法：
    * 十进制转成二进制  toBinarString(int)
    * 十进制转成八进制  toOctalString(int)
    * 十进制转成十六进制  toHexString(int)
    * */
    private static void function3(){
        //获得Integer的范围
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE);  //-2147483648

        System.out.println(Integer.toBinaryString(4));
        System.out.println(Integer.toOctalString(99));
        System.out.println(Integer.toHexString(69));
    }

    /*
    * 构造方法：Integer (String s)
    * 将构造方法中的字符串,转成基本数据类型,调用方法,非静态的, intValue()
    * */
    private static void function2()
    {
        Integer in = new Integer("100");
        int i = in.intValue();
        System.out.println(i);  //100
    }

    /*
    * 将基本数据类型 int 变成字符串
    *
    * int ==> String
    * 1.任何类型+"" 变成String类型
    * 2.Integer类中的静态方法toString()
    *
    * toString(int ,int 进制), 将int整数,转成指定进制数
    * */
    private static void function1(){
        int i = 3;
        String s = i+"";
        System.out.println(s+1);  //31

        String s1 = Integer.toString(5,2);
        System.out.println(s1);  //101
    }

    /*
    * Integer类中静态方法 parseInt(String s) 返回基本数据类型
    *
    * Integer类静态方法parseInt(String s, int radix)
    * radix : 表示进制
    * */
    private static void function() {
        int i = Integer.parseInt("100");
        System.out.println(i/5);  //20

        //将二进制“110”转换成10进制
        int m = Integer.parseInt("100",2);
        System.out.println(m); // 4
    }


}
