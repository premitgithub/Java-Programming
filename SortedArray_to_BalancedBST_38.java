package Binary_Search_Trees;

public class SortedArray_to_BalancedBST_38
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
    public static Node BalancedBST(int[] arr,int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(arr[mid]);
        root.left=BalancedBST(arr,start,mid-1);
        root.right=BalancedBST(arr,mid+1,end);
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
        int[] arr={3,5,6,8,10,11,12};
        /*
                 8
               /   \
              5     11
            /  \    / \
           3    6  10  12
        */
        Node root = BalancedBST(arr,0,arr.length-1);
        preorder(root);
    }
}
