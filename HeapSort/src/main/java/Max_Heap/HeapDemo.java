package Max_Heap;

public class HeapDemo {

    public static void main(String[] args) {
        Heap h = new Heap(10);

        h.insert(80);
        h.insert(75);
        h.insert(60);
        h.insert(68);
        h.insert(55);
        h.insert(40);
        h.insert(52);
        h.insert(67);

//        h.printHeap();

//        h.delete(0);
//        h.printHeap();
//        System.out.println(h.peek());

        h.sort();
        h.printHeap();
    }
}
