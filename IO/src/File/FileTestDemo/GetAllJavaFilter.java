package File.FileTestDemo;

import java.io.File;
import java.io.FileFilter;

public class GetAllJavaFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {

        //判断获取的是目录,直接返回true
        if(pathname.isDirectory())
            return true;
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
