import PriorityQueue.BinaryHeap;
import PriorityQueue.BinaryHeapSort;

public class Main {
    public static void main(String[] args) {
//sort testing
        Comparable[] a = {1,2,3,4,3,2,1};

        BinaryHeapSort.sort(a);

        for (int i = 0 ; i< 7; i++){
            System.out.println(a[i]);
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