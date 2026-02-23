package GeneralPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_of_List {
    public static void main(String[] args) {
        // 1. Declare the Map of Lists
        Map<String, List<String>> productCategories = new HashMap<>();

        // --- Category 1: Fruits ---
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange");
        productCategories.put("Produce-Fruits", fruits);

        // --- Category 2: Dairy ---
        List<String> dairy = new ArrayList<>();
        dairy.add("Milk");
        dairy.add("Cheese");
        productCategories.put("Dairy", dairy);

        // 2. Accessing Data (Getting the first fruit)
        System.out.println("\n--- Map of Lists Example (Grouped Data) ---");
        
        // Get the List associated with the "Produce-Fruits" key
        List<String> fruitList = productCategories.get("Produce-Fruits");
        
        // Get the item at index 0 in that List
        String firstFruit = fruitList.get(0);
        
        System.out.println("First Fruit: " + firstFruit); // Output: Apple

        // 3. Iterating over the structure
        for (Map.Entry<String, List<String>> entry : productCategories.entrySet()) {
            String category = entry.getKey();
            List<String> items = entry.getValue();
            System.out.println("Category: " + category);
            System.out.println("  Items: " + items);
        }
    }
}