package IO_Stream.Buffer_Stream;

import java.io.*;

/*
* 使用缓冲区流对象复制文本文件
* 复制字符用：reader、Writer
* 复制字节用：InputStream、OutputStream
* */
public class BufferCopy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("F:\\buff.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\buff.txt"));
        String s = null;
        //读取文本行，读一行写一行
        while((s=br.readLine())!=null){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
