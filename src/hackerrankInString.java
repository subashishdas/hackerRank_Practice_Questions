public class hackerrankInString {
    public static String checkSubString(String s){
        String target = "hackerrank";
        int targetIndex = 0;
        for(char c : s.toCharArray()){
            if(targetIndex < target.length() && c == target.charAt(targetIndex)){
                targetIndex++;
            }
        }
        return (targetIndex == target.length()) ? "Yes" : "No";
    }
    public static void main(String[] args) {
        String s = "hackerworld";
        String res = checkSubString(s);
        System.out.println(res);
    }
}
