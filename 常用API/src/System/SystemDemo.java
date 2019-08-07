package System;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        function2();
    }

    /*
    * arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
    * 复制数组
    *
    * Object src, 要复制的源数组
    * int srcPos, 数组源的起始索引
    * Object dest,复制后的目标数组
    * int destPos,目标数组起始索引
    * int length, 复制几个，注意不能超过 （数组长度 - 起始）
    * */
    private static void function2()
    {
        int[] src = {11,22,33,44,55,66};
        int[] desc = {77,88,99};

        System.arraycopy(src,1,desc,1,2);
        System.out.println(Arrays.toString(desc)); // [77, 22, 33]
    }
    /*
    * static void gc()
    * JVM在内存中，收取对象的垃圾
    *
    *
    * static Properties getProperties()
    * 获取当前操作系统的属性
    * */
    private static void function1(){
        new LaJi();
        new LaJi();
        new LaJi();
        new LaJi();
        System.gc();

        System.out.println( System.getProperties() );
    }
    /*
    * static long currentTimeMillis()  获取系统当前毫秒值
    * 可以对程序执行时间进行测试
    *
    * static void exit(0)
    * 退出虚拟机,将所有程序全停止
    * */
    private static void function() {
        long start = System.currentTimeMillis();

        while(true){
            System.out.println("ni zhen bang");
            System.exit(0);
        }

    }
}
