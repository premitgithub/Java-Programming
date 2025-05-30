package Binary_Search_Trees;

public class Search_BST_37
{
    static class Node
    {
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insert(Node root,int val)
    {
        if(root==null)
        {
            root=new Node(val);
            return root;
        }
        if(root.data>val)
        {
            root.left = insert(root.left,val);
        }
        else
        {
            root.right = insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root,int key)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==key)
        {
            return true;
        }
        else if(root.data>key)
        {
            return search(root.left,key);
        }
        else
        {
            return search(root.right,key);
        }
    }
    public static void main(String[] args)
    {
        int[] val={8,5,3,6,1,4,10,11,14};
        Node root=null;
        for(int i=0;i<val.length;i++)
        {
            root= insert(root,val[i]);
        }
        inorder(root);
        System.out.println();
        System.out.println(search(root,4));
    }
}
