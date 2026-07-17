import java.util.HashMap;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        String text = "Java is easy Java is powerful Java is fun";

        // Convert to lowercase and split into words
        String[] words = text.toLowerCase().split("\\s+");

        // Create HashMap
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Count frequency of each word
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // Display the frequency of each word
        System.out.println("Word Frequencies:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + " : " + wordCount.get(word));
        }
    }
}