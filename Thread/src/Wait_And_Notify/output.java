package Wait_And_Notify;

public class output implements Runnable{
    private Resource r;

    public output(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        while(true){
            //两个同步锁必须唯一，才能起作用
            synchronized (r){
                if(r.flag){
                    System.out.println(r.name+"..."+r.sex);
                    //标记改为false,同时唤醒对方线程
                    r.flag = false;
                    r.notify();
                }
                try {
                    r.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

