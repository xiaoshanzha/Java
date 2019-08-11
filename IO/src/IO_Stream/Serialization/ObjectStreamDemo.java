package IO_Stream.Serialization;

import java.io.*;

/*
* ObjectOutputStream 对象序列化流    写对象，实现序列化
* ObjectInputStream  对象反序列化流  读对象，实现反序列化
*    注： 只支持java.io.Serializable接口对象的读写
*         没有实现该接口无法进行对象的序列化与反序列化
* */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    //    writeObject();
        readObject();
    }

    //对象反序列化
    private static void readObject() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("F:\\person.txt");
        //创建反序列化流，传递字节输入流对象，
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();  //读取对象，每次只能读取一个
        System.out.println(obj);
        ois.close();
    }

    //对象序列化
    private static void writeObject() throws IOException {
        FileOutputStream fos = new FileOutputStream("F:\\person.txt");
        //创建写对象的序列化流对象，创建字节输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Person p = new Person("xiaohong",12);
        Person p1 = new Person("xiaohong",10);
        Person p2 = new Person("xiaohong",11);
        oos.writeObject(p);
        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.close();
    }
}
