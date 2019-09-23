package edu.tjufe.demo01;

import java.util.ArrayList;
import java.util.Collections;

public class DemoFightinglandlord2 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        ArrayList<String> pokerBox = new ArrayList<String>();
        ArrayList<String> colors = new ArrayList<String>();
        ArrayList<String> numbers = new ArrayList<String>();
        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");

        for(int i = 2;i<=10;i++){
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        for (String color : colors) {
            for(String number : numbers){
                String card = color+number;
                pokerBox.add(card);
            }
        }
        pokerBox.add("小☺");
        pokerBox.add("大☠");
        Collections.shuffle(pokerBox);
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();
        for(int i = 0;i<pokerBox.size();i++){
            String card = pokerBox.get(i);
            if(i>=51){
                dipai.add(card);
            } else {
                if(i%3==0){
                    player1.add(card);
                }else if(i%3==1){
                    player2.add(card);
                }else{
                    player3.add(card);
                }
            }
        }
        System.out.println("令狐冲："+player1);
        System.out.println("田伯光："+player2);
        System.out.println("绿竹翁："+player3);
        System.out.println("底牌："+dipai);
        long end = System.currentTimeMillis();
        System.out.println("运行时间为："+(end-begin));
    }
}
