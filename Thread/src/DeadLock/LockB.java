package DeadLock;

public class LockB {
    private LockB(){}

    public static final LockB lockb = new LockB();
}
