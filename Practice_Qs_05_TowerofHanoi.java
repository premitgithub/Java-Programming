package Recursion;

public class Practice_Qs_05_TowerofHanoi
{
    public static void main(String[] args)
    {
        int n=3;
        transfer(n,"A","B","C");
    }
    public static void transfer(int n,String src,String hlp,String des)
    {
        if(n==1)//base case for one disk only
        {
            System.out.println("Shift disk " + n+" from " +src+ " to " +des);
            return;
        }
        transfer(n-1,src,des,hlp);//(n-1) disks from 1st tower to second tower using third tower as helper
        System.out.println("Shift disk " + n+" from " +src+ " to " +des);//bottom most disk transferred from 1st tower to 3rd tower
        transfer(n-1,hlp,src,des);//(n-1) disks from 2nd tower is moved to 3rd tower on top the previously transferred bottom most task
    }
}
