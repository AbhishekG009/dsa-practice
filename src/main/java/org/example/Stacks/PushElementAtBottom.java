package org.example.Stacks;

import java.util.Stack;

public class PushElementAtBottom {
    public static void main(String[] args) {
        //insert at bottom
        Stack<Integer> st_original = new Stack<>();
        st_original.push(10);
        st_original.push(20);
        st_original.push(30);
        st_original.push(40);
        st_original.push(50);

        int new_element =50;
        Stack<Integer> st_temp = new Stack<>();
        while(st_original.size() > 0)
        {
            st_temp.push(st_original.pop());
        }

        st_original.push(new_element);
        while(st_temp.size() > 0)
        {
            st_original.push(st_temp.pop());
        }

        System.out.println(st_original);
    }
}
