package Object;

public class Person extends Object{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
    * 方法equals 比较两个对象的内存地址
    * 两个对象,比较地址,没有意义
    * 此处重写为比较age变量；
    * */
    @Override
    public boolean equals(Object obj) {

        // 参数obj接受到是Person对象,才能转型
        // 对obj参数进行类型的向下转型,obj转成Person类型
        if(obj instanceof  Person)
        {
            Person p = (Person)obj;
            return this.age == p.age;
        }
        return false;
    }

    /*
    * 方法中,返回类中所有成员变量的值
    * */
    @Override
    public String toString() {
        return name + age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
