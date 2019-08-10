package IO_Stream.Byte_Stream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 异常处理 ：try catch finally
* */
public class TryExcepyion {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream("m:\\bb.txt");
            fos.write(97);
        }catch (IOException io){
            System.out.println(io);
            throw new RuntimeException("文件写入失败");
        }finally {
            //进行文件的关闭,流对象建立失败则不需要关闭，引发异常
            try{
                if(fos!=null) {
                    fos.close();
                }
            }catch (IOException io){
                throw new RuntimeException("关闭资源失败");
            }
        }
    }
}
