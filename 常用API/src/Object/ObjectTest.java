package Object;

public class ObjectTest {
    public static void main(String[] args) {
        testEquals();
        testToString();
    }

    private static void testToString() {

        Person p = new Person("王五",20);
        System.out.println(p);  //重写前： Object.Person@73035e27
    }

    private static void testEquals() {
        Person p1 = new Person("李四",20);
        Person p2 = new Person("张三",20);

        //Person对象p1,调用父类的方法equals,进行对象的比较
        boolean b = p1.equals(p2);
        System.out.println(b);  // 方法重写前为false，比较的是对象的内存地址
    }
}
