package Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) throws ParseException {
     function();
    }

    /*
    * 利用Calendar进行闰年的判断：
    * 将日历设置到指定年份的3月1日,add向前偏移1天,获取天数,29则为闰年
    * */
    private static void function1() {
        Calendar c = Calendar.getInstance();
        c.set(2016,2,1);
        c.add(Calendar.DAY_OF_MONTH,-1);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }

    /*
    * 计算两个日期之间相差多少天
    * 将两个日期变成毫秒值,相减
    * */

    private static void function() throws ParseException {
        System.out.println("请输入日期 格式 YYYY-MM-dd");
        String onedayString = new Scanner(System.in).next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //调用方法parse,字符串转成日期对象
        Date onedayDate = sdf.parse(onedayString);

        Date nowDate = new Date();
        long onedaySecond = onedayDate.getTime();
        long nowdaySecond = nowDate.getTime();
        long second = nowdaySecond-onedaySecond;

        if(second < 0)
        {
            System.out.println(-(second/1000/60/60/24));
        }
        else
        {
            System.out.println(second/1000/60/60/24);
        }
    }
}
