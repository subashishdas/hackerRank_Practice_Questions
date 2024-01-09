import java.util.ArrayList;
import java.util.List;

public class breakingTheRecords {

    public static List<Integer> breakingRecord(List<Integer> scores){
        List<Integer> result = new ArrayList<>();
        int max = scores.get(0);
        int min = scores.get(0);
        int maxCount = 0;
        int minCount = 0;
        for(int num : scores){
            if(num < max){
                max = num;
                maxCount++;
            }else if(num > min){
                min = num;
                minCount++;
            }
        }

        result.add(minCount);
        result.add(maxCount);

        return result;
    }
    public static void main(String[] args) {
        List<Integer> scores = List.of(10,5,20,20,4,5,2,25,1);
        List<Integer> result = breakingRecord(scores);
        System.out.println(result);

    }
}
