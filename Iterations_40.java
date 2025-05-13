package Hashing;

import java.util.*;

public class Iterations_40
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India", 100);
        hm.put("USA",50);
        hm.put("China", 150);
        hm.put("United Kingdom",250);
        hm.put("UAE", 30);
        
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key = "+k+" ,value = "+ hm.get(k));
        }
    }
}
