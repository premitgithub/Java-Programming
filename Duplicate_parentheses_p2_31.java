package Stacks;

import java.util.Stack;

public class Duplicate_parentheses_p2_31
{
    public static void main(String[] args)
    {
        String str="((a+b)+(c+d))";
        System.out.println(duplicate(str));
    }
    public static boolean duplicate(String str)
    {
        Stack<Character>  s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==')')//closing
            {
                int count=0;
                while(s.peek()!='(')
                {
                    s.pop();
                    count++;
                }
                if(count<1)
                {
                    return true;
                }
                else
                {
                    s.pop();
                }
            }
            else//opening
            {
                s.push(ch);
            }
        }
        return false;
    }
}
