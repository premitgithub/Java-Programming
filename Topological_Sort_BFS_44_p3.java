package Graphs;

import java.util.*;

public class Topological_Sort_BFS_44_p3 {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void calcInged(ArrayList<Edge> graph[], int[] indegree) {
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);//calculates the edge of each node
                indegree[e.dest]++;//increases the indegree by one 
            }
        }
    }
    
    public static void topSort(ArrayList<Edge> graph[]) {
        int[] indegree = new int[graph.length];
        calcInged(graph, indegree);
        System.out.println(Arrays.toString(indegree));

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {//adds the nodes with indegree equal to 0
                q.add(i);
            }
        }

        //bfs
        while (!q.isEmpty()) {
            int curr = q.remove();//removes each node from queue
            System.out.print(curr + " ");

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);//neighbour nodes are checked and indegree is decreased by one 
                indegree[e.dest]--;
                if (indegree[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        /*
                5--->0<---4
                |         |
                |         |
                v         v
                2--->3--->1
         */
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        topSort(graph);
    }
}
