package Wait_And_Notify;


/*
* 多个线程用不同方式处理同一资源
*       利用等待唤醒机制可保证资源的有效利用
* 实现赋值一个，打印一个
* */
public class TestDemo {
    public static void main(String[] args) {
        Resource r = new Resource();
        input in = new input(r);
        output out = new output(r);

        Thread tin = new Thread(in);
        Thread tout = new Thread(out);

        tin.start();
        tout.start();
    }
}
