package StringBuffer;

public class StringBufferDemo {
    public static void main(String[] args) {
        function3();
    }

    /*
    * replace(int start,int end, String str)
    * 将指定的索引范围内的所有字符,替换成新的字符串
    *
    * reverse()  将缓冲区中的字符反转
    *
    * String  toString()
    * 将可变的字符串缓冲区对象,变成不可变String对象
    * */
    private static void function3()
    {
        StringBuffer buffer = new StringBuffer();
        buffer.append("asdadf");
        buffer.replace(1,4,"W");
        System.out.println(buffer);  //aWdf

        buffer.reverse();
        System.out.println(buffer);  //fdWa

        String s = buffer.toString();
        System.out.println(s);  //fdWa
    }

    /*
    * insert(int index,任意类型)
    * 将任意类型数据,插入到缓冲区的指定索引上
    * */
    private static void function2()
    {
        StringBuffer buffer = new StringBuffer();
        buffer.append("abcdef");

        buffer.insert(3, 9.5);
        System.out.println(buffer);  //abc9.5def
    }
    /*
    * delete : 删除缓冲区字符
    * */
    private static void function1()
    {
        StringBuffer buffer  = new StringBuffer();
        buffer.append("asasfaf");
        buffer.delete(1,5);
        System.out.println(buffer); //aaf
    }
    /*
    * append , 将任意类型的数据添加进缓冲区
    * 调用者是谁，返回值就是谁；
    * */
    private static void function() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(123).append('a').append("nihao").append(true);
        System.out.println(buffer);    //123anihaotrue
    }
}
