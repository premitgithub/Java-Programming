package Stacks;

import java.util.Stack;

public class Reverse_string_usingStack_p1_30
{
    public static String reverseString(String str)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            s.push(str.charAt(i));
        }
        StringBuilder reverse=new StringBuilder("");
        while(!s.isEmpty())
        {
            reverse.append(s.pop());
        }
        str=reverse.toString();
        return str;
    }
    public static void main(String[] args)
    {
        String str="abcdef";
        System.out.println(reverseString(str));
    }
}
