import Graph.Graph;
import PriorityQueue.BinaryHeap;
import PriorityQueue.BinaryHeapSort;

import static Graph.Function_on_Graph.degree;
import Graph.DepthFirstSearch;
import static Graph.Function_on_Graph.maxDegree;

public class Main {
    public static void main(String[] args) {
////sort testing
//        Comparable[] a = {1,2,3,4,3,2,1, 7, 8, 9, 7, 3, 2, 1};
//
//        BinaryHeapSort.sort(a);
//
//        for (int i = 0 ; i< a.length; i++){
//            System.out.println(a[i]);
//        }


        Graph a = new Graph(3);
        a.addEdge(2, 1);
        a.addEdge(1, 0);
        a.addEdge(0, 2);
        for (int i : a.adj(2))
            System.out.println(i);

        System.out.println(maxDegree(a));
        DepthFirstSearch dfs = new DepthFirstSearch(a, 2);
        System.out.println(dfs.hasPath(1));
        for (int i : dfs.pathTo(1)){
            System.out.println(i);
        }










////        System.out.println("Hello world!");
//        BinaryHeap<Character> bp = new BinaryHeap<Character>(20);
//
////       boolean a =  bp.less(3,3);
////        System.out.println(a);
//        bp.insert('Y');
//        bp.insert('Q');
//        bp.insert('O');
//        bp.insert('I');
//        bp.insert('A');
//        bp.insert('B');
//
//
//        while(!bp.isEmpty()){
//            System.out.println(bp.delMax());
//
//        }


    }
}