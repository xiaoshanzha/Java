package ThreadPool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    //call方法返回线程任务执行完毕后的结果
    public String call() {
        return Thread.currentThread().getName()+"aa";
    }
}
