package QueueArray;

import java.util.Queue;

public class ArrayQueueDemo {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 133);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        /*ArrayQueue queue = new ArrayQueue(10);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);*/

        //queue.printQueue();

        //System.out.println("Element Removed : "+queue.remove());
        //System.out.println("Element Removed : "+queue.remove());

        ArrayQueue queue = new ArrayQueue(5);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.remove();
        queue.add(marySmith);
        queue.remove();
        queue.add(mikeWilson);
        queue.remove();
        queue.add(billEnd);
        queue.remove();
        queue.add(janeJones);

        queue.printQueue();
    }
}
