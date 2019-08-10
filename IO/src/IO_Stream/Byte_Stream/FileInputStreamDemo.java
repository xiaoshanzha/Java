package IO_Stream.Byte_Stream;

import java.io.FileInputStream;
import java.io.IOException;

/*
* InputStream 类为抽象类 字节输入流，子类有FileInputStream...
* */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        function1();
    }

    /*
    * 读取文件，int read(byte[] b) 读取字节数组
    * 返回的int值为读取到有效的字节数
    * */
    private static void function1() throws IOException {
        FileInputStream fis = new FileInputStream("F:\\aa.txt");
        //创建1kb的字节数组，提高读取效率
        byte[] b = new byte[1024];

        int len = 0;
        while ((len = fis.read(b))!=-1){
            //将有效长度的字节数组以字符串形式输出
            System.out.print(new String(b,0,len));
        }
        fis.close();
    }


    /*
    * 进行文件的读取，一个字节
    * */
    private static void function() throws IOException {
        FileInputStream fis = new FileInputStream("F:\\aa.txt");
        int len = 0;
        //读取一个字节，返回读取字节的int值，若结束，返回-1
        while((len = fis.read())!=-1){
            System.out.print((char)len);
        }
        fis.close();
    }
}
