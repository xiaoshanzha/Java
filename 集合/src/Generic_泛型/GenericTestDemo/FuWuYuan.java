package Generic_泛型.GenericTestDemo;

/*
 * 服务员类
 *  员工的一种，具有额外服务的功能
 *  继承Employee,实现VIP接口
 * */

public class FuWuYuan extends Employee implements VIP {
    public FuWuYuan() {
    }

    public FuWuYuan(String name, String id) {
        super(name, id);
    }


    // 抽象方法重写
    @Override
    public void services() {
        System.out.println(getName()+"服务员在上菜并送酒");
    }

    @Override
    public void work() {
        System.out.println(getName()+"服务员上菜");
    }
}
