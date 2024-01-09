public class caesarCipher {
    public static String caserCipher(String s,int k){
        StringBuilder res = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);

            if(Character.isLetter(ch)){
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                char encrypted = (char) ((ch - base + k) % 26 + base);
                res.append(encrypted);
            }else{
                res.append(ch);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String mes = "!m-rB`-oN!.W`cLAcVbN/CqSoolII!SImji.!w/`Xu`uZa1TWPRq`uRBtok`xPT`lL-zPTc.BSRIhu..-!.!tcl!-U";
        int k = 62;
        String res = caserCipher(mes,k);
        System.out.println(res);
    }
}
