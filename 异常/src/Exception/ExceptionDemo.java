package Exception;

/*
* Throwable
*   Exception异常，处理掉继续执行
*   RuntimeException异常，不用处理，直接修改程序
*
* 主方法处理收到的异常：
*   1.将异常抛给jvm;  在main 方法后面 +  throws异常类名
*   2.try...catch...finally
*
* */
public class ExceptionDemo {
    public static void main(String[] args) {
        int[] arr = null;
        int i = 0;
        try {
            //里面为可能出现异常的代码
            i = getArray(arr);
        }catch (java.lang.Exception ex){
            //异常的处理
            System.out.println(ex.getMessage()); //对异常的简短描述
            System.out.println(ex.toString()); //对异常的详细描述
            ex.printStackTrace();  //信息最详细，JVM默认调用该方法
        }finally {
            //是否有异常都必须执行
            System.out.println("必须出现！");
        }
        System.out.println(i);
    }

    /*
    * 在方法体里面用throw抛出异常：
    *       throw 后面必须new一个异常的对象，是Exception或者其子类， 抛给调用者
    *
    * 方法的后面应用throws来声明该方法可能出现异常
    *       throws后面写异常类的类名
    * */
    private static int getArray(int[] arr) throws java.lang.Exception {
        if(arr==null){
            //抛出异常
            throw new java.lang.Exception("数组不存在");
        }
        if(arr.length==0){
            throw new java.lang.Exception("数组中没有元素");
        }
        int i  =arr[ arr.length];
        return i;
    }
}
