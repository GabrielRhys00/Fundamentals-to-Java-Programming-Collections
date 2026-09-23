import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int result;

        for (int i = 0; i <=5; i++) {
            System.out.println("\n=========ODD OR EVEN CHECKER=========");
        System.out.print("Enter a number 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter a number 2: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter a number 3: ");
        int number3 = scanner.nextInt();

        System.out.print("Enter an operation (+, -, *, /): ");
        String operation = scanner.next();

        switch (operation) {
            case "+":
                result = number1 + number2 + number3;
                if (result % 2 == 0) {
                    System.out.println("The result is even " + result);
                } else {
                    System.out.println("The result is odd  " + result);
                }
                break;
            case "-":
                result = number1 - number2 - number3;
                if (result % 2 == 0) {
                    System.out.println("The result is even " + result);
                } else {
                    System.out.println("The result is odd  " + result);
                }
                break;
            case "*":
                result = number1 * number2 * number3;
                if (result % 2 == 0) {
                    System.out.println("The result is even " + result);
                } else {
                    System.out.println("The result is odd  " + result);
                }
                break;
            case "/":
                result = number1 / number2 / number3;
                if (result % 2 == 0) {
                    System.out.println("The result is even " + result);
                } else {
                    System.out.println("The result is odd  " + result);
                }
                break;
            default:
                System.out.println("Invalid operation.");
                scanner.close();
                return;
        }
    }
        scanner.close();
    }
}
