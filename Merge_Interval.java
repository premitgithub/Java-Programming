package Leetcode;

import java.util.*;
import java.util.Arrays;

public class Merge_Interval
{
    public static void main(String[] args)
    {
        int[][] intervals={{1,4},{4,0}};
        //int[][] intervals={{1,3},{2,8},{6,10},{15,18}};
        merge(intervals);
    }
    public static int[][] merge(int[][] intervals)
    {
        int iLength = intervals.length;
        int jLength = intervals[0].length;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(iLength);
        for (int i = 0; i < iLength; ++i) {
            list.add(new ArrayList(jLength));
            for (int j = 0; j < jLength; ++j) {
                list.get(i).add(intervals[i][j]);
            }
            //Collections.sort(list.get(i));
        }
        System.out.println(list);
        int size=list.size();
        for(int i=1;i<size;i++)
        {
            //System.out.println(list);
            for(int j=1;j<intervals[0].length;j++)
            {
                if(list.get(i-1).get(j-1) > list.get(i).get(j-1))
                {
                    if(list.get(i-1).get(j) < list.get(i).get(j))
                    {
                        list.remove(i-1);
                        i--;
                        size= list.size();
                        break;
                    }
                    else
                    {
                        list.get(i-1).set(j-1,list.get(i).get(j-1));
                        //System.out.println(list.get(i).set(j+1,list.get(i+1).get(j+1)));
                        list.remove(i);
                        i--;
                        size= list.size();
                        break;
                    }
                }
                else if(list.get(i-1).get(j) >= list.get(i).get(j-1))
                {
                    if(list.get(i-1).get(j) > list.get(i).get(j))
                    {
                        list.remove(i);
                        i--;
                        size= list.size();
                        break;
                    }
                    else
                    {
                        list.get(i-1).set(j,list.get(i).get(j));
                        //System.out.println(list.get(i).set(j+1,list.get(i+1).get(j+1)));
                        list.remove(i);
                        i--;
                        size= list.size();
                        break;
                    }
                }
            }
        }
        int[][] arr=new int[list.size()][list.get(0).size()];
        for(int i=0;i< list.size();i++)
        {
            for(int j=0;j<list.get(0).size();j++)
            {
                arr[i][j]=list.get(i).get(j);
            }
        }
        for(int i=0;i< list.size();i++) {
            for (int j = 0; j < list.get(0).size(); j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        return arr;
    }
}
