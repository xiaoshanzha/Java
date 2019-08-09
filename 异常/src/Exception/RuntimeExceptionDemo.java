package Exception;

/*
* 运行异常: 抛出的异常是RuntimeException类,或者他的子类
*
* 特点：方法上不需要声明，调用者也不需要对异常进行处理
* 必须修改,因为一旦发生，后面的代码已失去意义
* */
public class RuntimeExceptionDemo {
    public static void main(String[] args) {
        double s = getArea(-3);
        System.out.println(s);
    }

    private static double getArea(int i) {
        if(i<=0){
            throw new RuntimeException("不存在");
        }
        return i*i*Math.PI;
    }
}
