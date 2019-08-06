package Calendar;


import java.util.Calendar;
import java.util.Date;

/*
* 抽象类，使用它的子类对象
*
* Calendar类写了静态方法getInstance()，直接返回了子类的对象
* 不需要直接 new 子类的对象，通过静态方法直接获取
* */
public class CalendarDemo {
    public static void main(String[] args) {
     //   Calendar c = Calendar.getInstance();
     //   System.out.println(c);
        function2();
    }

    /*
    * Calendar类的方法getTime()
    * 将日历对象转成Date日期对象
    * */
    private static void function2()
    {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }
    /*
    * Calendar类方法add 日历的偏移量,
    * add(int field, int value)进行整数的偏移
    * */
    private static void function1() {
        Calendar c = Calendar.getInstance();
        //让日历中的天数向前偏移1天； 2019年8月7日
        c.add(Calendar.DAY_OF_MONTH,1);
        get_y_m_d(c);
    }

    /*
    * Calendar类的set方法 设置日历 set(int field,int value)
    * field 设置的是哪个日历字段 value 设置的具体数值
    * */
    private static void function() {
        Calendar c = Calendar.getInstance();
        //月份为 0-11；
        //  c.set(Calendar.MONTH,9);
        c.set(2100,5,1);
        get_y_m_d(c);
    }

    /*
     * Calendar类的get方法 获取日历字段的值 int get(int) 参数int,
     * 获取的哪个日历字段 返回值,就表示日历字段的具体数值
     * */
    private static void get_y_m_d(Calendar c)
    {
        // 获取年份
        int year = c.get(Calendar.YEAR);
        // 获取月份
        int month = c.get(Calendar.MONTH) + 1;
        // 获取天数
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + day + "日");
    }
}
