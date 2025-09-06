import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //stack = LIFO data structure. Last-In First-Out
        //        stores object into a sort of "vertical tower"
        //        .push() to add to the top
        //        .pop() to remove from the top
        //        .search() to return location of an object in stack
        //        (returns -1) if object is not there
        //        .peek() returns top value of stack without popping it
        //        .empty() returns true/false if stack is empty
        //        stacks can run out of memory (OutOfMemoryError)

        //uses of stacks (ex)
        // 1) undo/redo features in text editors
        // 2) moving back/forward through browser history
        // 3) backtracking algorithms (maze, file directories)
        // 4) calling functions (call stack)

        Stack<String> stack = new Stack<>();

        System.out.println(stack.empty());

        stack.push("COD");
        stack.push("FIFA");
        stack.push("Ghost of Tsushima");
        stack.push("Legend of Zelda");

        System.out.println(stack.empty());

        System.out.println(stack);
        System.out.println(stack.search("Ghost of Tsushima"));
        //^ returns location of argument object in stack starting with position of 1 and counting up
        //1 is the top of the stack
        System.out.println(stack.search("NBA2K"));
        //if object is not in the stack .search() return -1

        stack.pop(); //removes LOZ
        System.out.println(stack);

        System.out.println(stack.peek()); //returns the top value of the stack without popping it
        System.out.println(stack);

        stack.pop(); //removes Ghost of Tsushima
        System.out.println(stack);

        String myFavGame = stack.pop(); //removes FIFA and assigns it to something
        System.out.println(myFavGame);
        System.out.println(stack);


        stack.pop(); //removes COD
        System.out.println(stack); //prints an empty stack
        //stack.pop(); //throws an exception






    }
}