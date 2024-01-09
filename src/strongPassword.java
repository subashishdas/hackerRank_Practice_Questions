public class strongPassword {
    public static int minimumNumber(int n ,String s){
        String numbers = ".*[0-9].*";
        String lower_case = ".*[a-z].*";
        String upper_case = ".*[A-Z].*";
        String special_characters = ".*[!@#$%^&*()-+].*";

       int count = 0;


           if(!s.matches(numbers)){
               count++;
           }

           if(!s.matches(lower_case)){
               count++;
           }
           if(!s.matches(upper_case)){
               count++;
           }
           if(!s.matches(special_characters)){
               count++;
           }

           if(n + count < 6){
               count += Math.max(0, 6 - (n + count));
           }


       return count;
    }
    public static void main(String[] args) {
        String password = "AUzs-nV";
        int n = password.length();
        int result = minimumNumber(n,password);
        System.out.println(result);
    }
}
