package Map;

/*
* 实现斗地主的基本功能：
*   1.组合排(游戏中王最大，3最小，使得每张牌有所属编号，进行排序用)
*   2.洗牌
*   3.发牌
*   4.看牌
* */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Final_DouDiZhu {
    public static void main(String[] args) {
        //花色
        ArrayList<String> flower = new ArrayList<String>();
        flower.add("♠");
        flower.add("♥");
        flower.add("♣");
        flower.add("♦");
        //数字
        ArrayList<String> number  = new ArrayList<String>();
        Collections.addAll(number,"3","4","5","6","7","8","9","10","J","Q","K","1","2");

        /*
        * 1.组合牌
        * 定义Map集合，将编号与每张牌对应
        * */
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        int index = 0;
        for(String num:number){
            for(String flow:flower){
                map.put(index++,num+flow);
            }
        }
        map.put(index++,"小王");
        map.put(index++,"大王");

        /*
        * 2.洗牌，首先获取0-53数字的List,进行乱序
        * */
        ArrayList<Integer> cardsList = new ArrayList<Integer>();
        for(int i = 0;i <= 53;i++){
            cardsList.add(i);
        }
        //利用工具类进行乱序
        Collections.shuffle(cardsList);

        /*
        * 3.发牌
        * 三个玩家和底牌;   发的是编号
        * */
        ArrayList<Integer> player1 = new ArrayList<Integer>();
        ArrayList<Integer> player2 = new ArrayList<Integer>();
        ArrayList<Integer> player3 = new ArrayList<Integer>();
        ArrayList<Integer> last = new ArrayList<Integer>();

        for(int i = 0;i<=53;i++){
            if(i>50){
                last.add(cardsList.get(i));
            }
            else if(i%3==0){
                player1.add(cardsList.get(i));
            }
            else if(i%3==1){
                player2.add(cardsList.get(i));
            }
            else if(i%3==2){
                player3.add(cardsList.get(i));
            }
        }
        //对每个人手中的牌序号进行排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);

        //将玩家牌序号与牌对应
        ArrayList<String> splayer1 = new ArrayList<String>();
        ArrayList<String> splayer2 = new ArrayList<String>();
        ArrayList<String> splayer3 = new ArrayList<String>();
        ArrayList<String> slast = new ArrayList<String>();
        for(Integer key : player1){
            splayer1.add(map.get(key));
        }
        for(Integer key : player2){
            splayer2.add(map.get(key));
        }
        for(Integer key : player3){
            splayer3.add(map.get(key));
        }
        for(Integer key : last){
            slast.add(map.get(key));
        }

        //4.看牌
        System.out.println(splayer1);
        System.out.println(splayer2);
        System.out.println(splayer3);
        System.out.println(slast);
    }
}
