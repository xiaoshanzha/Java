package Synchronized;

/*
* 利用同步解决线程安全
*   当多个线程同时对全局变量执行写的操作时，需要考虑线程同步，否则可能影响线程安全
*
* 此例演示多个窗口同时卖票：
*   线程对象模拟窗口，Runnable接口子类模拟票
* */
public class SynchronizedDemo {
    public static void main(String[] args) {

    //    question();
    //    solveByBlock();
    //    solveByWay();
        solveBylock();
    }

    //同步锁解决线程安全问题
    private static void solveBylock() {
        TicketsByLock t = new TicketsByLock();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
    }

    /*
    * 同步代码块解决问题
    * */
    private static void solveByBlock() {
        TicketsByBlock t = new TicketsByBlock();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
    }

    private static void solveByWay() {
        TicketsByWay t = new TicketsByWay();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
    }

    /*
    * 出现线程安全问题。已卖100张，有的窗口还可以卖票
    * */
    private static void question() {
        //创建Runnable接口实现类票对象
        Tickets t = new Tickets();
        //创建3个窗口，进行售票
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
    }

}
