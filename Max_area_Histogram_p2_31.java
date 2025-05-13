package Stacks;

import java.util.Stack;

public class Max_area_Histogram_p2_31
{
    public static void main(String[] args)
    {
        int[] heights={2,1,5,6,2,3};
        System.out.println(maxArea(heights));
    }
    public static int maxArea(int[] heights)// O(n)
    {
        Stack<Integer> s=new Stack<>();
        int width,height;
        int[] nsl=new int[heights.length];
        int[] nsr=new int[heights.length];
        //next smaller left - O(n)
        for(int i=0;i<nsl.length;i++)
        {
            while(!s.isEmpty() && heights[s.peek()]>=heights[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsl[i]=-1;
            }
            else
            {
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //next smaller right - O(n)
        s=new Stack<>();
        for(int i=nsr.length-1;i>=0;i--)
        {
            while(!s.isEmpty()&&heights[s.peek()]>=heights[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsr[i]=heights.length;
            }
            else
            {
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        // calculating width - O(n)
        int maxArea=0;
        for(int  i=0;i<heights.length;i++)
        {
            height=heights[i];
            width=nsr[i]-nsl[i]-1;
            int currArea=width*height;
            maxArea=Math.max(currArea,maxArea);
        }
        return maxArea;
    }
}
