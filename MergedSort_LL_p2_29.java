package Linked_List;

public class MergedSort_LL_p2_29 {
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

    public void addfirst(int data) {
        //step-1 Create a new node
        Node newnode = new Node(data);
        // basecase - no nodes are present ie null , then set the head with tail with new node
        if (head == null) {
            head = tail = newnode;
            return;
        }
        //step -2 new Node's next=head of the previous one
        newnode.next = head;
        //step-3 head is the one of new node
        head = newnode;
    }

    public void add_last(int data) {
        //newnode is created at the last
        Node newnode = new Node(data);
        if (head == null)//by convention only if head is null only then the linked list is considered empty
        {
            head = tail = newnode;
            return;
        }
        //tail of the last node points the new node
        tail.next = newnode;
        //newnode is pointed as the tail which is pointing to null
        tail = newnode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node MergedSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = findMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = MergedSort(head);
        Node newRight = MergedSort(rightHead);
        return merge(newLeft, newRight);
    }

    public Node merge(Node head1, Node head2)
    {
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(head1!=null&&head2!=null)
        {
            if(head1.data<=head2.data)
            {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else
            {
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null)
        {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null)
        {
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }

    public static void main(String[] args)
    {
        MergedSort_LL_p2_29 ll=new MergedSort_LL_p2_29();
        //if we want 1->2 from first then we first pass 2 in the addfirst function then we pass 1
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(4);
        ll.add_last(3);
        ll.add_last(5);
        ll.print();
        ll.head=ll.MergedSort(ll.head);
        ll.print();
    }
}
