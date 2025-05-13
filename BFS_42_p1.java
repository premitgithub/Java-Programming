package Graphs;

import java.util.*;


public class BFS_42_p1 {
    
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

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        //0 vertex
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        //1 vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        //2 vertex
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        //3 vertex
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        //4 vertex
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        //5 vertex
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        //6 vertex
        graph[6].add(new Edge(6, 5, 1));

    }
    
    public static void bfs(ArrayList<Edge> graph[]) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.length];
        q.add(0); /// source=0

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) {// when visited
                vis[curr] = true;//value set to true
                System.out.print(curr + " ");//print the vertex
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);//for getting the immediate neighbours
                    q.add(e.dest);//adding the immediate neighbours to the queue
                }
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(vis));
    }
        public static void main(String[] args) {
            /*   
                    1-----3
                   /      |\
                  /       | \
                 0        |  5----6
                  \       | /
                   \      |/
                    2-----4
             */
        int V = 7;// no of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];// null -> empty arraylist
        createGraph(graph);
        bfs(graph);
    }
}
