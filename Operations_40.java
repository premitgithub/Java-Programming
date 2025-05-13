package Hashing;

import java.util.HashMap;

public class Operations_40
{
    public static void main(String[] args)
    {
        // using JCF
        HashMap<String,Integer> hm=new HashMap<>();
        //put(key,value)
        hm.put("India",100);
        hm.put("USA",50);
        hm.put("China",150);
        System.out.println(hm);

        // get(key)
        int value= hm.get("India");
        System.out.println(value);

        //containsKey(key)
        boolean check = hm.containsKey("China");
        System.out.println(check);
        System.out.println(hm.containsKey("Indonesia"));

        //remove(key)
        hm.remove("USA");
        System.out.println(hm);

        //size()
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());

        //clear()
        hm.clear();

        //isEmpty()
        System.out.println(hm.isEmpty());
    }
}
