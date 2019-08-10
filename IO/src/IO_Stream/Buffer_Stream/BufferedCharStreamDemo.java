package IO_Stream.Buffer_Stream;

import java.io.*;

/*
* BufferedReader 字符输入流缓冲流 ，继承Reader
* BufferedWriter 字符输出流缓冲流 . 继承Writer
* */
public class BufferedCharStreamDemo {
    public static void main(String[] args) throws IOException {
        buread();
    //    buwrite();
    }

    /*
    * BufferedReader(Reader r) 传递任意字符输入流FileReader、InputStreamReader
    * String readLine() 读取文本行,不包括转行
    *       读到文件的末尾，则返回null
    * */
    private static void buread() throws IOException {
        BufferedReader br = new
                BufferedReader(new FileReader("F:\\buff.txt"));
        String s = null;
        int numline = 0;
        while((s = br.readLine())!=null) {
            numline++;
            System.out.println(numline+" "+s);
        }
        br.close();
    }
    /*
    * BufferedWriter(Writer w)传递任意字符输出流FileWriter、OutputStreamReader
    * 特有方法：void newLine() 写换行，具有平台无关性
    * */
    private static void buwrite() throws IOException {
        BufferedWriter bfw = new
                BufferedWriter(new FileWriter("F:\\buff.txt"));
        bfw.write("nihao");
        bfw.newLine();
        bfw.flush();

        bfw.write("水杯");
        bfw.newLine();
        bfw.flush();

        bfw.close();

    }
}
