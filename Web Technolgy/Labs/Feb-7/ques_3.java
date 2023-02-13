package Feb_7;

public class ques_3 {
    public static void main(String[] args) {
        int marks = 85;

        if(marks>=90) {
            System.out.println("O");
        }
        else if(marks<90 && marks>=89) {
            System.out.println("E");
        }
        else if(marks<89 && marks>=79) {
            System.out.println("A");
        }
        else if(marks<79 && marks>=69) {
            System.out.println("B");
        }
        else if(marks<69 && marks>=59) {
            System.out.println("C");
        }
        else {
            System.out.println("F");
        }
    }
}
