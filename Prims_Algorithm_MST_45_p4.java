package Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims_Algorithm_MST_45_p4 {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static class Pair implements Comparable<Pair> {
        int v;
        int cost;

        public Pair(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0,3,30));

        graph[1].add(new Edge(1, 0,10));
        graph[1].add(new Edge(1, 3,40));

        graph[2].add(new Edge(2, 0,15));
        graph[2].add(new Edge(2,3,50));

        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));
    }

    public static void prims(ArrayList<Edge> graph[]) {
        boolean[] vis = new boolean[graph.length];// visited array checks whether node is visited or not

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));// adds the first node as 0
        int finalCost=0;

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();//removes the first node in the pq and  then checks:
            if (!vis[curr.v]) {// whether node 0 is visited or not
                vis[curr.v] = true;//if not then visits it
                finalCost += curr.cost;// calculates the total cost

                for (int i = 0; i < graph[curr.v].size(); i++) {//for getting the neighbours
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair(e.dest, e.wt));//adds the new neighbour to compare
                }
            }
        }
        System.out.println("Total minimum cost = "+ finalCost);
    }

    public static void main(String[] args) {
        /*
               2     7       1
              |-->1------>3---|
              |   |       ^   V
              0   |1     2|   5
              |   V       |   ^
              |-->2------>4---|
               4     3      5
         */
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        prims(graph);
    }
}
