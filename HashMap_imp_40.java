package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap_imp_40 
{
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;//n
        private int N;  
        private LinkedList<Node> buckets[];//N -> buckets.length

        public HashMap()//for each bucket
        {
            this.N = 4;
            this.buckets = new LinkedList[4];// empty linkedlist is created with size 4
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();//new empty linkedlist is created at every bucket index
            }
        }

        private int hashFunction(K key)
        {
            int hc = hashCode();//inbuilt in java
            return Math.abs(hc) % N;// mod is done so that it gives a range of bi from 0 to size-1
        }

        private int SearchinLL(K key,int bi)
        {
            LinkedList<Node> ll = buckets[bi];//creates a LL in the bi
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);//gets every node by traversing the entire bi
                if (node.key == key) {
                    return di;
                }

                di++;
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash()
        {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++)//for initialising the new linkedlist
            {
                buckets[i] = new LinkedList<>();
            }
            //nodes -> add in the bucket
            for(int i=0;i<oldBuck.length;i++)
            {
                LinkedList<Node> ll = oldBuck[i];
                for(int j=0;j<ll.size();j++)
                {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }

        }

        public void put(K key,V value) // O(lambda/1)
        {
            int bi = hashFunction(key);//every comparison is done on the basis of key coz it's unique
            int di = SearchinLL(key, bi);//for every node (data index) in each bi

            if (di != -1)//if key is present
            {
                Node node = buckets[bi].get(di);//searches for the key di at the bi
                node.value = value;//update the value 
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }
            //for rehashing
            double lambda = (double) n / N;
            if (lambda > 2.0)//say threshold is 2
            {
                rehash();
            }
        }
        
        public boolean containsKey(K key)// O(1)
        {
            int bi = hashFunction(key);//every comparison is done on the basis of key coz it's unique
            int di = SearchinLL(key, bi);//for every node (data index) in each bi

            if (di != -1)//valid 
            {
                return true;
            } else {
                return false;
            }
        }
        
        public V get(K key) // O(1)
        {
            int bi = hashFunction(key);//every comparison is done on the basis of key coz it's unique
            int di = SearchinLL(key, bi);//for every node (data index) in each bi

            if (di != -1)//if key is present
            {
                Node node = buckets[bi].get(di);//searches for the key di at the bi
                return node.value;
            } else {
                return null;
            }
        }

        public V remove(K key) // O(1)
        {
            int bi = hashFunction(key);//every comparison is done on the basis of key coz it's unique
            int di = SearchinLL(key, bi);//for every node (data index) in each bi

            if (di != -1)//if key is present
            {
                Node node = buckets[bi].remove(di);//searches for the key di at the bi
                n--;
                return node.value;
            } else {
                return null;
            }
        }
        
        public ArrayList<K> keySet()
        {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++)//traverses through the buckets
            {
                LinkedList<Node> ll = buckets[i];//gets a particular bucket index
                for (Node node : ll) {// traverses through each node in the particular bi
                    keys.add(node.key);// adds it to the key Set 
                }
            }
            return keys;
        }
        
        public boolean isEmpty()
        {
            return n == 0;
        }
    }

    public static void main(String[] args) 
    {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 50);
        hm.put("USA", 140);
        hm.put("France", 180);

        ArrayList<String> keys = hm.keySet();
        for (String key : keys) 
        {
            System.out.println(key);
        }

        System.out.println(hm.get("India"));
        System.out.println(hm.remove("China"));
        System.out.println(hm.get("China"));
        System.out.println(hm.containsKey("France"));
        System.out.println(hm.isEmpty());
    }   
}
