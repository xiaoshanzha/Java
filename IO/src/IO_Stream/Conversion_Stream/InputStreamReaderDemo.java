package IO_Stream.Conversion_Stream;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  转换流
 *  InputStreamReader类继承Writer类，
 *  字节流 --> 字符流  可使用指定的字符编码表
 *  读取字节按指定的编码表转为字符
 * */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        readGbk();
        readUtf();
    }

    private static void readUtf() throws IOException {
        //创建输入流，传递文本文件
        FileInputStream fis = new FileInputStream("F:\\utf.txt");
        //创建转换流对象，构造方法传输入流
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
        char[] c = new char[1024];
        int len = isr.read(c);
        System.out.println(new String(c,0,len));
        isr.close();
    }

    /*
    * 读取GBK文件
    * */
    private static void readGbk() throws IOException {
        //创建输入流，传递文本文件
        FileInputStream fis = new FileInputStream("F:\\gbk.txt");
        //创建转换流对象，构造方法传输入流
        InputStreamReader isr = new InputStreamReader(fis);
        char[] c = new char[1024];
        int len = isr.read(c);
        System.out.println(new String(c,0,len));
        isr.close();
    }
}
