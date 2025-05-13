package Queues;
import java.util.*;
public class Interleave_2halves_queue_32
{
    public static void interleave(Queue<Integer> q)
    {
        int size=q.size();
        Queue<Integer> first=new LinkedList<>();
        for(int i=0;i<size/2;i++)
        {
            first.add(q.remove());
        }
        while(!first.isEmpty())
        {
            q.add(first.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args)
    {
        Queue<Integer> q=new LinkedList<>();
        int size=10;
        for(int i=1;i<=size;i++)
        {
            q.add(i);
        }
        interleave(q);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
