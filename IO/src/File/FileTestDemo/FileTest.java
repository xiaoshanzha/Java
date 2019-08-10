package File.FileTestDemo;
import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("F:\\Github\\java");

        function1(file);
    }

    /*
    * 实现目录的全遍历
    * */
    private static void function1(File file) {
        //先对所在目录进行遍历
     //   File[] fileArr = file.listFiles();

        //实现目录的全遍历,获取目录下所有java文件
        File[] fileArr = file.listFiles(new GetAllJavaFilter());
        for(File f:fileArr){
            //判断f的路径是不是文件夹
            if(f.isDirectory()){
                //如果是文件夹，再次遍历
                function1(f);
            }else {
                System.out.println(f);
            }
        }
    }

    /*
    * 文件获取过滤
    * */
    private static void function(File file) {
        /*
        * listFiles(FileFilter filter) 遍历目录并过滤
        * 传递FileFilter接口的实现类
        * */
        File[] fileArr = file.listFiles(new MyFilter());
        for(File f : fileArr){
            System.out.println(f);
        }
    }
}
