package String;

public class StringTest {
    public static void main(String[] args) {
        getStringCount("helloqinqin,qinqinnizhenbang,shineqinqin","qin");
        toConvert("hello,Xiu~Xiu~Xiu");
        getCount("SsdFdf354GS45");
    }

    /*
    * 获取一个字符串中另一个字符串出现的次数
    *
    * 步骤：
    *   indexof找到字符串中第一次出现的索引
    *   索引+被找字符串长度截取字符串
    * */
    private static void getStringCount(String str,String key) {
        int count = 0;
        int index = 0;

        //开始循环找,条件,indexOf==-1 字符串没有了
        while((index = str.indexOf(key)) != -1)
        {
            count++;
            //截取新串
            str = str.substring(index+key.length());
        }
        System.out.println(count);
    }

    /*
    * 将字符串的首字母转成大写，其余为小写
    * 获取首字母，charAt(0),substring(0,1);  toUpperCase()
    * 获取剩余字符串，substring(1),  toLowerCase()
    * */
    public static void toConvert(String str)
    {
        String first = str.substring(0,1).toUpperCase();
        String after = str.substring(1).toLowerCase();
        System.out.println(first + after);
    }

    /*
    * 获取字符串中大小写字母、数字的个数
    * */
    public static void getCount(String str)
    {
        int up = 0;
        int low = 0;
        int num = 0;

        for(int i = 0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(c >='A' && c <='Z'){
                up++;
            }else if( c >= 97 && c <= 122){
                low++;
            }else if( c >= '0' && c <='9'){
                num++;
            }
        }
        System.out.println(up);
        System.out.println(low);
        System.out.println(num);
    }
}
