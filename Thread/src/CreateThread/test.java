package CreateThread;

public class test {
    public static void main(String[] args) {
        for(int i =0;i<10;i++){
            System.out.println("主线程正在执行： "+i);
        }
    //    ByThread();
    //    ByRunnable();
        ByNiThread();
        ByNiRun();
    }

    /*
    * 线程匿名内部类实现Runnable接口
    * */
    private static void ByNiRun() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "正在执行：" + i);
                }
            }
        };
        new Thread(r).start();
    }

    /*
    * 线程匿名内部类使用
    * Thread
    * */
    private static void ByNiThread() {
        new Thread(){
            @Override
            public void run() {
                for(int i= 0;i<10;i++){
                    /*
                    Thread.currentThread()获取当前线程对象Thread
                    getName()返回该线程的名称
                     */
                    System.out.println(Thread.currentThread().getName()+"正在执行："+i);
                }
            }
        }.start();
    }

    /*
    * 通过实现Runnable()接口
    *    定义类实现Runnable接口，重写run()方法，创建Thread类对象，
    *    将Runnable接口的子类对象传给Thread类，调用start()
    * 好处：避免了单继承的局限性，将线程分为线程对象和任务两部分
    * */
    private static void ByRunnable() {
        Runnable rn = new MyRunnable();
        //创建线程对象，类型为Runnable接口类型
        Thread td1 = new Thread(rn);
        Thread td2 = new Thread(rn);
        td1.start();
        td2.start();
    }

    /*
    * 通过继承Thread类创建线程
    *   创建线程对象，调用start()方法，开启线程，jvm调用run()方法
    * */
    private static void ByThread(){
        MyThread mt = new MyThread("线程1");
        mt.start();
    }

}
