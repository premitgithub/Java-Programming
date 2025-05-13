package Linked_List;


public class Doubly_LL_add_remove_reverse_p2_29
{
    class Node
    {
        int data;
        Node next;
        Node prev;
        public Node(int data)
        {
            this.data=data;
            this.next=next;
            this.prev=prev;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void add(int data)
    {
        Node newnode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
    public int removeFirst()
    {
        if(head==null)
        {
            System.out.println("Empty Linkedlist");
            return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val= head.data;
        head=head.next;
        head.prev=null;
        return val;
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
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void reverse()
    {
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args)
    {
        Doubly_LL_add_remove_reverse_p2_29 dll=new Doubly_LL_add_remove_reverse_p2_29();
        dll.add(4);
        dll.add(3);
        dll.add(2);
        dll.add(1);
        dll.print();
        dll.removeFirst();
        dll.print();
        dll.reverse();
        dll.print();
    }
}
