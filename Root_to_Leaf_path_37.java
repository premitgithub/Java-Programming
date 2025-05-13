package Binary_Search_Trees;

import java.util.ArrayList;

public class Root_to_Leaf_path_37 
{
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root,int val)
    {
        if (root == null) {
            root = new Node(val);
            return root;
        } else if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root)
    {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void printPath(ArrayList<Integer> path)
    {
        for(int i=0;i<path.size();i++)
        {
            System.out.print(path.get(i) + "-> ");
        }
        System.out.println("Null");
    }
    public static void root_to_node(Node root,ArrayList<Integer> path)
    {
        if (root == null)
        {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right==null)
        {
            printPath(path);
        }
        root_to_node(root.left, path);
        root_to_node(root.right, path);
        path.remove(path.size() - 1);
    }
    public static void main(String[] args) 
    {
        Node root = null;
        int[] val={8,5,3,6,10,11,14};
        for(int i=0;i<val.length;i++)
        {
            root = insert(root, val[i]);
        }
        inorder(root);
        System.out.println();
        root_to_node(root, new ArrayList<>());
    }
}
