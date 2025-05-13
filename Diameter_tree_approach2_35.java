package Binary_Tree;

public class Diameter_tree_approach2_35
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
    static class BinaryTree {
        static int idx = -1;
        public Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    static class Info
    {
        int ht;
        int diam;
        public Info(int ht,int diam)
        {
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static Info diameter(Node root)
    {
        if(root==null)
        {
            return new Info(0,0);
        }
        Info leftInfo=diameter(root.left);
        Info rightInfo=diameter(root.right);
        int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),(leftInfo.ht+rightInfo.ht+1));
        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
        return new Info(diam,ht);
    }
    public static void main(String[] args)
    {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,7,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        //System.out.println("Root = "+root.data);
        System.out.println(diameter(root).diam);
        System.out.println(diameter(root).ht);
    }
}
