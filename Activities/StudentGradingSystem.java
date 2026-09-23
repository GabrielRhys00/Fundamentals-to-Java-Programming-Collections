public class StudentGradingSystem {
    public static void main(String[] args) {
        int prelim = 85;
        int midterm = 88;
        int finalExam = 92;
        int totalScore = prelim + midterm + finalExam;
        int averageScore = totalScore / 3;
        boolean passed = averageScore >= 75;
        int attendance = 90;
        int projects = 85;
        boolean eligiblity = (averageScore >= 75) && (finalExam >= 75) && (attendance >= 75) && (projects >= 75)
                && (projects >= 75);
        System.out.println("======STUDENT GRADING SYSTEM======");
        System.out.println("\nPrelim Score: " + prelim);
        System.out.println("Midterm Score: " + midterm);
        System.out.println("Final Exam Score: " + finalExam);
        System.out.println("\nTotal Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Attendance: " + attendance);
        System.out.println("Projects: " + projects);
        if (passed) {
            System.out.println("Passed: true");
        } else {
            System.out.println("Passed: false");
        }
        if (eligiblity) {
            System.out.println("Eligible: true");
        } else {
            System.out.println("Eligible: false");
        }
        System.out.println("===================================");
    }
}