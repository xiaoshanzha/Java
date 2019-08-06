package Date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
*  对日期进行格式化(自定义)
*  对日期格式化的类 java.text.DateFormat 抽象类,
*  实际使用是子类 java.text.SimpleDateFormat
*
*   String => Date   parse
*   Date => String   format
*/
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        function1();
    }


    /*
    * 格式化步骤：
    *   1.创建SimpleDateFormat对象
    *       在类构造方法中,写入字符串的日期格式 (自己定义)
    *   2. SimpleDateFormat调用方法format对日期进行格式化
    *       String format(Date date) 传递日期对象,返回字符串
    *   模式：
    *       yyyy    年份
    *       MM      月份
    *       dd      月中的天数
    *       HH       0-23小时
    *       mm      小时中的分钟
    *       ss      秒
    *
    *       2019年08月06日 11点57分钟44秒
    */
    public static void function(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分钟ss秒");
        String date = sdf.format(new Date());
        System.out.println(date);
    }

   /*
   * DateFormat类方法 parse() 将字符串转成Date对象
   *
   * Thu Jun 01 00:00:00 GMT+08:00 2000
   * */
    public static void function1() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2000-6-1");
        System.out.println(date);
    }
}
