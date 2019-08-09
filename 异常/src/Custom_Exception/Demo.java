package Custom_Exception;

public class Demo {
    public static void main(String[] args) {
        int ave = getAve(60,60,60,40,-12);
        System.out.println(ave);
    }

    private static int getAve(int...score) {
        int sum = 0;
        for(int s:score){
            if(s<0){
                throw new FuShuException("该成绩出现错误"+s);
            }
            sum = sum+s;
        }
        return sum;
    }
}
