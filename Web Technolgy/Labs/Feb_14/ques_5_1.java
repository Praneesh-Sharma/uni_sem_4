package Feb_14;
import java.util.*;
public class ques_5_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();
        System.out.println("Enter third number: ");
        int z = sc.nextInt();

        if(x>y && x>z){
            System.out.println("Largest:" + x);
        }
        else if(y>z){
            System.out.println("Largest: " + y);
        }
        else{
            System.out.println("Largest: " + z);
        }
    }
}
