package org.example.Stacks;

import java.util.Stack;

public class ReverseStack_recursively {

    public static void displayReverse(Stack<Integer> st)
    {
        if(st.isEmpty())
            return;

        int top = st.pop();
        System.out.println(top);
        displayReverse(st);
        st.push(top);
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayReverse(st);
    }
}
