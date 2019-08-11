package IO_Stream.Commons_IO;


import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.IOException;

public class Conmons_IODemo {
    public static void main(String[] args) throws IOException {
        function1();
    }

    /*
    * FilenameUtils外部工具类
    * */
    private static void function1() {
        //获取文件名的扩展名
        String name = FilenameUtils.getExtension("F:\\person.txt");
        System.out.println(name);  //txt

        //获取文件名
        name = FilenameUtils.getName("F:\\github");
        System.out.println(name);

        //static boolean isExtension(String filename,String extension) 判断后缀是不是extension
        boolean b = FilenameUtils.isExtension("Commons_IODemo.java","java");
        System.out.println(b);
    }

    /*
    * FileUtiles外部工具类操作文件
    * */
    private static void function() throws IOException {
        //读取文本,返回字符串
        String s = FileUtils.readFileToString(new File("F:\\person.txt"));
        System.out.println(s);

        //将字符串直接写到文件中
        FileUtils.writeStringToFile(new File("E:\\person.txt"),"aefas\r\nadasd");

        //复制文件
        FileUtils.copyFile(new File("F:\\person.txt"),new File("d:\\p.txt"));
        //复制文件夹
        FileUtils.copyDirectoryToDirectory(new File("F:\\temp"),new File("E:\\"));
    }}
