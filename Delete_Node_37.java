package Binary_Search_Trees;

public class Delete_Node_37
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
    public static Node delete(Node root,int val)
    {
        if(root.data>val)
        {
            root.left=delete(root.left,val);
        }
        else if(root.data<val)
        {
            root.right=delete(root.right,val);
        }
        else
        {
            // case-1: no child
            if(root.left==null && root.right==null)
            {
                return null;//returns null to the parent
            }
            // case-2: one child
            if(root.left==null)
            {
                return root.right;//returns the next right element
            }
            else if(root.right==null)
            {
                return root.left;//returns the next left elment
            }
            //case-3: 2 children
            Node IS=inordersuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }
    public static Node inordersuccessor(Node root)
    {
        while(root.left!=null)//traverses to the left until it reaches the min of the right subtree
        {
            root=root.left;
        }
        return root;
    }
    public static void main(String[] args)
    {
        int[] val={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<val.length;i++)
        {
            root= insert(root,val[i]);
        }
        inorder(root);
        System.out.println();
    }
}
