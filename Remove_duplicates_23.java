package Recursion;

public class Remove_duplicates_23
{
    public static void main(String[] args)
    {
        String str="appnaaacolllegeeee";
        boolean[] map=new boolean[26];
        System.out.println(remove(str,0,new StringBuilder(""),map));
    }
    public static StringBuilder remove(String str,int idx,StringBuilder newString,boolean[] map)
    {
        if(idx==str.length())
        {
            return newString;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true)
        {
            remove(str,idx+1,newString,map);
        }
        else
        {
            map[currChar-'a']=true;
            remove(str,idx+1,newString.append(currChar),map);
        }
        return newString;
    }
}
