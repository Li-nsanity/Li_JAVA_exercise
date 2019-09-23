package edu.tjufe.demo05;

import java.io.*;
import java.util.ArrayList;

public class DemoTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("唐嫣", 18));
        list.add(new Person("杨幂", 20));
        list.add(new Person("刘诗诗", 19));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\IdeaProjects\\basic-code\\day04-code\\src\\edu\\tjufe\\demo05\\in.txt"));
        oos.writeObject(list);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\IdeaProjects\\basic-code\\day04-code\\src\\edu\\tjufe\\demo05\\in.txt"));
        Object o = ois.readObject();
        ArrayList<Person> list2 = (ArrayList<Person>) o;
        for (Person p : list2) {
            System.out.println(p.toString());
        }
        ois.close();
        oos.close();
    }
}
