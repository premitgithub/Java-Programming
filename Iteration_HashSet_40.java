package Hashing;

import java.util.*;

public class Iteration_HashSet_40 
{
    public static void main(String[] args)
    {
        HashSet<String> set = new HashSet<>();
        set.add("Kolkata");
        set.add("Delhi");
        set.add("Karnataka");
        set.add("Mumbai");
        
        Iterator it = set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        for (String city : set) {
            System.out.println(city);
        }
    }    
}
