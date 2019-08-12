package Wait_And_Notify;

/*
* 资源类 ，有成员变量：name,sex;
* 两个线程同时操作，一个赋值，一个输出
* */
public class Resource {
    public String name;
    public String sex;

    //false表示还没赋值，此时应该赋值。true表示此时该打印
    public boolean flag = false;
}
