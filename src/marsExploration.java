public class marsExploration {
    public static int countSOS(String s){
        int count = 0;
        for(int i = 0;i<s.length() ;i+=3){
            if(s.charAt(i) != 'S'){
                count++;
            }
            if(s.charAt(i + 1) != 'O'){
                count++;
            }
            if(s.charAt(i + 2) != 'S'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "SOSSPSSQSSOR";
        int res = countSOS(s);
        System.out.println(res);
    }
}
