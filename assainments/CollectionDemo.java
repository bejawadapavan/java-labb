import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo {
    public static void main(String[] args) {

        // List Example
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        System.out.println("List Elements:");
        System.out.println(fruits);

        // Set Example
        Set<String> uniqueFruits = new HashSet<>();
        uniqueFruits.add("Apple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Apple");
        uniqueFruits.add("Orange");

        System.out.println("\nSet Elements:");
        System.out.println(uniqueFruits);

        // Check if an element exists
        System.out.println("\nContains Banana? " + uniqueFruits.contains("Banana"));

        // Remove an element
        uniqueFruits.remove("Orange");

        System.out.println("After Removing Orange:");
        System.out.println(uniqueFruits);

        // Size of Set
        System.out.println("Size of Set: " + uniqueFruits.size());
    }
}