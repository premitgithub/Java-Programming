package Recursion;

public class Binary_Strings_23
{
    public static void main(String[] args)
    {
        int n=3,lastPlace=0;
        String str="";
        System.out.println(binarystr(n,str,lastPlace));
    }
    public static String binarystr(int n,String str,int lastPlace)
    {
        if(n==0)
        {
            System.out.println(str);
            return "";
        }
        binarystr(n-1,str+"0",0);
        if(lastPlace==0)
        {
            binarystr(n-1,str+"1",1);
        }
        return "";
    }
}
