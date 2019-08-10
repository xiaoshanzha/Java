package IO_Stream.Byte_Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 字节流复制文件,采用数组
* */
public class Copy {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream("F:\\aa.txt");
            fos = new FileOutputStream("E:\\aa.txt");

            byte[] bytes = new byte[1024];
            int len = 0;
            while((len=fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
        }catch (IOException io){
            System.out.println(io);
            throw new RuntimeException("复制失败");
        }finally {
            try{
                if(fos!=null) {
                    fos.close();
                }
            }catch (IOException io){
                throw new RuntimeException("释放资源失败");
            }
        }
    }
}

