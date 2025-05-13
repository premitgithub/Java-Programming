package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement_p1_30
{
    public static void nextGreater(int[] arr,int[] nextgrt)
    {
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!s.isEmpty()&&arr[s.peek()]<=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nextgrt[i]=-1;
            }
            else
            {
                nextgrt[i]=arr[s.peek()];
            }
            s.push(i);
        }
    }
    public static void main(String[] args)
    {
        int[] arr={3,8,4,0,2,7};
        int[] nextgrt=new int[arr.length];
        nextGreater(arr,nextgrt);
        System.out.println(Arrays.toString(nextgrt));
    }

}
