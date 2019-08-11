package IO_Stream.Print;

import java.io.*;

/*
* 用打印流实现文本的复制
* 读取：BufferedReader 读取文本行
* 写入：PrintWriter
* */
public class Copy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("F:\\person.txt"));
        // 后面的true,表示调用println,printf,format三个方法中的一个,启用自动刷新
        PrintWriter pw = new PrintWriter(new FileWriter("E:\\person.txt"),true);
        String line = null;
        while((line = br.readLine())!=null){
            pw.println(line);
        }
        pw.close();
        br.close();
    }
}
