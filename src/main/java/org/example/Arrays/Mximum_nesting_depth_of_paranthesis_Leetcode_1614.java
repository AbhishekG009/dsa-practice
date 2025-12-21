package org.example.Arrays;

public class Mximum_nesting_depth_of_paranthesis_Leetcode_1614 {

    public static void main(String[] args) {
       String  s = "(1+(2*3)+((8)/4))+1";
        System.out.println(Paranthesis(s));

    }

    public static int Paranthesis(String s)
    {

        int MaxOpen = 0;
        int CurrentOpen =0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)== '(')
            {
                CurrentOpen++;
            }
            else if(s.charAt(i) == ')')
            {
                CurrentOpen--;
            }
            MaxOpen = Math.max(MaxOpen,CurrentOpen);
        }
        return MaxOpen;
    }

}
