public class Driver {

    public static void main(String[] args) {

        // Exercise 1

        ArrayQ arrayq = new ArrayQ(); //creates instance of ArrayQ
        LinkedQueue linkq = new LinkedQueue(); //creates instance of LinkedQueue

        //adding ints from assignment into instanced array queue
        arrayq.enqueue(1);
        arrayq.enqueue(7);
        arrayq.enqueue(3);
        arrayq.enqueue(4);
        arrayq.enqueue(9);
        arrayq.enqueue(2);

        //adding ints from assignment into instanced linked queue
        linkq.enqueue(1);
        linkq.enqueue(7);
        linkq.enqueue(3);
        linkq.enqueue(4);
        linkq.enqueue(9);
        linkq.enqueue(2);

        //removing each int from array queue, displaying each number
        System.out.println("ArrayQ:");
        while (arrayq.size() > 0) {
            System.out.println(arrayq.dequeue());
        }
        System.out.println("");

        //removing each int from linked queue, displaying each number
        System.out.println("LinkedQueue:");
        while (linkq.size() > 0) {
            System.out.println(linkq.dequeue());
        }

        //Exercise 2

        //adding to linked queue for Exercise 2
        linkq.enqueue(1);
        linkq.enqueue(7);
        linkq.enqueue(3);
        linkq.enqueue(4);
        linkq.enqueue(9);
        linkq.enqueue(2);

        linkq.removeMiddle();

        System.out.println("\nRemoved middle:\n");
        while (linkq.size() > 0) {
            System.out.println(linkq.dequeue());
        }
    }
}
