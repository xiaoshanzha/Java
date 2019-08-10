package IO_Stream.Char_Stream;

import java.io.FileReader;
import java.io.IOException;

/*
* Reader 字符输入流，抽象类，子类有 FileReader...
* */
public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("F:\\aa.txt");
        //读取字符数组
        char[] c = new char[1024];
        int len = 0;
        while((len = fr.read(c))!=-1){
            System.out.println(new String(c,0,len));
        }
    }
}
