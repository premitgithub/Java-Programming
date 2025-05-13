package Binary_Search_Trees;

import java.util.ArrayList;

public class ConvertBST_to_BalancedBST_38
{
    static class Node
    {
        int data;
        Node left,right;
        public Node(int data)
        {
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void Getinorder(Node root,ArrayList<Integer> inorder)
    {
        if(root==null)
        {
            return;
        }
        Getinorder(root.left,inorder);
        inorder.add(root.data);
        Getinorder(root.right,inorder);
    }
    public static Node CreateBST(ArrayList<Integer> list,int start,int end)
    {
        int  mid=(start+end)/2;
        if(start>end)
        {
            return null;
        }
        Node root=new Node(list.get(mid));
        root.left=CreateBST(list,start,mid-1);
        root.right=CreateBST(list,mid+1,end);
        return root;
    }
    public static Node BalancedBST(Node root)
    {
        ArrayList<Integer> inorder=new ArrayList<>();
        Getinorder(root,inorder);
        root = CreateBST(inorder,0,inorder.size()-1);
        return root;
    }
    public static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args)
    {
        /*
                 8
               /   \
              6     10
            /        \
           5          11
          /            \
         3              12

        */
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);
        root=BalancedBST(root);
        preorder(root);
    }
}
