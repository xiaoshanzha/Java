package Generic_泛型.GenericTestDemo;

/*
* 经理类
* 属于员工的一种，没有服务VIP的功能
* 但自己有奖金属性
* */
public class JingLi extends Employee {

    private double money;

    public JingLi() {
    }

    public JingLi(String name, String id, double money) {
        super(name, id);
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public void work() {
        System.out.println(getName()+"管理其他员工");
    }
}
