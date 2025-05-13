package Recursion;

public class Practice_Qs_04
{
    public static void main(String[] args)
    {
        String str="abcab";
        int sidx=0,eidx=0;
        System.out.println(substr(str,sidx,eidx));
    }
    public static String substr(String str,int sidx,int eidx)
    {
        if(sidx==str.length()-1)
        {
            return str.charAt(sidx)+" ";
        }
        if(str.charAt(sidx)==str.charAt(eidx))
        {
            System.out.print(str.substring(sidx,eidx+1)+" ");
        }
        if(eidx==str.length()-1)
        {
            eidx=sidx+1;
            return substr(str,sidx+1,eidx);
        }
        return substr(str,sidx,eidx+1);
    }
}
