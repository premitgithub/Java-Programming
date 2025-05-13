package Binary_Tree;

import java.util.ArrayList;

public class Lowest_Common_Ancestor_app1_36
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
    public static boolean getPath(Node root,int n,ArrayList<Node> path)
    {
        if(root==null)
        {
            return false;
        }
        //adds the first root and then the others if it returns false in the last step
        path.add(root);

        //checks whether the root traversed is equal to n
        if(root.data==n)
        {
            return true;
        }
        //finds whether the element n is present in the left subtree
        boolean foundLeft=getPath(root.left,n,path);
        //finds whether the element is present in the right subtree
        boolean foundRight=getPath(root.right,n,path);
        //checks if any of the left or right part returns true
        if(foundLeft || foundRight)
        {
            return true;
        }
        //removes the last element added because it returns false and does not contain the lement in either left or right part
        path.remove(path.size()-1);
        return false;
    }
    public static Node lca(Node root,int n1,int n2)
    {
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();
        //get the paths  of n1 and n2
        getPath(root,n1,path1);
        getPath(root,n2,path2);
        //for getting the lca for both the elements
        int i=0;
        for(;i<path1.size() && i< path2.size();i++)
        {
            if(path1.get(i)!=path2.get(i))
            {
                break;
            }
        }
        Node lca=path1.get(i-1);
        return lca;
    }
    public static void main(String[] args)
    {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(lca(root,4,7).data);
    }
}
