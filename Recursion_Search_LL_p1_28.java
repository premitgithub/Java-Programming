package Linked_List;

public class Recursion_Search_LL_p1_28
{
    class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addfirst(int data)
    {
        //step-1 Create a new node
        Node newnode=new Node(data);
        // basecase - no nodes are present ie null , then set the head with tail with new node
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        //step -2 new Node's next=head of the previous one
        newnode.next=head;
        //step-3 head is the one of new node
        head=newnode;
    }

    public void add_last(int data)
    {
        //newnode is created at the last
        Node newnode=new Node(data);
        if(head==null)//by convention only if head is null only then the linked list is considered empty
        {
            head=tail=newnode;
            return;
        }
        //tail of the last node points the new node
        tail.next=newnode;
        //newnode is pointed as the tail which is pointing to null
        tail=newnode;
    }

    public void print()
    {
        if(head==null)
        {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int helper(Node head,int key)//recursion actually takes place in this function
    {
        if(head==null)//base case
        {
            return -1;
        }
        if(head.data==key)//checks the head which is incremented everytime with the key
        {
            return 0;//key found
        }
        int idx=helper(head.next,key);//recursive call where idx gives the correct index of the key
        if(idx==-1)
        {
            return -1;
        }
        return idx+1;//for idx non zero
    }
    public int RecSearch(int key)
    {
        return helper(head,key);
    }
    public static void main(String[] args)
    {
        Recursion_Search_LL_p1_28 ll=new Recursion_Search_LL_p1_28();
        //if we want 1->2 from first then we first pass 2 in the addfirst function then we pass 1
        ll.addfirst(2);
        ll.addfirst(1);
        ll.add_last(3);
        ll.add_last(4);
        ll.print();
        System.out.println(ll.RecSearch(3));
        System.out.println(ll.RecSearch(10));
    }
}
