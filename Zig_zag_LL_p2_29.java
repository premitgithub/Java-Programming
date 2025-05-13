package Linked_List;

public class Zig_zag_LL_p2_29
{
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
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
        public void zigzag_LL()
        {
            //find mid
            Node slow = head;
            Node fast = head.next;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            Node mid=slow;
            //remember by the process of 3 variables 4 steps
            Node prev=null;
            Node curr=mid.next;//assignment in java moves from right to left, ie head value gets assigned in tail and then tail value gets assigned in curr
            mid.next=null;
            Node next;
            while(curr!=null)
            {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            Node left=head;
            Node right=prev;
            Node nextL,nextR;
            //zig-zag alternately join
            while(left!=null&&right!=null)
            {
                nextL=left.next;
                left.next=right;
                nextR=right.next;
                right.next=nextL;

                left=nextL;
                right=nextR;
            }
        }
        public static void main(String[] args)
        {
            Zig_zag_LL_p2_29 ll=new Zig_zag_LL_p2_29();
            //if we want 1->2 from first then we first pass 2 in the addfirst function then we pass 1
            ll.addfirst(2);
            ll.addfirst(1);
            ll.add_last(3);
            ll.add_last(4);
            ll.add_last(5);
            ll.add_last(6);
            ll.print();
            ll.zigzag_LL();
            ll.print();
        }
}