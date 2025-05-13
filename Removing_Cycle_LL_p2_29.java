package Linked_List;

public class Removing_Cycle_LL_p2_29
{
    static class Node//declaring constructor static is important because no object is created in main
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
        public static Node head;
        public static Node tail;
        public static boolean checkCycle()//function is static because no object is created to call this function
        {
            Node slow=head;
            Node fast=head;
            while(fast!=null&&fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast)
                {
                    return true;
                }
            }
            return false;
        }
        public static void RemoveCycle()
        {
            Node slow=head;
            Node fast=head;
            boolean cycle=false;
            while(fast!=null&&fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast)
                {
                    cycle=true;
                    break;
                }
            }
            if(cycle==false)
            {
                return;
            }
            slow=head;
            Node prev=null;
            while(slow!=fast)
            {
                prev=fast;
                slow=slow.next;
                fast=fast.next;
            }
            prev.next=null;
        }
        public static void print()
        {
            if(head==null)
            {
                System.out.println("Linked List is empty");
                return;
            }
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        public static void main(String[] args)
        {
            head=new Node(1);
            Node temp=new Node(2);
            head.next=temp;
            head.next.next=new Node(4);
            head.next.next.next=new Node(5);
            head.next.next.next.next=temp;
            //print();
            System.out.println(checkCycle());
            RemoveCycle();
            print();
            System.out.println(checkCycle());
        }
    }
}
