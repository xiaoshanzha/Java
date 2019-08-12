package Wait_And_Notify;

/**
 *  输入线程，
 *  一次赋值：张三  男
 *  下一次赋值 lisi  nv
 */
public class input implements Runnable{
    private Resource r;

    public input(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        int i = 0;
        while(true){
            synchronized (r){
                //对标记进行判断
               if(r.flag){
                   try{
                       //赋值完就等待，打印完再次赋值
                       r.wait();
                   }catch (Exception ex){}
               }

               if(i%2==0){
                   r.name = "张三";
                   r.sex = "男";
               }else{
                   r.name = "lisi";
                   r.sex = "nv";
               }
               //赋值完将对方线程唤醒，标记改为true
               r.flag = true;
               r.notify();
            }
            i++;
        }
    }
}
