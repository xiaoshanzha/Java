package IO_Stream.Buffer_Stream;

import java.io.*;

/*
 * BufferedInputStream 字节输入的缓冲流
 * BufferedOutputStream 字节输出的缓冲流
 * 内部包含了一个缓冲区，通过缓冲区读写，提高IO流的读写速度
 * */
public class BufferedByteStreamDemo {
    public static void main(String[] args) throws IOException {
        input();
        output();
    }

    private static void input() throws IOException {
        //创建字节输入流的缓冲流对象，构造方法中包装字节输入流
        BufferedInputStream bis = new
                BufferedInputStream(new FileInputStream("F:\\buffer.txt"));
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        bis.close();
    }

    private static void output() throws IOException {
        BufferedOutputStream bos = new
                BufferedOutputStream(new FileOutputStream("F:\\buffer.txt"));
        byte[] bytes = "hello".getBytes();
        bos.write(bytes,0,3);
        bos.close();
    }
}
