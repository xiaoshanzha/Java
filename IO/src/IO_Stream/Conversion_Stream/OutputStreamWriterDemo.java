package IO_Stream.Conversion_Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
*  OutputStreamWriter类继承Writer类，
*  字符流 --> 字节流  可使用指定的字符编码表
*  将字符串按照指定的编码表转成字节，并写进去
* */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        writeGBk();
        writeUTF();
    }
    /*
    * 文本采用UTF-8形式写入
    * */
    private static void writeUTF() throws IOException {
        //创建字节输出流
        FileOutputStream fos = new FileOutputStream("F:\\utf.txt");
        //创建转换流对象，构造方法绑定字节输出流
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        //转换流写数据
        osw.write("中国");
        osw.close();
    }

    /*
     * 文本采用GBK形式写入
     * */
    private static void writeGBk() throws IOException {
        //创建字节输出流
        FileOutputStream fos = new FileOutputStream("F:\\gbk.txt");
        //创建转换流对象，构造方法绑定字节输出流
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        //转换流写数据
        osw.write("中国");
        osw.close();
    }
}
