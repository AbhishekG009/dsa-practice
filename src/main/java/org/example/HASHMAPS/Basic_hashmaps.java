package org.example.HASHMAPS;

import java.util.HashMap;

public class Basic_hashmaps {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Raghav",76);
        map.put("Himanshi" ,83);
        map.put("Amritanshu",13);
        map.put("Raghav",76);

        System.out.println(map);
    }
}
