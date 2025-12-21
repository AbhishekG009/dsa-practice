package org.example.Arrays;

import java.util.Arrays;

public class WaveArray_Optimised {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        wave(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void wave(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<n-1;i+=2)
        {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

}
