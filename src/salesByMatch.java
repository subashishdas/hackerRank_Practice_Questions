import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class salesByMatch {
    public static int sockMerchant(int n, List<Integer> arr) {
       Map<Integer,Integer> sockCount = new HashMap<>();

       for(int sock : arr){
           sockCount.put(sock,sockCount.getOrDefault(sock,0) + 1);
       }
       int pair = 0;

       for(int count : sockCount.values()){
           pair += count / 2;
       }
        return pair;
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 1, 3, 1, 2, 1, 3, 3, 3, 3);
        int n = arr.size();
        int res = sockMerchant(n, arr);
        System.out.println(res);
    }
}
