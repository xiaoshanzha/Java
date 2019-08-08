package Generic_泛型.GenericTestDemo;

/*
* 将酒店的员工，厨师,服务员,经理,分别存储到3个集合中
* 定义方法 ：可以同时遍历3集合,并且同时,可以调用工作方法
* */


import java.util.ArrayList;
import java.util.Iterator;

public class FinalTest {

    public static void main(String[] args) {
        ArrayList<ChuShi> cs = new ArrayList<ChuShi>();
        ArrayList<FuWuYuan> fwy = new ArrayList<FuWuYuan>();
        ArrayList<JingLi> jl = new ArrayList<JingLi>();

        cs.add(new ChuShi("黄花鱼","厨师001"));
        cs.add(new ChuShi("黄花菜","厨师002"));

        fwy.add(new FuWuYuan("健力宝","服务员001"));
        fwy.add(new FuWuYuan("小酸奶","服务员002"));

        jl.add(new JingLi("荣嚒嚒","管理001",250.1)) ;
        jl.add(new JingLi("冯嚒嚒","管理002",250.2)) ;

        itera(jl);
        itera(fwy);
        itera(cs);
    }

    /*
    * 方法：可以同时遍历3集合,遍历三个集合的同时,可以调用工作方法 work();
    * 泛型的限定：父类固定为Employee，但子类很多
    *  ? extends Employee 限制的是父类  上限限定，可以传递Employee及他的子类对象
    *  ? super   Employee 限定的是子类  下限限定，可以传递Employee及他的父类对象
    * */
    private static void itera(ArrayList<? extends Employee> array) {
        Iterator<? extends Employee> it = array.iterator();
        while(it.hasNext()){
            Employee e = it.next();

            /*
            * 判断是否实现了VIP接口
            * */
            if(e instanceof VIP)
            {
                ((VIP) e).services();
            }
            e.work();
        }
    }
}
