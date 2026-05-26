import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Comparator;

public class Main {
    public static void exampleOfSet(){
        // Create a Set object of type String using HashSet
        Set<String> cars = new HashSet<>();

        // Add elements to the set
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW"); // This duplicate is ignored
        cars.add("Mazda");

        // Print the size of the set
        System.out.println(cars.size());

        // Print the set (order is not guaranteed with HashSet)
        System.out.println(cars);

        // Check if an element exist using contains()
        boolean hasMazda = cars.contains("Mazda");
        boolean hasFiat = cars.contains("Fiat");
        System.out.println(hasMazda);
        System.out.println(hasFiat);

        // Interate through a Set using an enhanced for loop or an Iterator
        System.out.println("Loop tradicional");
        for(String car: cars){
            System.out.println(car);
        }

        System.out.println("Loop com iterator");
        Iterator<String> iterator = cars.iterator();
        while(iterator.hasNext()) {
            String car = iterator.next();
            System.out.println(car + " ");
        }

        // Remove an element using remove()
        cars.remove("Ford");

        // Print the size of the set
        System.out.println(cars.size());

        // Print the set (order is not guaranteed with HashSet)
        System.out.println(cars);
    }

    public static void exampleOfMap(){
        // Create a HashMap with String keys and Integer values
        HashMap<String, Integer> studentAges = new HashMap<>();

        // Add key-value pairs using the put() method
        studentAges.put("Alice", 20);
        studentAges.put("Bob", 22);
        studentAges.put("Charlie", 19);
        studentAges.put("David", 21);

        // Print the entire HashMap
        System.out.println("HashMap: " + studentAges);

        // Update an Element and include a new one
        studentAges.put("David", 22);
        studentAges.put("Edson", 21);

        // Print the entire HashMap
        System.out.println("HashMap after update David's age and include Edson: " + studentAges);

        // Access an element
        int bobAge = studentAges.get("Bob");
        System.out.println("Bob's age: " + bobAge);

        // Check if a key exists
        boolean hasEva = studentAges.containsKey("Eva");
        System.out.println("Contains key 'Eva'? " + hasEva);

        // Remove an element
        studentAges.remove("Charlie");
        System.out.println("HashMap after removing Charlie: " + studentAges);

        // Iterate through the HashMap
        for (Map.Entry<String, Integer> entry : studentAges.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

    }

	public static void exampleOfOrderedSet(){
		// LinkedHashSet: preserves insertion order
        Set<String> insertionOrderSet = new LinkedHashSet<>();
        insertionOrderSet.add("Apple");
        insertionOrderSet.add("Banana");
        insertionOrderSet.add("Carrot");
        System.out.println("LinkedHashSet (insertion order): " + insertionOrderSet);
        // Output: [Apple, Banana, Carrot]

        // TreeSet: maintains sorted order
        Set<String> sortedSet = new TreeSet<>();
        sortedSet.add("Banana");
        sortedSet.add("Apple");
        sortedSet.add("Carrot");
        System.out.println("TreeSet (sorted order): " + sortedSet);
        // Output: [Apple, Banana, Carrot]

        // TreeSet with custom comparator (reverse order)
        Set<String> reverseSortedSet = new TreeSet<>(Comparator.reverseOrder());
        reverseSortedSet.add("Banana");
        reverseSortedSet.add("Apple");
        reverseSortedSet.add("Carrot");
        System.out.println("TreeSet (reverse sorted order): " + reverseSortedSet);
        // Output: [Carrot, Banana, Apple]
	}

    public static void main(String[] args) {
        exampleOfSet();
        //exampleOfMap();
		exampleOfOrderedSet();
    }
}