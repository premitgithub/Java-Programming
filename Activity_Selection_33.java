package Greedy_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activity_Selection_33
{
    public static void main(String[] args)
    {
        int[] start={5,8,0,1,3,5};
        int[] end={7,9,6,2,4,9};
//        int maxAct=0;
//        ArrayList<Integer> ans=new ArrayList<>();
//
//        //first activity
//        maxAct=1;
//        ans.add(0);
//        int lastEnd=end[0];
//        for(int i=1;i<start.length;i++)
//        {
//            if(start[i]>=lastEnd)
//            {
//                maxAct++;
//                ans.add(i);
//                lastEnd=end[i];
//            }
//        }
//        System.out.println("Max = "+maxAct);
//        for(int i=0;i<ans.size();i++)
//        {
//            System.out.print("A"+ans.get(i)+" ");
//        }
//        System.out.println();
        // if end time is not sorted we create a 2D array to sort
        int[][] activities=new int[end.length][3];
        for(int i=0;i<start.length;i++)
        {
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        // sort a column of 2D array
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        maxAct=1;
        ans.add(activities[0][0]);
        int lastEnd=activities[0][2];
        for(int i=1;i<start.length;i++)
        {
            if(activities[i][1]>=lastEnd)
            {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
            }
        }
        System.out.println("Max = "+maxAct);
        for(int i=0;i<ans.size();i++)
        {
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
