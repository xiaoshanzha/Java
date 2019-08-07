package Arrays;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        function();
    }

    private static void function() {
        int[] arr = {744,23,24,67,32,1};

        //对数组进行升序排列
        Arrays.sort(arr);  //[1, 23, 24, 32, 67, 744]

        //二分搜索在数组中查找元素索引 。不存在则返回（- 插入点 - 1）
        int index =  Arrays.binarySearch(arr, 10);
        System.out.println(index);  //-2

        //将数组变成字符串
        String s = Arrays.toString(arr);
        System.out.println(s);
    }
}
