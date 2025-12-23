package org.example.Stacks;

import java.util.Stack;

public class PushElementAtPerticularIndex {
    public static void main(String[] args) {

            //insert at bottom
            Stack<Integer> st_original = new Stack<>();
            st_original.push(10);
            st_original.push(20);
            st_original.push(30);
            st_original.push(40);
            st_original.push(50);


            int new_element = 50;
            int pos =2;
            Stack<Integer> st_temp = new Stack<>();
            while(st_original.size() > pos)
            {
                st_temp.push(st_original.pop());
            }
            //till here our posisition in original stack is empty , so we can push new element at that position

            st_original.push(new_element);
            while(st_temp.size() > 0)
            {
                st_original.push(st_temp.pop());
            }

            System.out.println(st_original);
        }
    }

