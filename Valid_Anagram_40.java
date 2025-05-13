package Hashing;

import java.util.HashMap;

public class Valid_Anagram_40 
{
    public static void main(String[] args) 
    {
        String s = "keen";
        String t = "knee";
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch1 = s.charAt(i);
            // if (map.containsKey(ch1)) {
            //     map.put(ch1, map.get(ch1) + 1);
            // } else {
            //     map.put(ch1, 1);
            // }
            map.put(ch1, map.getOrDefault(ch1, 0) + 1);
        }
        
        for(int i=0;i<t.length();i++)
        {
            char ch2 = t.charAt(i);
            if (map.get(ch2) != null) 
            {
                if(map.get(ch2) == 1)
                {
                    map.remove(ch2);
                }
                else
                {
                    map.put(ch2, map.get(ch2) - 1);
                }
            } 
            else 
            {
                System.out.println("false");
            }
        }
        if(map.isEmpty())
        {
            System.out.println("true");
        }
    }
}
