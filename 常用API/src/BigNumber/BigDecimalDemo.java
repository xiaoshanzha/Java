package BigNumber;

import java.math.BigDecimal;

/*
* 超级大型的浮点数据,提供高精度的浮点运算, BigDecimal
*
* 一般浮点数四则运算时，结果不够精确
* 原因 ：计算机二进制中,表示浮点数不精确造成
* */
public class BigDecimalDemo {
    public static void main(String[] args) {
        function();
    }

    private static void function() {
        BigDecimal b1 = new BigDecimal("0.09");
        BigDecimal b2 = new BigDecimal("0.06");

        //加
        BigDecimal bigAdd = b1.add(b2);
        System.out.println(bigAdd);

        //减
        BigDecimal bigSub = b1.subtract(b2);
        System.out.println(bigSub);

        // 乘
        BigDecimal bigMul = b1.multiply(b2);
        System.out.println(bigMul);

         /*
         * 除
         * divide(BigDecimal divisor, int scale, int roundingMode)
         * int scale : 保留几位小数
         * int roundingMode : 保留模式
         *
         *   static int ROUND_UP  向上+1
         *   static int ROUND_DOWN 直接舍去
         *   static int ROUND_HALF_UP  >= 0.5 向上+1
         *   static int ROUND_HALF_DOWN   > 0.5 向上+1 ,否则直接舍去
         * */
        BigDecimal b3 = new BigDecimal("0.12342");
        BigDecimal b4 = new BigDecimal("100");
        BigDecimal bigDiv = b3.divide(b4,10,BigDecimal.ROUND_HALF_UP);
        System.out.println(bigDiv);
    }
}
