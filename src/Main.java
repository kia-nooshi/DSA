import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        //queue = FIFO data structure. First-In First-Out (ex. A line of people)
        //        A collection desgined for holding elements prior to processing
        //        Linear data structure

        //        add = enqueue, offer()
        //        remove = dequeue, poll()

        //since queue is an interface you can't instantiate it directly that is why we
        //call a LinkedList and instantiate that instead
        Queue<String> queue = new LinkedList<>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.peek());

        System.out.println(queue);

        System.out.println(queue.size());
        System.out.println(queue.contains("Steve"));

        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);

        queue.poll(); //poll does not throw an exception
        System.out.println(queue);

        System.out.println(queue.isEmpty());

        //where are queues useful?

        //1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
        //2. Printer queue (Print jobs should be completed in that order)
        //3. Used in LinkedLists, Priority Queues, Breadth-first search






    }
}