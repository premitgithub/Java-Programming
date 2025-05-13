package Array_List;

import java.util.ArrayList;

public class Container_max_water_bruteforce_27
{
    public static void main(String[] args)
    {
//    For given n lines on x-axis, use 2 lines to form a container such that it holds maximum water
//    height=[1,8,6,2,5,4,8,3,7]
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        int max_area=Integer.MIN_VALUE;
        for(int i=0;i<height.size();i++)
        {
            for(int j=i+1;j<height.size();j++)
            {
                int min_ht=Math.min(height.get(i),height.get(j));
                int area=min_ht*(j-i);
                if(area>max_area)
                {
                    max_area=area;
                }
            }
        }
        System.out.println(max_area);
    }


}
