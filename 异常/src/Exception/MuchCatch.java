package Exception;

/*
* 处理异常时，多个catch写在一块：
*   catch的括号中写的是异常类的类名，有前后顺序之分
*
*   越高级的父类，写在下面(如果高级的写在上面，则可以捕获一切，下面的catch将失去作用)
*   eg:
*       NullPointerException extends RuntimeException extends Exception
* */

public class MuchCatch {
    public static void main(String[] args) {
        int[] arr=null;
        try {
            function(arr);
        }catch (NullPointerException ex){

        }catch (java.lang.Exception ex){

        }

    }

    private static void function(int[] a)throws NullPointerException, java.lang.Exception {
        if(a==null){
            throw new NullPointerException();
        }
        if(a.length==0){
            throw new java.lang.Exception();
        }
    }
}
