package IO_Stream.Byte_Stream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
*  OutputStream 类为抽象类 字节输出流，子类有FileOutputStream...
* */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        function1();
    }

    /*
    * FileOutputStream类进行文件的续写和换行
    * */
    private static void function1() throws IOException {
        File file = new File("F:\\aa.txt");
        //续写：在构造方法的参数中，加入true
        FileOutputStream fos = new FileOutputStream(file,true);
        //\r\n进行换行
        fos.write("hello\r\n".getBytes());
        fos.write("world".getBytes());
        fos.close();
    }

    /*
    * FileOutputStream类进行文件的写入
    * */
    private static void function() throws IOException {
        /*
        * 构造方法的参数：File  封装的文件  或者  String 文件名字符串
        * 流对象的构造方法，可创建文件，若存在，直接覆盖
        */
        FileOutputStream fos = new FileOutputStream("F:\\aa.txt");

        //写一个字节
        fos.write(65); //A
        //写字节数组
        byte[] bytes = {65,66,67,68};
        fos.write(bytes);  //ABCD
        //写字节数组的一部分，索引1开始，长度为3
        fos.write(bytes,1,3);  //BCD

        //关闭
        fos.close();
    }

}
