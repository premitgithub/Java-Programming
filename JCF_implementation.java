package Linked_List;
import java.util.*;
public class JCF_implementation
{
    public static void main(String[] args)
    {
        //JCF can pass objects not use primitive data types like int double float...
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addLast(5);
        ll.add(3,7);
        System.out.println(ll);// for printing the linked list
    }
}
