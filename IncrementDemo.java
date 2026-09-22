public class IncrementDemo {

    public static void main(String[] args) {
        int x = 10;

        System.out.println("Original value of x: " + x);
        System.out.println("\nValue of x after pre-increment (++x): " + (++x));
        System.out.println("Current value of x after pre-increment: " + x);

        System.out.println("\nValue of x after post-increment (x++): " + (x++));
        System.out.println("Current value of x after post-increment: " + x);

        System.out.println("\nValue of x after pre-decrement (--x): " + (--x));
        System.out.println("Current value of x after pre-decrement: " + x);

        System.out.println("\nValue of x after post-decrement (x--): " + (x--));
        System.out.println("Current value of x after post-decrement: " + x);

    }
}
