public class StudentInformationSystem {

    public static void main(String[] args) {

        String studentName = "Juan";
        int age = 20;
        int prelim = 80;
        int midterm = 85;
        int finalExam = 90;
        int totalScore = prelim + midterm + finalExam;
        float averageScore = totalScore / 3f;
        int attendance = 90;
        int projects = 85;
        boolean passed = averageScore >= 75;
        boolean attendanceOK = attendance >= 75;
        boolean eligibility = (averageScore >= 75) && (finalExam >= 75) && (attendance >= 75) && (projects >= 75)
                && (projects >= 75);
        System.out.println("\n==================================");
        System.out.println("    Student Information System     ");
        System.out.println("==================================");

        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("\nPrelim: " + prelim);
        System.out.println("Midterm: " + midterm);
        System.out.println("Final Exam: " + finalExam);

        System.out.println("\nTotal Score: " + totalScore);
        System.out.println("Average Score: " + averageScore + "\n");

        if (passed) {
            System.out.println("Passed: true");
        } else {
            System.out.println("Passed: false");
        }
        if (attendanceOK) {
            System.out.println("Attendance OK: true");
        } else {
            System.out.println("Attendance OK: false");
        }
        if (eligibility) {
            System.out.println("Eligible: true");
        } else {
            System.out.println("Eligible: false");
        }
        System.out.println("\nNext Year Age: " + ++age);
        System.out.println("==================================\n");
    }
}