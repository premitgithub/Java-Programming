package Leetcode;

public class Problem_20
{
    public static void main(String[] args)
    {
        String str="([)]";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String s)
    {
        int var1=0,var2=0,var3=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(' && var1==0)
            {
                var1++;
            }
            else if(ch==')')
            {
                var1--;
            }
            else if(ch=='{' && var2==0)
            {
                var2++;
            }
            else if(ch=='}')
            {
                var2--;
            }
            else if(ch=='[' && var3==0)
            {
                var3++;
            }
            else if(ch==']')
            {
                var3--;
            }
        }
        if(var1==0 && var2==0 && var3==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
