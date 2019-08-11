package IO_Stream.Serialization;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    /*
    * private transient int age;
    * 序列化对象时，不需要进行序列化的属性可用transient瞬态关键字修饰
    * */

    /*
    * 自定义序列号，编译器就不会计算序列号了
    * 反序列化对象时，如果对象所属class文件在序列化之后进行了修改，则反序列化会出现异常
    *      原因： 该类的序列化版本号与流中读取类描述的版本号不一致
    */
    private static final long serialVersionUID = 1231457534534L;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "name="+name+",age="+age;
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
