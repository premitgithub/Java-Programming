package Heaps;


import java.util.PriorityQueue;

public class Connect_N_ropes_39
{
    // Given N ropes of different lengths , the task is to coonect these ropes into one rope with minimum cost
    // such that the cost connect two ropes is equal to the sum of their lengths
    /*
    logic:
    connect min two and then add the sum of these two to the pq at the last and then again follow the above steps
    */
    public static void main(String[] args)
    {
        int[] ropes={4,3,2,6};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++)
        {
            pq.add(ropes[i]);
        }
        int cost=0;
        while(pq.size()>1)
        {
            int min1=pq.remove();
            int min2 = pq.remove();
            cost += min1+min2;
            pq.add(min1 + min2);
        }
        System.out.println("Cost of connecting n ropes = "+cost);
    }
}
