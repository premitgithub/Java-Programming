package Recursion;
/*
Write a program to nd Length of a String using Recursion.
*/
public class Practice_Qs_03
{
    public static void main(String[] args)
    {
        String str="";
        str=str+".";
        int idx=0;
        System.out.println(length(str,idx));
    }
    public static int length(String str,int idx)
    {
        if(str.charAt(idx)=='.')
        {
            return idx;
        }
        return length(str,idx+1);
    }
}
