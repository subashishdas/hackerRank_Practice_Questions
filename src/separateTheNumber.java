public class separateTheNumber {
    public static void separateNumber(String s){
        int length = s.length();

        if(length == 1){
            System.out.println("No");
            return;
        }
        for(int i = 0;i<=length/2;i++) {
            long firstNum = Long.parseLong(s.substring(0, i));
            StringBuilder seq = new StringBuilder(String.valueOf(firstNum));
            long currNum = firstNum;

            while (seq.length() < length){
                currNum++;
                seq.append(currNum);
            }
            if(seq.toString().equals(s)){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
    public static void main(String[] args) {
        String s = "123124125";

      separateNumber(s);
    }
}
