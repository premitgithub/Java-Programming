package Linked_List;

public class Detecting_cycle_LL_p2_29
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
        public static void main(String[] args)
        {
            head=new Node(1);
            head.next=new Node(2);
            head.next.next=new Node(4);
            //head.next.next.next=head;
            System.out.println(checkCycle());
        }
    }
}
