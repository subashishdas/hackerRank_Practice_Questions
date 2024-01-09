import java.util.Scanner;

public class numberOfJumps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(); // 0
        int u = in.nextInt(); // 3
        int y = in.nextInt(); // 4
        int v = in.nextInt(); // 2

        String result = kangaroo(x,u,y,v);
        System.out.println(result);
    }

    public static String kangaroo(int x, int u, int y, int v){
        //Check both kangaroos land on same spot

        if(u == v){
            if(x == y){
                return "Yes";
            }else
                return "No";
        }
        if((y - x) % (u - v) == 0 && (y - x) /  (u - v) >= 0){
            return "Yes";
        }
        return "No";
    }
}
