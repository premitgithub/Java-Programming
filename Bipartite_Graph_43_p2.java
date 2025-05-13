package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite_Graph_43_p2 {
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

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
    }

    public static boolean checkBipartite(ArrayList<Edge> graph[])
    {
        int[] col = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            col[i] = -1;// sets all the col of nodes to -1 ie no color initially
        }

        Queue<Integer> q = new LinkedList<>();// for adding the nodes to the queue for bfs performing
        
        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) {// checks if the first node has no color
                q.add(i);// adds to the queue
                col[i] = 0;//yellow color is set if no color is given
                while (!q.isEmpty()){// traverses the queue until empty
                    int curr=q.remove();//removes the current node
                    for(int j=0;j<graph[curr].size();j++){
                        Edge e=graph[curr].get(j);//gets the current color
                        if(col[e.dest]==-1){// checks if the neighhbour has no color
                            int nextColor = col[curr] == 0 ? 1 : 0;// sets it to the opposite color to theat of the current color
                            col[e.dest]=nextColor;
                            q.add(e.dest);// adds it to the color
                        }
                        //case 1: non bipartite
                        else if(col[e.dest]==col[curr]){
                            return false;// non bipartite
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        /*
                    0
                   / \
                  /   \
                1       2
                 \     /
                  3---4   
        
         */
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(checkBipartite(graph));
    }
}
