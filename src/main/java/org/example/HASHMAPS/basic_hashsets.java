package org.example.HASHMAPS;

import java.util.HashSet;

public class basic_hashsets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(10);
        set.add(-8);
        System.out.println(set);
        System.out.println(set.contains(10));
        System.out.println(set.contains(500));

    }
}
