package Heaps;

import java.util.ArrayList;

public class Insert_peek_remove_Heap_39
{
    static class Heap
    {
        ArrayList<Integer> heap=new ArrayList<>();
        public void add(int data)
        {
            heap.add(data);

            int x=heap.size()-1;
            int par = (x-1)/2;
            while(heap.get(x)<heap.get(par))
            {
                int temp = heap.get(x);
                heap.set(x,heap.get(par));
                heap.set(par,temp);
            }
            x=par;
            par=(x-1)/2;
        }
        public int peek()
        {
            return heap.get(0);
        }
        private void heapify(int i)
        {
            //for minHeap
            int left=2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;
            if(left<heap.size() && heap.get(left) < heap.get(minIdx))
            {
                minIdx=left;
            }
            if(right<heap.size() && heap.get(right) < heap.get(minIdx))
            {
                minIdx = right;
            }
            if(minIdx!= i)
            {
                //swap
                int temp=heap.get(i);
                heap.set(i,heap.get(minIdx));
                heap.set(minIdx,temp);

                heapify(minIdx);
            }
//            int left=2 * i + 1;
//            int right = 2 * i + 2;
//            int maxIdx = i;
//            if(left<heap.size() && heap.get(left) > heap.get(maxIdx))
//            {
//                maxIdx=left;
//            }
//            if(right<heap.size() && heap.get(right) > heap.get(maxIdx))
//            {
//                maxIdx = right;
//            }
//            if(maxIdx!= i)
//            {
//                //swap
//                int temp=heap.get(i);
//                heap.set(i,heap.get(maxIdx));
//                heap.set(maxIdx,temp);
//
//                heapify(maxIdx);
//            }

        }
        public int remove()
        {
            int data=heap.get(0);

            //swap first and last element
            int temp=heap.get(0);
            heap.set(0,heap.get(heap.size()-1));
            heap.set(heap.size()-1,temp);

            //remove the last element
            heap.remove(heap.size() - 1);

            //call the heapify function
            heapify(0);
            return data;
        }
        public boolean isEmpty()
        {
            return heap.size()==0;
        }
    }
    public static void main(String[] args)
    {
        Heap h=new Heap();
        h.add(3);
        h.add(2);
        h.add(1);
        h.add(4);
        h.add(5);
        h.add(10);
        while(!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
