package org.example.Arrays;

public class Equilibrium_point {
    public static void main(String[] args) {
        int arr[] = {1,2,0,3};
        System.out.println(Equilibrium(arr));
    }
    public static int Equilibrium(int arr[])
    {
        int n = arr.length;
        int sum =0;
        int leftSum =0;
        int rightSum =0;
        for(int i=0;i<n;i++)
        {
            sum = sum+arr[i];
        }
        rightSum = sum;
        for(int i=0;i<n;i++)
        {
           rightSum = rightSum-arr[i];
           if(rightSum == leftSum)
           {
               return i;
           }
           leftSum = leftSum+arr[i];
        }
        return -1;
    }

}
