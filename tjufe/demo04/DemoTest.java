package edu.tjufe.demo04;

import java.io.*;
import java.nio.Buffer;
import java.util.HashMap;

public class DemoTest {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("D:\\IdeaProjects\\basic-code\\day04-code\\src\\edu\\tjufe\\demo04\\in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\IdeaProjects\\basic-code\\day04-code\\src\\edu\\tjufe\\demo04\\out.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\.");
            map.put(arr[0], arr[1]);
        }
        for (String key : map.keySet()) {
            String value = map.get(key);
            line = key + "." + value;
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
