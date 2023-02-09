package Graph;

import Bag.Bag;

public class Graph {
    private final int V;
    private Bag<Integer>[] adj;

    //    to create a graph with given vextex

    public Graph(int V) {
        this.V = V;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++)
            adj[v] = new Bag<Integer>();
    }





//    create a edge with two vextex and add that to the Graph
    public void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
    }


//    Return a object that has all the adjecent vextex with the given vextex
    public Iterable<Integer> adj(int v){
        return adj[v];

    }

//    number of vextex
    public int V(){
        return this.V;
    }


//    number of edge
//    int E(){
//
//
//    }
//
////    string repedentation
//    String toString(){
//
//    }


}
