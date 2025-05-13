package Hashing;

import java.util.HashSet;

public class HashSet_40
{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(1);
        set.add(1);
        System.out.println(set);
        System.out.println(set.contains(3));
        System.out.println(set.isEmpty());
        System.out.println(set.remove(1));
        System.out.println(set);
        System.out.println(set.size());
    }    
}
