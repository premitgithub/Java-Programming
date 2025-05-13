package Queues;

import java.util.*;

public class First_non_repeating_char_32
{
    public static int first_nr(String str)
    {
        Queue<Character> q=new LinkedList<>();
        int[] freq=new int[26];
        int nr=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']!=1)
            {
                q.remove();
            }
            if(q.isEmpty())
            {
                nr=-1;
            }
            else
            {
                nr=q.peek();
            }
        }
        return nr;
    }
    public static void main(String[] args)
    {
       String str="aabccxb";
       System.out.println((char)first_nr(str));
    }
}
