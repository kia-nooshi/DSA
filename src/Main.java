import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Can just use the arraylist object as that also works the same as a dynamic array
        //ArrayList<String> arraylist = new ArrayList<String>();

        DynamicArray dynamicArray = new DynamicArray(5);


        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");


        dynamicArray.delete("F");
        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");


        dynamicArray.insert(0, "X");
        dynamicArray.delete("B");
        System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray.toString());
        System.out.println("empty: " + dynamicArray.isEmpty());
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);

    }
}