import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Hello, Voluspa!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the rows to print: ");
        int row = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}