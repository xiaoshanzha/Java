package IO_Stream.Char_Stream;

import java.io.FileWriter;
import java.io.IOException;

/*
* Writer 字符输出流  抽象类，子类有 FileWriter...
* */
public class WriterDemo {
    public static void main(String[] args) throws IOException {
        //参数为 String 或 File
        FileWriter fw = new FileWriter("F:\\aa.txt");

        fw.write(100); //d
        fw.flush();

        //想写数字100的话，需要一个字节一个字节的写
        fw.write(49); // 1
        fw.write(48); // 0
        fw.write(48); // 0
        fw.flush();

        char[] c = {'a','b','c','d'};
        fw.write(c);  //abcd
        fw.flush();

        fw.write(c,1,3);
        fw.flush();  //bc

        fw.write("hello");  //hello
        fw.flush();

        fw.close();
    }
}
