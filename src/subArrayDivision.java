import java.util.List;

public class subArrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count = 0;

        if (s.size() >= m) {
            for (int i = 0; i <= s.size() - m; i++) {
                int sum = 0;

                for (int j = i; j < i + m; j++) {
                    sum += s.get(j);
                }

                if (sum == d) {
                    count++;
                }
            }
        }
         return count;
    }

        public static void main (String[]args){
        List<Integer> list = List.of(4);
        int d = 4;
        int m = 1;
        int result = birthday(list,d,m);
        System.out.println(result);
    }
}
