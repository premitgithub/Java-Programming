package Binary_Search_Trees;

public class Valid_BST_37
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
        else if(root.data > val)
        {
            root.left = insert(root.left,val);
        }
        else
        {
            root.right=  insert(root.right,val);
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
    public static boolean isValid(Node root, Node min, Node max)
    {
        if(root==null)//no nodes present
        {
            return true;
        }
        if(min!=null && root.data<= min.data)//case when root > max of left subtree
        {
            return false;
        }
        if(max!=null && root.data>=max.data)// case when root < min of right subtree
        {
            return false;
        }
        boolean left = isValid(root.left,min,root);
        boolean right = isValid(root.right,root,max);
        return  left && right;
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

        if(isValid(root,null,null))
        {
            System.out.println("Valid BST");
        }
        else
        {
            System.out.println("Invalid BST");
        }
    }
}
