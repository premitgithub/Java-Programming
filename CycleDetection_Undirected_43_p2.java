package Graphs;

import java.util.ArrayList;

public class CycleDetection_Undirected_43_p2 {
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
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    public static boolean detectCycle(ArrayList<Edge> graph[])
    {
        boolean[] vis = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {// if node is unvisited then visit the node 
                if (detectCycleUtil(graph, vis, i, -1)) {// visits the node and sets its value to true and parent as -1
                    return true;// cycle exists in one of the parts
                }
            }
        }
        return false;
    }
    //O(V+E)
    public static boolean detectCycleUtil(ArrayList<Edge> graph[], boolean[] vis, int curr, int par) {
        vis[curr] = true;// as soon as the node is unvisited it calls this function and visits the node(curr=true)
        
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            // all the below conditions are for checking of the neighgbours
            if (!vis[e.dest]) {// case 3 : if node is not visited
                if (detectCycleUtil(graph, vis, e.dest, curr)) {//calls the detect cycle func to visit the node 
                    return true;//if node is visited then cycle is sure to exist
                }
            }
            else if (vis[e.dest] && e.dest != par) {// case 1: if node is visited but not the parent 
                return true;// node is sure to exist
            }
            // case 2: if vis as well as parent then continue

        }
        return false;
    }
    public static void main(String[] args) {
        /*
                 0-----3
                /|     |
               / |     |
              1  |     4
               \ |
                \|
                 2
         */
        int V = 5;// no of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];// null -> empty arraylist
        createGraph(graph);
        System.out.println(detectCycle(graph));
    }
}
