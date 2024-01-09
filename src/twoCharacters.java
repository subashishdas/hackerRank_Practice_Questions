import java.util.ArrayList;
import java.util.HashSet;


public class twoCharacters {
    public static int alternate(String s){
        HashSet<Character> set = new HashSet<>();

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            set.add(ch);
        }
        ArrayList<Character> list = new ArrayList<>(set);
        int max = 0;
        int n = list.size();
        for(int i = 0;i<n-1;i++){
            for(int j = i + 1;j<n;j++){
                char c1 = list.get(i);
                char c2 = list.get(j);

                int res = validateAndLength(c1,c2,s);
                max = Math.max(max,res);
            }
        }
            return max;
    }
    public static int validateAndLength(char c1,char c2,String s){
        char lastChar = 0;
        int count = 0;

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == c1 || ch == c2){
                if(lastChar == ch){
                    return 0;
                }else{
                    lastChar = ch;
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
    String s = "beabeefeab";
    int res = alternate(s);
        System.out.println(res);
    }
}
