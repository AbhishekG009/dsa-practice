package org.example.Arrays;

public class Missing_in_Array_optimised {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        System.out.println(missing(arr));
    }

    public static int missing(int [] arr)
    {
        int n = arr.length;
        int XORAll = 0;
        int XORArr = 0;

        for(int i=1;i<=n;i++)
        {
            XORAll ^= i;
        }

        for(int i=0;i<n-1;i++)
        {
            XORArr ^= arr[i];
        }
        return XORAll ^ XORArr;
    }

}
