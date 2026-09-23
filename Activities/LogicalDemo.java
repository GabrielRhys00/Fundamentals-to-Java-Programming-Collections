public class LogicalDemo {

    public static void main(String[] args) {

        System.out.println((5 > 3) && (8 > 5));
        System.out.println((5 > 3) && (8 < 5));
        System.out.println((5 < 3) || (8 > 5));
        System.out.println((5 > 3) || (8 < 5));
        System.out.println((5 < 3) || (8 < 5));
        System.out.println(!(5 == 3));
        System.out.println(!(5 > 3));

        // CHALLENGE
        int age = 20;
        boolean hasID = true;

        if (age >= 18 && hasID) {
            System.out.println("You can enter.");
        } else if (age < 18 && hasID) {
            System.out.println("You cannot enter. You are underage.");
        } else if (age >= 18 && !hasID) {
            System.out.println("You cannot enter. You do not have an ID.");
        } else {
            System.out.println("You cannot enter.");
        }

    }
}
