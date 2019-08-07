package BigNumber;

import java.math.BigInteger;

/*
* 超级大的整数运算
* 超过long取值范围整数,封装成BigInteger类型的对象
* */
public class BigIntegerDemo {
    public static void main(String[] args) {
        function();
    }

    /*
    * 构造时传递的字符串没有长度限制
    *
    * 调用对象的四则运算方法时，结果也只能是BigInteger对象
    * */
    private static void function() {
        BigInteger b = new BigInteger("1234254368465846668465547634168451684568645684564564435634");
        BigInteger bb = new BigInteger("6668465547634168451684568645684564564435634342235");

        System.out.println(b);
        System.out.println(bb);

        //计算 b + bb 对象的和
        BigInteger bigAdd = b.add(bb);
        System.out.println(bigAdd);

        //计算 b - bb 对象的差
        BigInteger bigSub = b.subtract(bb);
        System.out.println(bigSub);

        //计算 b * bb 对象的积
        BigInteger bigMul = b.multiply(bb);
        System.out.println(bigMul);

        //计算 b / bb 对象的商
        BigInteger bigDiv = b.divide(bb);
        System.out.println(bigDiv);
    }
}
