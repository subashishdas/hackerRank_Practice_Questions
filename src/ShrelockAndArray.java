import java.util.List;
public class ShrelockAndArray {
        public static String balancedSums(List<Integer> arr) {
            int totalSum = 0;
            int leftSum = 0;

            // Calculate the total sum of the array
            for (int num : arr) {
                totalSum += num;
            }

            // Iterate through the array to find the index with balanced sums
            for (int i = 0; i < arr.size(); i++) {
                // Update the total sum and check if the left and right sums are equal
                totalSum -= arr.get(i);
                if (leftSum == totalSum) {
                    return "YES"; // Array is balanced
                }
                leftSum += arr.get(i);
            }

            return "NO"; // No balanced index found
        }

        public static void main(String[] args) {
            // Example usage
            List<Integer> exampleArray = List.of(1, 2, 3, 3);
            System.out.println(balancedSums(exampleArray)); // Output: YES
        }
    }


