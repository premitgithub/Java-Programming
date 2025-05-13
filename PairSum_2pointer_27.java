package Array_List;

import java.util.ArrayList;

public class PairSum_2pointer_27
{
    public static void main(String[] args)
    {
        // array is sorted over here
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(sum(list,20));
    }
    public static boolean sum(ArrayList<Integer> list,int target)
    {
        int leftptr=0,rightptr=list.size()-1;
        while(leftptr<=rightptr)
        {
            if(list.get(leftptr)+list.get(rightptr)==target)
            {
                System.out.println(list.get(leftptr)+","+ list.get(rightptr));
                return true;
            }
            else if(list.get(leftptr)+list.get(rightptr)<target)
            {
                leftptr++;
            }
            else
            {
                rightptr--;
            }
        }
        return false;
    }
}
