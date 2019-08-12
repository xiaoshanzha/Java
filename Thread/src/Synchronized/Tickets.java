package Synchronized;

public class Tickets implements Runnable{
    private int ticket = 100;
    private int already = 0;

    @Override
    public void run() {
        while(true){
            if(ticket>0){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+
                        "窗口正在卖票，已卖"+ ++already +"张,还剩"+ --ticket+"张");
            }
        }
    }
}
