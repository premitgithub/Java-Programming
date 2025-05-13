package Hashing;

import java.util.LinkedHashMap;

public class Linked_HashMap_40 
{
    public static void main(String[] args) 
    {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 50);
        lhm.put("USA", 140);
        lhm.put("France", 180);
        System.out.println(lhm);
    }    
}
