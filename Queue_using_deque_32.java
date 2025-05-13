package Queues;

import java.util.Deque;
import java.util.LinkedList;

public class Queue_using_deque_32
{
    static class Queue
    {
        Deque<Integer> deque=new LinkedList<>();
        public void add(int data)
        {
            deque.addLast(data);
        }
        public int remove()
        {
            return deque.removeFirst();
        }
        public int peek()
        {
            return deque.getFirst();
        }
    }

    public static void main(String[] args)
    {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.print(q.peek());
        q.remove();
    }
}
