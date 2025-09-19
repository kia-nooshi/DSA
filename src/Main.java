import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0; i< 1000000; i++){
            linkedList.add(i);  //can add primitives because of Java Autoboxing
            arrayList.add(i);
        }


        //*************************LinkedList**************************
            startTime = System.nanoTime();

            //do something
            //linkedList.get(999999);
            linkedList.remove(999999);

            endTime = System.nanoTime();

            elapsedTime = endTime - startTime;

            System.out.println("LinkedList:\t " + elapsedTime + " ns");

        //*************************ArrayList**************************
            startTime = System.nanoTime();

            //do something
            //arrayList.get(999999);
            arrayList.remove(999999 );

            endTime = System.nanoTime();

            elapsedTime = endTime - startTime;

            System.out.println("ArrayList:\t " + elapsedTime + " ns");

    }
}