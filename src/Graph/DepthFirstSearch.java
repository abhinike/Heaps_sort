package Graph;

import java.util.Stack;

public class DepthFirstSearch {
    private boolean[] marked;
    private int s;
    private int[] edgeTo ;

    public DepthFirstSearch(Graph G, int s){
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        this.s = s;

        dfs(G , s);

    }

//    similiar to maze problem where to go to adjecent vertex
//    see if it is marked if not then call dfs on it
//    also save the route to the vextex
    public void dfs(Graph G , int v){
        marked[v] = true;
        for (int w : G.adj(v)){
            if(!marked[w]){
                dfs(G, w);
                edgeTo[w] = v;
            }
        }

    }


    public boolean hasPath(int v){
        return marked[v];

    }

    public Iterable<Integer> pathTo(int v){
        if (!marked[v]) return null;
        Stack<Integer> path = new Stack<Integer>();
        for (int x = v; x != s; x = edgeTo[v]){
            path.push(x);
        }
        path.push(s);
        return path;
    }

}
