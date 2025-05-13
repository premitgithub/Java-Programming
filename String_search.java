package Linear_Search;

import java.util.*;
public class String_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the size");
        int c = 0, var = 0;
        char ch, ch1;
        String str="";
        //size = sc.nextInt();
        System.out.println("Enter the string");
        str = sc.nextLine();
        str=str.toLowerCase();
        System.out.println("Enter the character to be searched");
        ch = sc.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            ch1 = str.charAt(i);
            if (ch == ch1) {
                c++;
                var = i + 1;
                break;
            }
        }
        if (c == 0)
            System.out.println("Character not found");
        else
            System.out.println("Character found inside the string at " + var + "th position");
    }
}
