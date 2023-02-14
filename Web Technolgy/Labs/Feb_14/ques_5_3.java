package Feb_14;
import java.util.*;
public class ques_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = sc.nextInt();
        System.out.println("Enter number:");
        int y = sc.nextInt();
        int z = y;

        while(x!=0){
            int num = x%10;
            while(z!=0){
                int rem= z%10;
                if(rem == num){
                    System.out.println(rem);
                }
                z = z/10;
            }
            x = x/10;
            z = y;
        }
    }
}
