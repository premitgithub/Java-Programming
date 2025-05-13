package Greedy_algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class Fractional_Knapsack_33
{
    public static void main(String[] args)
    {
        int[] value={60,100,120};
        int[] weight={10,20,55};
        int capacity=50;
        double val=0.0;
        double[][] ratio =new double[value.length][2];
        //0th col=index, 1st col=ratio
        for(int i=0;i<value.length;i++)
        {
            ratio[i][0]=i;
            ratio[i][1]=(double)value[i]/weight[i];
        }
        //array sorted in ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
        for(int i= value.length-1;i>=0;i--)
        {
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx])
            {
                //include full value
                capacity=capacity-weight[idx];
                val=val+value[idx];
            }
            else
            {
                //include fractional value
                val=val+(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println("The amount for the knapsack is = " + val);
    }
}
