public class camelCase {
    public static int breakIntoWords(String s){
        if(s.isEmpty())
            return 0;

        int count = 1;
        for(char c : s.toCharArray()){
            if(Character.isUpperCase(c))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "saveChangesInTheEditor";
        int result = breakIntoWords(s);
        System.out.println(result);
    }
}
