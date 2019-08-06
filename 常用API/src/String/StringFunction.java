package String;

public class StringFunction {
    public static void main(String[] args) {
        function4();
    }

    /*
    * boolean equals(Object obj) 判断字符串中的字符是否完全相同
    * boolean equalsIgnoreCase(String s)  判断字符串中的字符是否相同,忽略大小写
    * */
    private static void function4()
    {
        String str1 = "abc";
        String str2 = "Abc";
        boolean a = str1.equals(str2);
        boolean b = str1.equalsIgnoreCase(str2);
        System.out.println(a);
        System.out.println(b);
    }

    /*
    * char[] toCharArray() 将字符串转成字符数组
    * 此功能和String构造方法相反
    * */
    private static void function3()
    {
        String str = "abc";
        char[] ch = str.toCharArray();
        for(int i = 0;i<str.length();i++ )
        {
            System.out.println(ch[i]);
        }
    }
    /*
    * byte[] getBytes() 将字符串转成字节数组
    * 此功能和String构造方法相反
    * */
    private static void function2()
    {
        String str = "abc";
        byte[] bytes = str.getBytes();
        for(int i = 0 ; i < bytes.length ; i++){
            System.out.println(bytes[i]);
        }
    }
    /*
    * boolean startsWith(String prefix)  判断一个字符串是不是另一个字符串的前缀
    * boolean endsWith(String prefix)  判断一个字符串是不是另一个字符串的后缀
    *  boolean contains (String s)   判断一个字符串中,是否包含另一个字符串
    * */
    private static void function1()
    {
        String str = "shanzha,nihao,buhao";
        boolean a = str.startsWith("sha");
        boolean b = str.startsWith("ss");
        boolean c = str.endsWith("hao");
        boolean d = str.endsWith("haa");
        boolean e = str.contains(",nihao,");
        boolean f = str.contains(",hao,");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
    /*
    *  String substring(int beginIndex,int endIndex) 获取字符串的一部分
    *  包含头，不包含尾
    * */
    private static void function() {
        String str = "nizhenbang";
        str = str.substring(1,5);
        System.out.println(str);

        String str2 = "HelloWorld";
        str2 = str2.substring(1);
        System.out.println(str2);
    }
}
