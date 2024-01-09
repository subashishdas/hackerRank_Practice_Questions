public class pangrams {
    public static String checkPangrams(String s){
        boolean [] alphabet = new boolean[26];
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                alphabet[Character.toLowerCase(c) - 'a'] = true;
            }
        }
        for(boolean present : alphabet){
            if(!present){
                return "not pangrams";
            }
        }
        return "pangrams";
    }
    public static void main(String[] args) {
        String s = "We promptly judged antique ivory buckles for the next prize";
        String res = checkPangrams(s);
        System.out.println(res);
    }
}
