package Array_List;

import java.util.ArrayList;

public class Container_max_water_2pointer_27
{
    //time complexity=O(n) because half distance travelled from left using leftptr is d
    //and distance travelled from right using rightptr is n-d .. therfore total times loop runs is d+(n-d)=n
    public static void main(String[] args)
    {
//      height=[1,8,6,2,5,4,8,3,7]
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
        System.out.println(max_water(height));
    }
    public static int max_water(ArrayList<Integer> height)
    {
        int leftptr=0,rightptr=height.size()-1,max_area=0;
        while(leftptr<rightptr)
        {
            int min_ht=Math.min(height.get(leftptr),height.get(rightptr));
            int width=rightptr-leftptr;
            int area=min_ht*width;
            if(area>max_area)
            {
                max_area=area;
            }
            if(height.get(leftptr)<height.get(rightptr))
            {
                leftptr++;
            }
            else
            {
                rightptr--;
            }

        }
        return max_area;
    }
}
