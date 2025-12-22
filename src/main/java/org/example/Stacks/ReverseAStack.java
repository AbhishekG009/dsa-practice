package org.example.Stacks;

import java.util.Stack;

public class ReverseAStack {

    public static void main(String[] args) {
        Stack<Integer> st_original = new Stack<>();
        System.out.println(st_original.isEmpty());
        st_original.push(1);
        st_original.push(5);
        st_original.push(10);
        st_original.push(20);

        System.out.println(st_original);

        //reversed
        Stack<Integer>reversed_stack = new Stack<>();
        while(!st_original.isEmpty())
        {
            reversed_stack.push(st_original.pop());
        }

        System.out.println(reversed_stack);
    }
}
//TC OS O(n) as we pop each element from stack and push it to another stack.
