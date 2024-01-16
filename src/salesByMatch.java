import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class salesByMatch {
    public static int sockMerchant(int n, List<Integer> arr) {
        // Convert the immutable list to a mutable ArrayList
        List<Integer> mutableList = new ArrayList<>(arr);

        Collections.sort(mutableList);  // Sort the mutable list

        int count = 1;
        int pair = 0;

        for (int i = 0; i < n - 1; i++) {
            if (Objects.equals(mutableList.get(i), mutableList.get(i + 1))) {
                count++;
            } else {
                pair = pair + (count / 2);
                count = 1;
            }
        }
        return pair;
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20);
        int n = arr.size();
        int res = sockMerchant(n, arr);
        System.out.println(res);
    }
}
