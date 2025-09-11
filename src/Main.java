import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        //Priority Queue = A Fifo data structure that serves elements
        //                 with the largest priorities first
        //                 before elements with Lower priority

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder()); //Descending order

        //Queue<Double> queue = new PriorityQueue<>(); using this puts it in Ascending order

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        Queue<String> queue2 = new PriorityQueue<>(); // Alphabetical order using Collections.reverseOrder(); will put it in reverse alphabetical order

        queue2.offer("B");
        queue2.offer("C");
        queue2.offer("A");
        queue2.offer("F");
        queue2.offer("D");

        while(!queue2.isEmpty()){
            System.out.println(queue2.poll());
        }


    }
}