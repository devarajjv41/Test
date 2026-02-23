package GeneralPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda_function {

    public static void main(String[] args) {
        
        // Data for the examples
        List<String> cities = Arrays.asList("Paris", "London", "Tokyo", "Berlin");
        List<Integer> numbers = Arrays.asList(1, 4, 9, 16, 25);


        // --- Scenario 1: Collections Sorting (Implementing Comparator) ---
        
        System.out.println("--- 1. Sorting Example ---");
        System.out.println("Original List: " + cities);

        // Java 8+ using Lambda Expression
        // The lambda (s1, s2) -> s2.length() - s1.length() implements the 
        //Comparator interface's single abstract method: compare(T o1, T o2)
        // It sorts the list by string length, from longest to shortest.
        
        Collections.sort(cities, (s1, s2) -> s2.length() - s1.length());
        
        System.out.println("Sorted (Longest to Shortest Length): " + cities); 
        // Output: [London, Berlin, Tokyo, Paris]
        
        

        
        // --- Scenario 2: Threading (Implementing Runnable) ---
        
        System.out.println("\n--- 2. Threading Example ---");
        
        // Traditional approach would require an Anonymous Inner Class to implement the Runnable interface.
        // Lambda replaces the verbosity with a simple parameter list () and a block of code { ... }
        
        Runnable task = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread running, iteration: " + i);
            }
        };
        
        // Start the thread with the lambda-defined task
        new Thread(task).start();

        
        // --- Scenario 3: Stream API (Functional Operations) ---

        System.out.println("\n--- 3. Stream API Example ---");
        
        // Goal: Filter for numbers greater than 10, then multiply them by 2, and collect the results.
        
        List<Integer> processedNumbers = numbers.stream()
            // Filter: (n -> n > 10) is a Predicate (takes one input, returns boolean)
            .filter(n -> n > 10)
            
            // Map: (n -> n * 2) is a Function (takes one input, returns one output)
            .map(n -> n * 2) 
            
            // Collect the results into a new list
            .toList(); 

        System.out.println("Original Numbers: " + numbers);
        // Output: [1, 4, 9, 16, 25]
        
        System.out.println("Processed Numbers (>10, then *2): " + processedNumbers);
        // Output: [32, 50] (16*2 and 25*2)
    }
}
 