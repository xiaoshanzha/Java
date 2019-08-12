package DeadLock;

import java.util.Random;

public class MyLock implements Runnable {

    int x = new Random().nextInt();


    @Override
    public void run() {
        while(true){
            if(x%2==0){
                //先进入A同步，在进入B同步
                synchronized (LockA.locka){
                    System.out.println("if-locka");
                    synchronized (LockB.lockb){
                        System.out.println("if-lockb");
                    }
                }
            }
            else {
                //先B再A
                synchronized (LockB.lockb){
                    System.out.println("else-lockb");
                    synchronized (LockA.locka){
                        System.out.println("else-locka");
                    }
                }
            }
            x++;
        }
    }
}
