package Binary_Search_Trees;

public class Mirror_BST_37
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
    public static Node mirror(Node root)
    {
        if(root==null)
        {
            return null;//returns null when no nodes are present
        }
        Node leftSub = mirror(root.left);//finds the nodes of left subtree
        Node rightSub = mirror(root.right);//finds the nodes of right subtree
        root.left=rightSub;//interchanges leftsubtree with right
        root.right=leftSub;//interchanges right subtree with left
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
              5     10
            /  \     \
           3    6     11
        */
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(11);

        /*    Mirror tree
                 8
               /   \
              10    5
            /      /  \
           11     6    3
        */
        mirror(root);
        preorder(root);
    }
}
