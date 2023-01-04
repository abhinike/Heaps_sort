import PriorityQueue.BinaryHeap;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        BinaryHeap<Character> bp = new BinaryHeap<Character>(20);

//       boolean a =  bp.less(3,3);
//        System.out.println(a);
        bp.insert('Y');
        bp.insert('Q');
        bp.insert('O');
        bp.insert('I');
        bp.insert('A');
        bp.insert('B');



        System.out.println(bp.delMax());
        System.out.println(bp.delMax());
        System.out.println(bp.delMax());
        System.out.println(bp.delMax());
        System.out.println(bp.delMax());
        System.out.println(bp.delMax());

    }
}