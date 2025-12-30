package org.example.HASHMAPS;

import java.sql.SQLOutput;
import java.util.HashSet;

public class HashSet_iterate {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(43);
        set.add(90);
        set.add(65);

        for(int ele: set)
        {
            System.out.println(ele+" ");
        }
    }

}
