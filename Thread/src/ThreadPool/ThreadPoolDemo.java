package ThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


/*
* 线程池：容纳多个线程的容器，其中的线程可以反复使用
*   解决线程生命周期开销问题及资源不足问题
* */
public class ThreadPoolDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
   //     ThreadPoolByRunnable();
        ThreadPoolByCallable();
    }

    /*
     * Callable接口使用线程池
     * 可抛出异常
     * */
    private static void ThreadPoolByCallable() throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        //Future接口，用来记录线程执行完毕返回的结果
        Future<String> f = es.submit(new MyCallable());
        System.out.println(f.get());
    }

    /*
    * Runnable接口使用线程池
    * */
    private static void ThreadPoolByRunnable() {
        /*
        * Executors 线程池创建工厂类
        * ExecutorService 线程池类
        *
        * 创建包含两个线程的线程池对象,返回的是接口
        * */
        ExecutorService service = Executors.newFixedThreadPool(2);
        //调用接口实现类对象的submit方法提交线程任务
        service.submit(new MyRunnable());
        service.submit(new MyRunnable());
        service.submit(new MyRunnable());
        //关闭线程
        service.shutdown();
    }
}
