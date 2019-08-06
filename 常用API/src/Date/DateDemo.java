package Date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        function_3();
    }

    /*
    * Date类方法setTime(long)传递毫秒值
    * 毫秒值转成日期对象
    *
    * Tue Aug 06 11:48:48 GMT+08:00 2019
    * Thu Jan 01 08:00:00 GMT+08:00 1970
    * */
    public static  void function_3()
    {
        Date date = new Date();
        System.out.println(date);

        date.setTime(0);
        System.out.println(date);
    }

    /*
    * Date类方法 getTime() 返回值long
    * 将Date表示的日期转成毫秒值
    * 日期和毫秒值的转换
    *
    * 1565063143699
    */
    public static  void function_2()
    {
        Date date = new Date();
        long time  = date.getTime();
        System.out.println(time);
    }

    /*
     * Date类的long参数构造方法
     * 传递毫秒值，转成对应的日期对象
     *
     * Thu Jan 01 08:00:00 GMT+08:00 1970
     */

    public static  void function_1()
    {
        Date date = new Date(0);
        System.out.println(date);
    }

    /*
     * Date类空参数构造方法
     * 获取到的是当前操作系统的时间和日期
     *
     * Tue Aug 06 11:32:40 GMT+08:00 2019
     */
    public static void function()
    {
        Date date  = new Date();
        System.out.println(date);
    }
}
