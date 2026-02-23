package GeneralPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMapsExample {
    public static void main(String[] args) {
        // 1. Declare the List of Maps
        List<Map<String, Object>> employeeRecords = new ArrayList<>();

        // --- Record 1 ---
        Map<String, Object> emp1 = new HashMap<>();
        emp1.put("id", 101);
        emp1.put("name", "Alice Johnson");
        emp1.put("department", "HR");
        employeeRecords.add(emp1);

        // --- Record 2 ---
        Map<String, Object> emp2 = new HashMap<>();
        emp2.put("id", 102);
        emp2.put("name", "Bob Smith");
        emp2.put("department", "Engineering");
        employeeRecords.add(emp2);

        // 2. Accessing Data (Getting Alice's name)
        System.out.println("--- List of Maps Example (Tabular Data) ---");
        
        // Get the first item (Map) in the List (index 0)
        Map<String, Object> firstRecord = employeeRecords.get(0);
        
        // Get the value associated with the "name" key in that Map
        String aliceName = (String) firstRecord.get("name");
        
        System.out.println("Employee 1 Name: " + aliceName); // Output: Alice Johnson

        // 3. Iterating over the structure
        for (Map<String, Object> record : employeeRecords) {
            String id = record.get("id").toString();
            String name = (String) record.get("name");
            System.out.println("ID: " + id + ", Name: " + name);
        }
    }
}
