package IO_Stream.Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
* Properties类是集合类，继承HashTable，实现Map接口
*   结合IO对象使用，实现数据的持久化存储
*   该集合没有泛型，键值都是字符串
* */
public class PropretiesDemo {
    public static void main(String[] args) throws IOException {
     //   function();
     //   store();
        read();
    }

    //将集合内容存储到文件
    private static void store() throws IOException {
        Properties pro = new Properties();
        pro.setProperty("aa","1");
        pro.setProperty("bb","2");
        pro.setProperty("cc","3");

        //创建流
        FileWriter fw = new FileWriter("F:\\pro.properties");
        //把集合中的数据存储到流对应的文件中并关闭
        pro.store(fw,"save");   //后面参数为所描述的信息
        fw.close();
    }
    //读取文件内容，保存到集合
    private static void read() throws IOException {
        Properties pro = new Properties();
        //创建流对象， FileReader流对象可以完成中文读取操作
        FileInputStream fos = new FileInputStream("F:\\pro.properties");
        pro.load(fos);
        fos.close();
        System.out.println(pro);
    }

    /*
    * setProperty()方法进行元素的添加，实则是调用Hashtable的put()方法
    * getProperty()方法，根据键获取值
    * */
    private static void function() {
        Properties pro = new Properties();
        pro.setProperty("aa","1");
        pro.setProperty("bb","2");
        pro.setProperty("cc","3");
        System.out.println(pro);  //{aa=1, bb=2, cc=3}

        String va = pro.getProperty("bb");
        System.out.println(va);  //2
    }
}
