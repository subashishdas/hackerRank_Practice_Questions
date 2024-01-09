import java.util.List;

public class betweenTwoSets {

    private static int findMax(List<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int num : list){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    private static int findMin(List<Integer> list){
        int min = Integer.MAX_VALUE;
        for(int num : list){
            if(num < min){
                min = num;
            }
        }
        return min;
    }

    private static boolean isFactorOfA(int num , List<Integer> list){
        for(int ele : list){
            if( ele % num != 0){
                return false;
            }
        }
        return true;
    }

    private static boolean isMultipleOfB(int num , List<Integer> list){
        for(int ele : list){
            if(num % ele != 0){
                return false;
            }
        }
        return true;
    }




    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int maxA = findMax(a);
        int minB = findMin(b);
        int count = 0;

        for(int i = maxA;i<= minB;i++){
            if(isFactorOfA(i,a) && isMultipleOfB(i,b)){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        List<Integer> a = List.of(2,4);
        List<Integer> b = List.of(16,32,96);

        int result = getTotalX(a,b);
        System.out.println(result);
    }
}
