package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/*
* Map集合嵌套,Map中存的还是Map集合
*
* 中北大学
*    大数据
*       001 小猫
*       002 小狗
*    英语
*       001 小花
*       002 小翠
*
* */
public class MapMapDemo {
    public static void main(String[] args) {
        function();
    }

    private static void function() {
        HashMap<Integer,String> bigdig = new HashMap<Integer,String>();
        HashMap<Integer,String> english = new HashMap<Integer,String>();

        bigdig.put(001,"小猫");
        bigdig.put(002,"小狗");
        english.put(001,"小花");
        english.put(002,"小翠");

        HashMap<String,HashMap<Integer,String>> zhongbei =
                new  HashMap<String,HashMap<Integer,String>>();
        zhongbei.put("大数据",bigdig);
        zhongbei.put("英语",english);

    //    keySetSee(zhongbei);
        enteySetSee(zhongbei);
    }

    /*
    * 利用映射对象访问集合
    * */
    private static void enteySetSee(HashMap<String,HashMap<Integer,String>> zhongbei) {
        //将zhongbei集合的键值对关系对象,存储到Set集合
        Set<Map.Entry<String,HashMap<Integer,String>>> zhuanyeSet = zhongbei.entrySet();
        //使用迭代器迭代Set集合
        Iterator<Map.Entry<String,HashMap<Integer,String>>> zhuanyeIt = zhuanyeSet.iterator();
        while(zhuanyeIt.hasNext()){
            //取出的是键值对关系的对象
            Map.Entry<String,HashMap<Integer,String>> zhuanyeEntry = zhuanyeIt.next();
            String zhuanyeKey = zhuanyeEntry.getKey();
            HashMap<Integer,String> stuMap = zhuanyeEntry.getValue();
            Set<Map.Entry<Integer,String>> stuKeySet = stuMap.entrySet();
            Iterator<Map.Entry<Integer,String>> stuIt = stuKeySet.iterator();
            while (stuIt.hasNext()){
                Map.Entry<Integer,String> stuEntry = stuIt.next();
                Integer stuKey = stuEntry.getKey();
                String stuValue = stuEntry.getValue();
                System.out.println(zhuanyeKey+"  "+stuKey+"  "+stuValue);
            }
        }

        for(Map.Entry<String,HashMap<Integer,String>> zhuanye : zhongbei.entrySet()){
            String zhuanyeKey = zhuanye.getKey();
            HashMap<Integer,String> stuMap = zhuanye.getValue();
            for(Map.Entry<Integer,String> stu : stuMap.entrySet()){
                Integer stuKey = stu.getKey();
                String stuValue = stu.getValue();
                System.out.println(zhuanyeKey+"  "+stuKey+"  "+stuValue);
            }
        }
    }

    /*
    * 利用key值遍历集合
    * */
    private static void keySetSee(HashMap<String,HashMap<Integer,String>> zhongbei) {
        //获取专业名称
        Set<String> zhuanyeKeySet = zhongbei.keySet();
        //迭代Set集合
        Iterator<String> zhuanyeKeyIt = zhuanyeKeySet.iterator();
        while (zhuanyeKeyIt.hasNext()){
            //获取zhongbei集合的键
            String zhuanyeKey = zhuanyeKeyIt.next();
            //获取zhongbei集合的值，值是一个HashMap集合
            HashMap<Integer,String> classMap = zhongbei.get(zhuanyeKey);
            //将所获取键值对的键存储到Set集合
            Set<Integer> stuSet = classMap.keySet();
            Iterator<Integer> stuId = stuSet.iterator();

            while(stuId.hasNext()){
                Integer stuKey = stuId.next();
                String stuValue = classMap.get(stuKey);
                System.out.println(zhuanyeKey + "  " + stuKey +"  "+ stuValue);
            }
        }

        for(String zhuanyeKey : zhongbei.keySet()){
            HashMap<Integer,String> classMap = zhongbei.get(zhuanyeKey);
            for(Integer stuKey:classMap.keySet()){
                String stuValue = classMap.get(stuKey);
                System.out.println(zhuanyeKey+"   "+stuKey+"  "+stuValue);
            }
        }
    }
}
