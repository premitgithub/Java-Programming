package Tries;

public class Trie_implement_41 
{
    static class Node {
        Node[] children = new Node[26];//  each child will have an empty array of size 26
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node(); // root has no value but just marks the starting of the trie

    public static void insert(String word) {
            Node curr = root;
            for (int level = 0; level < word.length(); level++) {
                int idx = word.charAt(level)-'a';
                if (curr.children[idx] == null) // when there is no node , we create a new node
                {
                    curr.children[idx] = new Node();
                }
                curr = curr.children[idx]; // the child added becomes my curr node
            }
            curr.eow = true; // marks the end of word
        }

    public static void main(String[] args) 
    {
        String[] words = { "the", "a", "there", "their", "any", "thee" };
        for(int i=0;i<words.length;i++)
        {
            insert(words[i]);
        }
    }

    
}
