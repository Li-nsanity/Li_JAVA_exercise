package edu.tjufe.demo02;

import java.util.*;

public class DemoFightingLandLord {
    public static void main(String[] args) {
        List<String> colors = List.of("♣", "♦", "♠", "♥");
        List<String> number = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "大王");
        map.put(1, "小王");
        Integer key = 2;
        for (int i = 0; i < number.size(); i++) {
            for (int j = 0; j < colors.size(); j++) {
                String value = colors.get(j) + number.get(i);
                map.put(key, value);
                key++;
            }
        }
        //System.out.println(map);
        List<Integer> list = new ArrayList<>();
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer, String> i : set) {
            list.add(i.getKey());
        }
        Collections.shuffle(list);
        //System.out.println(list);
        List<String> player1 = new ArrayList<>();
        List<String> player2 = new ArrayList<>();
        List<String> player3 = new ArrayList<>();
        List<String> back = new ArrayList<>();
        List<Integer> num1 = new ArrayList<>();
        List<Integer> num2 = new ArrayList<>();
        List<Integer> num3 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i >= 51) {
                Integer it = list.get(i);
                back.add(map.get(it));
            } else if (i % 3 == 0) {
                Integer it = list.get(i);
                num1.add(it);
                //player1.add(map.get(it));
            } else if (i % 3 == 1) {
                Integer it = list.get(i);
                num2.add(it);
                //player2.add(map.get(it));
            } else if (i % 3 == 2) {
                Integer it = list.get(i);
                num3.add(it);
                //player3.add(map.get(it));
            }
        }
        Collections.sort(num1);
        //System.out.println(num1);
        Collections.sort(num2);
        Collections.sort(num3);
        for (Integer i : num1) {
            player1.add(map.get(i));
        }
        for (Integer j : num2) {
            player2.add(map.get(j));
        }
        for (Integer k : num3) {
            player3.add(map.get(k));
        }

        System.out.println("玩家一：" + player1);
        System.out.println("玩家二：" + player2);
        System.out.println("玩家三：" + player3);
        System.out.println("底牌是：" + back);


    }
}
