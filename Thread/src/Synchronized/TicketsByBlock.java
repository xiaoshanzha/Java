package Synchronized;

public class TicketsByBlock implements Runnable{
    private int ticket = 100;
    private int already = 0;

    //定义锁对象
    private Object obj = new Object();

    @Override
    public void run() {
        while(true){
            /*
            * 保证安全，加入同步代码块
            * synchronized （锁对象){可能产生线程安全的代码}
            * */
            synchronized (obj) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() +
                            "窗口正在卖票，已卖" + ++already + "张,还剩" + --ticket + "张");
                }
            }
        }
    }
}
