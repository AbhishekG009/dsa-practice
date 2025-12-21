package org.example.Arrays;

public class Missing_in_Array_bruteForce_GFG {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        System.out.println(missing(arr));

    }

    public static int missing(int [] arr)
    {
        int n = arr.length;
        for(int num =1; num <= n ;num++)
        {
            boolean found = false;
            for(int i=0;i<n-1;i++)
            {
                if(num ==arr[i])
                {
                    found =true;
                    break;
                }
            }

            if(!found)
            {
                return num;
            }
        }
        return -1;
    }

}
