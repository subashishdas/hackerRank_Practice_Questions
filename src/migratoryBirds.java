import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class migratoryBirds {

    public static int commonBirds(List<Integer> arr){
       HashMap <Integer,Integer> birdMap = new HashMap<>();

       for(int birdType : arr){
           birdMap.put(birdType, birdMap.getOrDefault(birdType , 0) + 1);
       }

       int commCount = -1;
       int maxCount = 0;

       for(Map.Entry<Integer,Integer> entry : birdMap.entrySet()){
           int birdType = entry.getKey();
           int count = entry.getValue();

           if(count > maxCount || (count == maxCount && birdType < commCount )){
               maxCount = count;
               commCount = birdType;

           }
       }
       return commCount;

    }
    public static void main(String[] args) {
        List<Integer> birdSightings = List.of(1, 2, 2, 3, 4, 4, 4, 5, 5);
        int result = commonBirds(birdSightings);
        System.out.println("Most common bird type: " + result);
    }
}
