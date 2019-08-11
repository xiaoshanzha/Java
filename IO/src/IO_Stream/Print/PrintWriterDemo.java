package IO_Stream.Print;

import java.io.*;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        function();
    }

    private static void function() throws IOException {
        File file = new File("F:\\person.txt");
        //打印流，传递File对象的输出目的，也可以为String文件名，还可以是输出流对象
        PrintWriter pw = new PrintWriter(file);
        /*
        *   FileWriter fw = new FileWriter("F:\\person.txt");
        *   pw = new PrintWriter(fw);
        * */

        pw.println("asd");
        pw.println(100);   // 原样输出 100
        pw.write(100);  // 走的是码表 d
        pw.close();
    }
}
