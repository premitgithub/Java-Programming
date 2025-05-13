package Leetcode;

public class Length_of_last_word
{
    public static void main(String[] args)
    {
        String s = "luffy is still joyboy";
        System.out.println("Length is = " + length(s));
    }
    public static int length(String s)
    {
        s=s.trim();
        int len=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                len++;
            }
            else
            {
                break;
            }
        }

        return len;
    }
}
