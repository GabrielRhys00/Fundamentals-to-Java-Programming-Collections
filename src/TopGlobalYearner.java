import java.util.Scanner;

public class TopGlobalYearner {

    public static void main(String[] args) throws Exception {
        Scanner bby = new Scanner(System.in);

        int burger = 55;
        int fries = 60;
        int stapeghi = 100;
        int drinks = 40;
        int qty;
        int total;
        int change;

        for (int ulit = 0; ulit <= 5; ulit++) {
            System.out.println("\n=========OREDERING SYSTEM =========");
            System.out.println("    Menu    ");
            System.out.println("1.  Burger  -   -   -   55");
            System.out.println("2.  Fries   -   -   -   60");
            System.out.println("3.  Stapeghi    -   -   100");
            System.out.println("4.  Drinks  -   -   -   40");
            System.out.print("Enter Order:    ");
            int baby = bby.nextInt();
            System.out.println("==================================");

            switch (baby) {
                case 1:
                    System.out.println("Burger  -   -   -   55");
                    System.out.print("Qty:    ");
                    qty = bby.nextInt();
                    total = (burger * qty);
                    System.out.println("Total:  " + total);
                    System.out.print("Cash:   ");
                    int brgrCash = bby.nextInt();
                    change = brgrCash - total;
                    if (change >= total) {
                        System.out.println("Change: " + change);
                    } else if (change < total) {
                        System.out.println("BAWAL UTANG!!   \nYour change:  " + change);
                    } else {
                        System.out.println("Invalid input. Please check your input.");
                    }
                    break;

                case 2:
                    System.out.println("Fries   -   -   -   60");
                    System.out.print("Qty:    ");
                    qty = bby.nextInt();
                    total = (fries * qty);
                    System.out.println("Total:  " + total);
                    System.out.print("Cash:   ");
                    int friesCash = bby.nextInt();
                    change = friesCash - total;
                    if (change >= total) {
                        System.out.println("Change: " + change);
                    } else if (change < total) {
                        System.out.println("BAWAL UTANG!!   \nYour change" + change);
                    } else {
                        System.out.println("Invalid input. Please check your input.");
                    }
                    break;

                case 3:
                    System.out.println("Stapeghi    -   -   100");
                    System.out.print("Qty:    ");
                    qty = bby.nextInt();
                    total = (stapeghi * qty);
                    System.out.println("Total:  " + total);
                    System.out.print("Cash:   ");
                    int stapeghiCash = bby.nextInt();
                    change = stapeghiCash - total;
                    if (change >= total) {
                        System.out.println("Change: " + change);
                    } else if {
                        System.out.println("BAWAL UTANG!!   \nYour change" + change);
                    } else {
                        System.out.println("Invalid input. Please check your input.");
                    }
                    break;

                case 4:
                    System.out.println("Drinks  -   -   -   40");
                    System.out.print("Qty:    ");
                    qty = bby.nextInt();
                    total = (drinks * qty);
                    System.out.println("Total:  " + total);
                    System.out.print("Cash:   ");
                    int drinksCash = bby.nextInt();
                    change = drinksCash - total;
                    if (change >= total) {
                        System.out.println("Change: " + change);
                    } else if {
                        System.out.println("BAWAL UTANG!!   \nYour change" + change);
                    } else {
                        System.out.println("Invalid input. Please check your input.");
                    }
                    break;

                default:
                    System.out.println("Invalid input.");
            }

        }
    }

    /*
     * for (int i = 0; i <= 5; i++) {
     * System.out.println("========= MIDTERM GRADE =========");
     * System.out.print("Enter student's name:    ");
     * String pogi = bby.nextLine();
     * System.out.print("Enter Quiz#1:    ");
     * int mahal = bby.nextInt();
     * System.out.print("Enter Quiz#2:    ");
     * int mo = bby.nextInt();
     * System.out.print("Enter Midterm Exam Grade:    ");
     * int bako = bby.nextInt();
     * int hoy = (mahal + mo + bako) / 3;
     * if (hoy >= 75 && hoy <= 100) {
     * System.out.println("\nYour Average Midterm Grade is " + hoy);
     * 
     * System.out.println("Remarks: PASSED");
     * } else if (hoy >= 0 && hoy <= 74) {
     * System.out.println("\nYour Average Midterm Grade is " + hoy);
     * System.out.println("Remarks: Failed");
     * } else {
     * System.out.println("Invalid input. Please check your input.");
     * }
     * 
     * System.out.println("\n========= FINAL GRADE =========");
     * System.out.print("Enter Quiz#1:    ");
     * int palambing = bby.nextInt();
     * System.out.print("Enter Quiz#2:    ");
     * int po = bby.nextInt();
     * System.out.print("Enter Final Exam Grade:    ");
     * int ako = bby.nextInt();
     * int baby = (palambing + po + ako) / 3;
     * if (baby >= 75 && baby <= 100) {
     * System.out.println("\nYour Average Final Grade is " + baby);
     * System.out.println("Remarks: PASSED");
     * } else if (baby >= 0 && baby <= 74) {
     * System.out.println("\nYour Average Final Grade is " + baby);
     * System.out.println("Remarks: Failed");
     * } else {
     * System.out.println("Invalid input. Please check your input.");
     * }
     * 
     * int psst = (hoy + baby) / 2;
     * if (psst >= 75 && psst <= 100) {
     * System.out.println("\n=====================================");
     * System.out.println("Student's Name: " + pogi);
     * System.out.println("Your Overall Grade is " + psst);
     * System.out.println("Remarks: PASSED");
     * } else if (psst >= 0 && psst <= 74) {
     * System.out.println("\n======================================");
     * System.out.println("Student's Name: " + pogi);
     * System.out.println("Your Overall Grade is " + psst);
     * System.out.println("Remarks: Failed");
     * } else {
     * System.out.println("Invalid input. Please chesck your input.");
     * }
     * System.out.println("====================================\n\n");
     * 
     * }
     */
   
}
