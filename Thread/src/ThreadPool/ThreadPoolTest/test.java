package ThreadPool.ThreadPoolTest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
* 使用callable接口，进行求和计算
* 两个线程。1个计算1+...+100,  另一个计算1+...10
* 多线程异步计算
* */
public class test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es  = Executors.newFixedThreadPool(2);
        Future<Integer> f1 = es.submit(new GetSumCallable(100));
        Future<Integer> f2 = es.submit(new GetSumCallable(10));
        System.out.println(f1.get());
        System.out.println(f2.get());
        es.shutdown();
    }
}
