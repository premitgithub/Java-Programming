package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Traversal_GFG2 {
    static class Edge{
        int dest;
        int src;
        public Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static ArrayList<Integer> bfs(int V,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> list=new ArrayList<>();
        boolean[] vis=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        //int idx=0;
        while(!q.isEmpty()){
            int curr=q.remove();

            if(!vis[curr]) {
                vis[curr] = true;
                list.add(curr);
                for (int neighbor : adj.get(curr)) {
                    if (!vis[neighbor]) {
                        q.add(neighbor);
                    }
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int V=5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(2).add(4);

        // Run BFS
        System.out.println(bfs(V, adj));
    }
}
