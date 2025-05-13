package Array_List;

import java.util.ArrayList;

public class Swapping_27
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        swap(list,1,4);
    }
    public static void swap(ArrayList<Integer> list,int idx1,int idx2)
    {
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        System.out.println(list);
    }
}
