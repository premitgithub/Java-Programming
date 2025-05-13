package Tries;
// Given a string of length n of lowercase alphabet characters, we count the total no of distinct unique substrings of this string.

// str="ababa"
// Logic :
// find all prefixes:ababa -> a ab aba abab ababa
// of all suffixes    baba -> b ba bab baba
//                     aba -> a ab aba
//                      ba -> b ba
//                       a -> a
// by creating a tree out of all the suffix we remove the duplicate prefix substrings. Hence we get the answer
                    
public class Unique_Substrings_41 {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        // by the use of trie it stores all the unique prefixes of each suffix word , that is no repetition
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static int unique(Node root)
    {
        int count = 0;
        if (root == null) {
            return 0;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children != null) {
                count += unique(root.children[i]);// counts the no of nodes ie all the prefixes of each suffix
            }
        }
        return count+1;//+1 is for counting the "" empty sustring
    }
    public static void main(String[] args) {
        String str = "abcdef";
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);// creates all the suffixes of the string and passes it on to the insert func to creatte a trie out of it
            insert(suffix);
        }
        System.out.println(unique(root));
    }
}
