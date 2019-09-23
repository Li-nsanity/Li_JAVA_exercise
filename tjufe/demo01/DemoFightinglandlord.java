package edu.tjufe.demo01;

import java.util.*;

public class DemoFightinglandlord {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        ArrayList<String> huase = new ArrayList<>();
        huase.add("黑桃");
        huase.add("红心");
        huase.add("梅花");
        huase.add("方片");
        ArrayList<String> xuhao = new ArrayList<>();
        xuhao.add("2");
        xuhao.add("A");
        xuhao.add("K");
        xuhao.add("Q");
        xuhao.add("J");
        xuhao.add("10");
        xuhao.add("9");
        xuhao.add("8");
        xuhao.add("7");
        xuhao.add("6");
        xuhao.add("5");
        xuhao.add("4");
        xuhao.add("3");
        ArrayList<String> pai = new ArrayList<>();
        for (int i = 0; i < huase.size(); i++) {
            for (int j = 0; j < xuhao.size(); j++) {
                String temp1 = huase.get(i);
                String temp2 = xuhao.get(j);
                String temp = temp1 + temp2;
                pai.add(temp);
            }
        }
        pai.add("大王");
        pai.add("小王");
        Collections.shuffle(pai);
        Iterator<String> it = pai.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
        System.out.println("");
        ArrayList<String> member1 = new ArrayList<>();
        ArrayList<String> member2 = new ArrayList<>();
        ArrayList<String> member3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < pai.size(); i++) {
            if(i>=51){
                String tempd = pai.get(i);
                dipai.add(tempd);
            }else{
                if(i%3==0){
                    String tempm1 = pai.get(i);
                    member1.add(tempm1);
                }else if(i%3==1){
                    String tempm2 = pai.get(i);
                    member2.add(tempm2);
                }else if(i%3==2){
                    String tempm3 = pai.get(i);
                    member3.add(tempm3);
                }
            }
        }
        System.out.println("=============");
        System.out.println("玩家一的牌面是："+member1);
        System.out.println("玩家二的牌面是："+member2);
        System.out.println("玩家三的牌面是："+member3);
        System.out.println("玩家四的牌面是："+dipai);
        long end = System.currentTimeMillis();
        System.out.println("运行时间为："+(end-begin));
    }

}
