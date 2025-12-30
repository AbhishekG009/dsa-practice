package org.example.HASHMAPS;

import java.util.HashSet;

public class Find_max_number_of_string_pairs {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String rev = reverse(words[i]);
            if (set.contains(rev)) {
                count++;
                set.remove(rev);
            } else {
                set.add(words[i]);
            }
        }
        return count;
    }

    public String reverse(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();

    }

    public static void main(String args[])
    {
        String[] words = {"ab", "ba", "cd", "dc", "ee"};

        Find_max_number_of_string_pairs obj =
                new Find_max_number_of_string_pairs();

        System.out.println(obj.maximumNumberOfStringPairs(words));
    }

}
