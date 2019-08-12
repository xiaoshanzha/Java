package Synchronized;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* 使用接口Lock,替换同步代码块，实现线程的安全
* lock() 获取锁
* unlock() 释放锁
* 实现类ReentrantLock
* */
public class TicketsByLock implements Runnable{
    private int ticket = 100;
    private int already = 0;


    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true){

            //调用Lock接口lock方法获取锁
            lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(1);
                        System.out.println(Thread.currentThread().getName() +
                                "窗口正在卖票，已卖" + ++already + "张,还剩" + --ticket + "张");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        //释放锁
                        lock.unlock();
                    }
                }
        }
    }
}
