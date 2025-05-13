package Greedy_algorithm;

import java.util.Arrays;

public class MinimumSumAbs_difference_33
{
    public static void main(String[] args)
    {
        int[] A={1,2,4};
        int[] B={9,2,0};

        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff=0;
        for(int i=0;i<A.length;i++)
        {
            minDiff+=Math.abs(A[i]-B[i]);
        }
        System.out.println("Sum of minimum difference of all the pairs = "+minDiff);
    }
}
