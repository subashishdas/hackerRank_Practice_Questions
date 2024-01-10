import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class weightedUnifromStrings {
    public static List<String> weightedString(String s,List<Integer> queries){
        HashSet<Integer> weights = new HashSet<>();

        char currentChar = s.charAt(0);
        int currWeight = currentChar - 'a' + 1;
        weights.add(currWeight);

        for(int i = 1;i<s.length();i++){
            char nextChar = s.charAt(i);
            if(nextChar == currentChar){
                currWeight += nextChar - 'a' + 1;
            }else{
                currentChar = nextChar;
                currWeight += nextChar - 'a' + 1;
            }
            weights.add(currWeight);
        }

        List<String> result = new ArrayList<>();
        for(int query : queries){
            if(weights.contains(query)){
                result.add("Yes");
            }else{
                result.add("No");
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "abccddde";
        List<Integer> queries = List.of(1, 3, 12, 5, 9, 10);
        List<String> result = weightedString(s, queries);

        // Print the result
        System.out.println(result);
    }
}
