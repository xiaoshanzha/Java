package DeadLock;


/*
* 当线程任务出现多个同步时，如果同步中嵌套了其他同步，则会出现死锁状态
* synchronized （A锁){
*   synchronized （B锁){}
* }
* */
public class DeadLockDemo {
    public static void main(String[] args) {
        MyLock ml = new MyLock();
        Thread t0 = new Thread(ml);
        Thread t1 = new Thread(ml);
        t0.start();
        t1.start();
    }
}
