package Synchronized;

public class TicketsByWay implements Runnable{
    private int ticket = 100;
    private int already = 0;

    @Override
    public void run() {
        while(true){
            method();
        }
    }

    /*
    * 同步方法
    * public synchronized void method(){可能产生线程安全问题的代码}
    * */
    public synchronized void method(){
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
