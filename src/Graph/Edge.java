package Graph;

public class Edge {
    private int weight;
    private int p;
    private int q;

    public int getWeight(Edge e){
        return e.weight;
    }

    public int vertex(){
        return p;
    }

    public int other(Edge e){
     if(e.vertex() == p) return p;
     else return q;



    }






}
