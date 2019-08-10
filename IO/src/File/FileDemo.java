package File;

import java.io.File;
import java.io.IOException;

/*
* java中把文件和目录都封装成File对象
*
*  文件 file
*  目录 directory
*  路径 path
* */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        function4();
    }

    /*
    * 获取功能
    *   String getName()   获取路径中的最后部分的名字
    *   long length()    获取路径所表示文件的字节数
    *   File   getAbsoluteFile()    返回File对象，获取绝对路径
    *   File getParentFile()        返回File对象，获取父路径
    *
    *   String[] list() 获取封装路径中的文件和文件夹名 ，返回只有名字
    *   File[] listFiles() 获取封装路径中的文件和文件夹名 ，返回全路径
    *   File[] listRoots() //获取系统中的所有根目录:C、D、E之类的
    * */
    private static void function4() {
        File file1 = new File("F:\\GitHub\\java");
        String name = file1.getName();
        System.out.println(name);    //  java

        long length = file1.length();
        System.out.println(length);   //  4096

        File file2 = new File("src");
        System.out.println(file2.getAbsoluteFile());  // F:\GitHub\Java\IO\src
        System.out.println(file1.getParentFile());  //  F:\GitHub

        String[] str = file1.list();
        File[] fileArr = file1.listFiles();
        File[] rootArr = file1.listRoots();

        for(String s : str){
            System.out.println(s);
        }
        for(File s : fileArr){
            System.out.println(s);
        }
        for(File s : rootArr){
            System.out.println(s);
        }

    }

    /*
    * 判断功能
    *   boolean exists()   判断File构造方法中封装路径是否存在
    *   boolean isDirectory()   判断File构造方法中封装的路径是不是文件夹
    * */
    private static void function3() {
        File file = new File("src");
        System.out.println(file.exists());    // true
        System.out.println(file.isDirectory());  //true
        System.out.println(file.isFile());  //true
    }


    /*
    * File类的增删功能：
    *   boolean createNewFile()  创建文件
    *   boolean mkdirs()   创建文件夹      已经存在,不再创建，返回false
    *   boolean delete()   删除文件或者文件夹  <直接从硬盘中删除>
    * */
    private static void function2() throws IOException {
        File file1 = new File("F:\\a.txt");
        boolean b1 = file1.createNewFile();
        System.out.println(b1);

        File file2 = new File("F:\\aaa");
        boolean b2 = file2.mkdirs();
        System.out.println(b2);

        File file3 = new File("F:\\a.txt");
        boolean b3 = file3.delete();
        System.out.println(b3);
    }

    /*
    * 三种构造方法
    * */
    private static void function1() {
        //File(String pathname)  传递路径名
        File file1 = new File("F:\\GitHub\\java");

        // File(String parent,String child)  传递字符串父路径,字符串子路径
        File file2 = new File("F:","GitHub\\java");

        //File(File parent,String child)  传递File类型父路径,字符串子路径
        File parent = new File("F:");
        File file3 = new File(parent,"GitHub\\java");

        System.out.println(file1.toString()+"  "+file2+"  "+file3);
    }

    /*
    * File类静态成员变量
    * */
    private static void function() {
        String separator = File.pathSeparator;  //;  分号,路径分隔符
        String separator2 = File.separator;  //  \   向右，目录名称分割
        System.out.println(separator+"  "+separator2);
    }
}
