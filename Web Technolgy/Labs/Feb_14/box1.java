package Feb_14;
import java.util.*;
public class box1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        float l = sc.nextFloat();
        System.out.println("Enter width:");
        float w = sc.nextFloat();
        System.out.println("Enter height:");
        float h = sc.nextFloat();

        box0 b = new box0();
        b.setdim(l, w, h);
        b.volume();
    }
}
