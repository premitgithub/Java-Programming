package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Cheapest_flights_K_stops_46_p5 {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static class Info {
        int vertex;
        int cost;
        int stops;

        public Info(int v, int c, int s) {
            this.vertex = v;
            this.cost = c;
            this.stops = s;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[], int[][] flights) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < flights.length; i++) {
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);
        }
    }
    
    public static int cheapest(int n, int flight[][], int src, int dest, int k) {
        ArrayList<Edge> graph[] = new ArrayList[n];// empty graph is created
        createGraph(graph, flight);

        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            if (i != src) {// makes all the dist of nodes to Max value except the starting node
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(0, 0, 0));//adds the first node to the queue to compare

        while (!q.isEmpty()) {
            Info curr = q.remove();//gets each node
            if (curr.stops > k) {// checks whether no of stops required is > k(given value)
                break;// if yes then breaks
            }

            for (int i = 0; i < graph[curr.vertex].size(); i++) {
                Edge e = graph[curr.vertex].get(i);// gets each edge of the node i.e neighbours
                int u = e.src;// stores the source
                int v = e.dest;// stores the destination
                int wt = e.wt;// stores the weight or cost of each flight
                //relaxation step
//                if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v] && curr.stops <= k) {
//                    dist[v] = dist[u] + wt;// updated destinated distance
//                    q.add(new Info(v, dist[v], curr.stops + 1));
//                }
                if(curr.cost+wt<dist[v]&&curr.stops<=k){
                    dist[v]= curr.cost+wt;
                    q.add(new Info(v,dist[v],curr.stops+1));
                }
            }
        }

        if (dist[dest] == Integer.MAX_VALUE) {
            return -1;// if the distance remains unchanged  then return -1
        }
        else {
            return dist[dest];
        }
        
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] flights = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };
        int src = 0, dest = 3, k = 1;
        System.out.println(cheapest(n, flights, src, dest, k));
    }
}
