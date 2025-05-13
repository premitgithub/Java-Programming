package Greedy_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Max_length_chainOfpairs_33
{
    public static void main(String[] args)
    {
        int[][] pairs={{5,24},{39,60},{45,49},{27,40},{50,90}};
        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
        int chainLen=0;
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(pairs[0][0]);
        chainLen=1;
        int end=pairs[0][1];
        for(int i=0;i<pairs.length;i++)
        {
            if(pairs[i][0]>end)
            {
                chainLen++;
                end=pairs[i][1];
            }
        }
        System.out.println("Length of the chain = "+ chainLen);

    }
}
