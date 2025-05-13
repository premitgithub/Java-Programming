package Tries;
//Create a boolean function startCheck(String prefix) for a trie.

//Returns true if there is a previously inserted string word that has the prefix and false otherwise
//words[] = {"apple", "app", "mango", "man", "woman"}
// prefix="app" -> true
//prefix="moon" -> false

public class StartsWith_prob_41 {
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

    public static boolean startCheck(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        
        return true;// only difference from searching is that it does 
                    //not check the end of the word is true or not , only if the prefix is present it returns true
    }

    public static void main(String[] args) {
        String[] words = { "apple", "app", "mango", "man", "woman" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(startCheck("app"));
        System.out.println(startCheck("moon"));
    }
}
