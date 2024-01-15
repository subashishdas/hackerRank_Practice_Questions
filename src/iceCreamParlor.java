import java.util.ArrayList;
import java.util.List;

public class iceCreamParlor {
    public static List<Integer> icecreamParlor(int m ,List<Integer> arr){
        List<Integer> result = new ArrayList<>();
        int n = arr.size();
        for(int i = 0;i < n - 1;i++){
            for(int j = i + 1;j<n;j++){
                if(arr.get(i) + arr.get(j) == m){
                    result.add(i + 1);
                    result.add(j + 1);
                    return result;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 4, 5, 3, 2);
        int m = 4;
        System.out.println(icecreamParlor(m,list));
    }
}
