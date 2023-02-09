package Graph;

public class Function_on_Graph {
//    return number of deree
    public static int degree(Graph G, int v){
        int degree = 0;
        for(int i : G.adj(v)) degree ++;
        return degree;

    }

//    return maxdegree for a paritcular graph
    public static int maxDegree(Graph G){
        int max = 0;
        for (int v = 0; v < G.V(); v++)
            if (degree(G, v) > max)
                max = degree(G, v);
        return max;
    }

//    compute avergae degree
//    public static Double avgDegree(Graph G){
//        return ((2.0 * G.E())/G.V());
//    }

//    count self-loops
    public static int numberOfSelfLoops(Graph G){
        int count = 0;
        for (int v = 0; v < G.V(); v++){
            for (int w : G.adj(v)){
                if (v == w) count++;
            }
        }
        return count;
    }



}
