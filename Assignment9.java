/*
Remember that stacks/queues/linkedlists all work super similarly to arraylists, so i bet you $10 you could reference earlier HW if you get stuck....

1. Take the stack I created and find the maximum and minimum value
2. Find out how many elements were in the stack

3. Find the middle value of the linkedlist I created

4. Implement a real life example of any of the structures and do at least 3 operations to it
*/

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Stack<Integer> stax = new Stack<>();
        
        stax.push(70);
        stax.push(34);
        stax.push(807);
        stax.push(61);
        stax.push(28);
        stax.push(563);
        stax.push(492);
        stax.push(386);
        
        // getting max, min, and the count of the stack
        int max = Collections.max(stax); // using collections is super easy so why not use
        int min = Collections.min(stax);
        int count = stax.size();


        // returning all of our info that we found
        System.out.println("The max number in the stack is: " + max); 
        System.out.println("The min number in the stack is: " + min);
        System.out.println("The amount of elements in the stack are: " + count);
        
        
        
        
        
        LinkedList<Integer> linky = new LinkedList<>();

        linky.add(10);
        linky.add(20);
        linky.add(30);
        linky.add(40);
        linky.add(50);

        int midValue = linky.get(linky.size());
        int middleValue = midValue/2;
        System.out.println("The middle value of our list is: " + middleValue);


        // example of a FIFO - grocery store checkout line!
        LinkedList<String> grocerystore = new LinkedList();
        grocerystore.add("Philip"); // just adding people to the list to have stuff in it
        grocerystore.add("Melissa");
        grocerystore.add("Bob");

        // 3 DIFFERENT OPERATIONS
        grocerystore.getFirst(); // getting the first item in our list
        grocerystore.addFirst("Tom"); // adding something to the first index of the list
        grocerystore.removeLast(); // removing our last index of the list



    }
}
