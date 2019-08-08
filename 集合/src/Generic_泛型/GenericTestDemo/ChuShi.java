package Generic_泛型.GenericTestDemo;

/*
* 厨师类
*  员工的一种，具有额外服务的功能
*  继承Employee,实现VIP接口
* */
public class ChuShi extends Employee implements VIP {

    public ChuShi() {

    }

    public ChuShi(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println(getName()+"厨师正在做饭");
    }

    @Override
    public void services() {
        System.out.println(getName()+"厨师优先做菜");
    }
}
