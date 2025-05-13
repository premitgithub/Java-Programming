package Leetcode;

import java.util.Scanner;

public class Roman_to_int
{
    public static void main(String[] args) {

        String str = "I";
        if (str.length() < 1 || str.length() > 15) {
            System.out.println("Length of number out of range");
            System.exit(0);
        }
        System.out.println(find_rom(str));
    }

    public static int find_rom(String s)
    {
        int i = 1, v = 5, x = 10, l = 50, c = 100, d = 500, m = 1000,countI = 0,countX = 0,countC = 0;
        char ch;
        int value = 0;
        for(int j=0;j<s.length();j++)
        {
            ch=s.charAt(j);
            if(ch=='I' && j<s.length()-1)
            {
                if(s.charAt(j+1) == 'V')
                {
                    value = value + 4;
                    j++;
                    countI++;
                }
                else if(s.charAt(j+1) == 'X')
                {
                    value = value + 9;
                    j++;
                    countI++;
                }
                else
                {
                    value=value+i;
                }
            }
            else if(ch == 'V')
            {
                value=value+v;
            }
            else if(ch=='X' && j<s.length()-1)
            {
                if(s.charAt(j+1) == 'L')
                {
                    value=value+40;
                    j++;
                    countX++;
                }
                else if(s.charAt(j+1) == 'C')
                {
                    value = value + 90;
                    j++;
                    countX++;
                }
                else
                {
                    value=value+x;
                }
            }
            else if(ch=='L')
            {
                value=value+l;
            }
            else if(ch=='C' && j<s.length()-1)
            {
                if(s.charAt(j+1) == 'D')
                {
                    value=value+400;
                    j++;
                    countC++;
                }
                else if(s.charAt(j+1) == 'M')
                {
                    value = value + 900;
                    j++;
                    countC++;
                }
                else
                {
                    value=value+c;
                }
            }
            else if(ch=='D' )
            {
                value=value+d;
            }
            else if(ch=='M')
            {
                value=value+m;
            }
        }

        if(s.charAt(s.length()-1) == 'I' && countI==0)
        {
            return value + 1;
        }
        else if(s.charAt(s.length()-1) == 'X' && countX == 0 && countI ==0)
        {
            return value + 10;
        }
        else if(s.charAt(s.length()-1) == 'C' && countC == 0 && countX ==0 && countI==0)
        {
            return value + 100;
        }
        else
        {
            return value;
        }

    }
}
