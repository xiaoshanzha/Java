package IO_Stream.Char_Stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符流复制文件,采用数组
 * */
public class Copy {
    public static void main(String[] args) {
        FileWriter fw = null;
        FileReader fr = null;
        try{
            fw = new FileWriter("E:\\aa.txt");
            fr = new FileReader("F:\\GameDownload\\aa.txt");
            char[] c = new char[1024];
            int len = 0;
            while((len = fr.read(c))!=-1){
                fw.write(c,0,len);
                fw.flush();
            }
        }catch (IOException io){
            System.out.println(io);
            throw new RuntimeException("复制失败");
        }finally {
            try{
                if(fw!=null)
                    fw.close();
            }catch(IOException ex){
                throw new RuntimeException("释放资源失败");
            }finally{
                try{
                    if(fr!=null)
                        fr.close();
                }catch(IOException ex){
                    throw new RuntimeException("释放资源失败");
                }
            }
        }
    }
}
