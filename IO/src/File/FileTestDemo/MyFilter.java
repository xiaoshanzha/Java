package File.FileTestDemo;

import java.io.File;
import java.io.FileFilter;

/*
*  自定义过滤器
*  实现FileFilter接口,重写抽象方法
* */
public class MyFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        /*
        * pathname为文件的全路径
        * 判断,如果是java文件,返回true,否则返回false
        * */
        return pathname.getName().endsWith(".java");
    }
}
