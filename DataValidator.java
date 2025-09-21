import java.util.HashSet;
import java.util.Set;

class DataValidator {
    /**
     * TO-DO: Efficiently check for duplicates in an array using a HashSet.
     * The method should stop and return true as soon as the first duplicate is found.
     \*
     * @param items The array of strings to check.
     * @return true if duplicates exist, false otherwise.
     */
    public boolean hasDuplicates(String[] items) {
        Set<String> seenItems = new HashSet<>();
        // Your code here. Use the return value of set.add() to detect a duplicate.

        for (String s: items){
            if (!seenItems.add(s)) return true;
        }
        return false; // Placeholder
    }
}