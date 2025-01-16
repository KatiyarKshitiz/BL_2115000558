import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        System.out.print("Chosse an operation (+, -, *, /): ");
        char operation = sc.next().charAt(0);
        int result = 0;

        switch (operation){
            case '+': result = num1 + num2;
                break;

            case '-': result = num1 - num2;
                break;

            case '*': result = num1 * num2;
                break;

            case '/': result = num1 / num2;
                break;

            default:
                System.out.println("Invalid Operation");
                break;
        }
        System.out.println("Result: " + result);
        sc.close();
    }
}