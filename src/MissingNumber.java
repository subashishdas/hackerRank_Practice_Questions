import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MissingNumber {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        List<Integer> result = new ArrayList<>();

        // Create HashMaps to store the frequency of numbers in both lists
        Map<Integer, Integer> frequencyArr = new HashMap<>();
        Map<Integer, Integer> frequencyBrr = new HashMap<>();

        // Populate the frequencyArr HashMap
        for (int num : arr) {
            frequencyArr.put(num, frequencyArr.getOrDefault(num, 0) + 1);
        }

        // Populate the frequencyBrr HashMap
        for (int num : brr) {
            frequencyBrr.put(num, frequencyBrr.getOrDefault(num, 0) + 1);
        }

        // Compare the frequencies to identify missing numbers
        for (int num : frequencyBrr.keySet()) {
            int countInArr = frequencyArr.getOrDefault(num, 0);
            int countInBrr = frequencyBrr.get(num);

            if (countInArr < countInBrr) {
                result.add(num);
            }
        }

        return result;
    }


    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 3, 4, 5);
        List<Integer> brr = List.of(2, 3, 1, 0, 5, 4, 6);

        List<Integer> missingNumbersList = missingNumbers(arr, brr);
        System.out.println("Missing Numbers: " + missingNumbersList);
    }
}
