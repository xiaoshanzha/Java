package DeadLock;

public class LockA {
    //外类不能new,只能调用自己的静态成员变量
    private LockA(){}

    //保证A对象的唯一性
    public static final LockA locka = new LockA();
}
