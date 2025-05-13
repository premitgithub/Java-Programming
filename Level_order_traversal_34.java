package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Level_order_traversal_34
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
    static class BinaryTree
    {
        static int idx=-1;
        public Node buildTree(int[] nodes)
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public void levelOrder(Node root)
        {
            if(root==null)
            {
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty())
            {
                Node currNode=q.remove();
                if(currNode==null)//going to the next line
                {
                    System.out.println();
                    if(q.isEmpty())//for empty queue
                    {
                        break;
                    }
                    else//adding the null back
                    {
                        q.add(null);
                    }
                }
                else
                {
                    System.out.print(currNode.data+" ");//printing the current data
                    if(currNode.left!=null)
                    {
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null)
                    {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        tree.levelOrder(root);
    }
}
