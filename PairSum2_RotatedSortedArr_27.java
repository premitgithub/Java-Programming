package Array_List;

import java.util.ArrayList;

public class PairSum2_RotatedSortedArr_27
{
    // rotated sorted array is used where pivot is found out {11,15,6,8,9,10}
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(sum(list,15));
    }
    public static boolean sum(ArrayList<Integer> list,int target)
    {
        int pvt=pivot(list);
        int leftptr=pvt+1,rightptr=pvt,n=list.size()-1;
        while(leftptr!=rightptr)
        {
            if(list.get(leftptr)+list.get(rightptr)==target)
            {
                System.out.println(list.get(leftptr)+","+ list.get(rightptr));
                return true;
            }
            else if(list.get(leftptr)+list.get(rightptr)<target)
            {
                leftptr=(leftptr+1)%n;
            }
            else
            {
                rightptr=(n+rightptr-1)%n;
            }
        }
        return false;
    }
    public static int pivot(ArrayList<Integer> list)
    {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)> list.get(i+1))
            {
                return i;
            }
        }
        return -1;
    }
}
