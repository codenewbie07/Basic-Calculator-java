import java.util.*;
public class Javabasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        float a = sc.nextFloat();
        System.out.println("Enter second number: ");
        float b = sc.nextFloat();
        System.out.println("Enter operator: ");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+' : System.out.println(a+b);
                        break;
            case '-' : System.out.println(a-b);
                        break;
            case '*' : System.out.println(a*b);
                        break;
            case '/' : System.out.println(a/b);
                        break;
            case '%' : System.out.println(a%b);
                        break;
            default : System.out.println("Calculator is not that advance right now");
        }

    }
}