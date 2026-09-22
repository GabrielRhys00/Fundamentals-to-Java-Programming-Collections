public class OperatorDebug {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        /*
         * System.out.println("Sum =  " + (a + b));
         * System.out.println("Product =  " + (a * b));
         * System.out.println("Equal =  " + (a = b));
         * System.out.println("Greater =  " + (a > b));
         * System.out.println("Result =  " + a + b * 2       <= missing parentheses, should be System.out.println("Result =  " + (a + b * 2));)
         */

        // Corrected code with parentheses added
        System.out.println("Sum =  " + (a + b));
        System.out.println("Product =  " + (a * b));
        System.out.println("Equal =  " + (a = b));
        System.out.println("Greater =  " + (a > b));
        System.out.println("Result =  " + (a + b * 2));

    }
}
