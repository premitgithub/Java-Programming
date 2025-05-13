package Recursion;
/*
You are given a number (eg - 2019), convert it into a String of english like
“two zero one nine”. Use a recursive function to solve this problem.
NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
can’t be 0.
Sample Input : 1947
Sample Output : “one nine four seven”
*/
public class Practice_Qs_02
{
    public static void main(String[] args)
    {
        String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int n=19000;
        String str="";
        if(n%10 !=0)
        {
            convert(n,str,arr);
        }
        else {
            System.out.println("Last digit cannot be zero");
        }
    }

    public static void convert(int n,String str,String[] arr)
    {
        if(n==0)
        {
            System.out.println(str);
            return ;
        }
        str=arr[n%10]+" "+str+" ";
        convert(n/10,str,arr);
    }
}
