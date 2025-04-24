package t1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This program processes three lists (list1, list2, and list3) with predefined values.
 * The operations performed include:
 * - Creating and initializing list1 (integers) and list2 (strings)
 * - Creating list3 by using values from list1 as indices to select elements from list2
 * - Handling potential index out of bounds scenarios
 */
public class task1 {

    public static void main(String[] args) {
        // Initialize list1 with integer values
        List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 1, 5, 8, 6, 4, 9, 7, 3, 10));
        System.out.println("list1 (indices): " + list1);

        // Initialize list2 with string values
        List<String> list2 = new ArrayList<>(Arrays.asList(
            "Irb", "kwx", "zuc", "pzl", "ths", "hdn", "vzf", "xfm", "jjb", "bgx", "drw", "tfh"
        ));
        System.out.println("list2 (elements): " + list2);

        // Create list3 by using list1 values as indices for list2
        List<String> list3 = createList3(list1, list2);
        System.out.println("list3 (result): " + list3);
    }

    /**
     * Creates list3 by using values from list1 as indices to select elements from list2.
     * Handles cases where index might be out of bounds by skipping those values.
     * 
     * @param indices list of indices (from list1)
     * @param elements list of elements (from list2)
     * @return new list created by selecting elements from list2 using list1 indices
     */
    private static List<String> createList3(List<Integer> indices, List<String> elements) {
        List<String> result = new ArrayList<>();
        
        for (Integer index : indices) {
            // Check if index is within bounds of list2
            if (index - 1 >= 0 && index - 1 < elements.size()) {
                result.add(elements.get(index - 1));
            } else {
                System.out.println("Warning: Index " + (index - 1) + " is out of bounds for list2");
            }
        }
        
        return result;
    }
}
