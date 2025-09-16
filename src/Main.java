import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //LinkedList = stored Nodes in 2 parts(data + address)
        //             Nodes are in non-consecutive memory locations
        //             Elements are linked using pointers

        //                          Singly Linked List
        //          Node                   Node                  Node
        //      [data | address]   ->   [data | address] ->   [data | address]

        //                          Doubly Linked List
        //          Node                                 Node
        //   [address| data | address]   ->   [address | data | address]

        //advantages?
        // 1) Dynamic Data Structure (allocates needed memory while running)
        // 2) Insertion and Deletion of Nodes is easy O(1)
        // 3) No/Low memory waste

        //disadvantages?
        // 1) Greater memory usage (additional pointer)
        // 2) No random access of elements (no index [i])
        // 3) Accessing or searching elements is more time consuming. O(n)

        //uses?
        // 1) implement stacks/queues
        // 2) GPS navigation
        // 3) music playlist





        LinkedList<String> linkedList = new LinkedList<>();

        //you can treat the linkedlist as a stack
//        linkedList.push("A");
//        System.out.println(linkedList);
//        linkedList.push("B");
//        System.out.println(linkedList);
//        linkedList.push("C");
//        System.out.println(linkedList);
//        linkedList.push("D");
//        System.out.println(linkedList);
//        linkedList.push("F");
//        System.out.println(linkedList);
//        linkedList.pop();
//        System.out.println(linkedList);


        //You can also treat a linkedlist as a queue
        linkedList.offer("A");
        System.out.println(linkedList);
        linkedList.offer("B");
        System.out.println(linkedList);
        linkedList.offer("C");
        System.out.println(linkedList);
        linkedList.offer("D");
        System.out.println(linkedList);
        linkedList.offer("F");
        System.out.println(linkedList);
        linkedList.poll();
        System.out.println(linkedList);

        linkedList.add(4,"E");//still traverses the entire linkedlist
        System.out.println(linkedList);
        linkedList.remove("E");
        System.out.println(linkedList);

        System.out.println(linkedList.indexOf("F"));

        //looks at first node
        System.out.println(linkedList.peekFirst());
        //looks at last node
        System.out.println(linkedList.peekLast());

        linkedList.addFirst("0");
        linkedList.addLast("G");

        String first = linkedList.removeFirst();
        System.out.println(first);
        String last = linkedList.removeLast();
        System.out.println(last);





    }
}