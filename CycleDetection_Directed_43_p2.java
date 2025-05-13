package Graphs;

import java.util.ArrayList;

public class CycleDetection_Directed_43_p2 {
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
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
    }

    public static boolean isCycle(ArrayList<Edge> graph[]) {
        boolean[] vis = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (isCycleUtil(graph, i, vis, stack)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge> graph[], int curr, boolean[] vis, boolean[] stack) {
        vis[curr] = true;// as soon node is unvisted it gets visited , and changes its value to true
        stack[curr] = true;//same
        
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);//gets the node at the end of edge or neighbours
            if (stack[e.dest]) {//if the neighbours exits in the recursion stack 
                return true;// if yes then already there is a cycle and returns true 
            }
            if (!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)) {//if the node is unvisited then it visits the node to check even after visiting whether it is visited then return true
                return true;
            }
        }
        stack[curr] = false;// returns false in stack everytime the node is not directed to another node
        return false;//returns false in visited while coming back
    }
    public static void main(String[] args) {
        /*
               0---->1
               |     |
               v     |
               2     |
               |     |
               v     |
               3<----|
         */
        int V = 5;// no of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];// null -> empty arraylist
        createGraph(graph);
        System.out.println(isCycle(graph));
    }
    
}
