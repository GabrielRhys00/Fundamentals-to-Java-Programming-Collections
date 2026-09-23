public class StudentScoreCalculator {

    public static void main(String[] args) {
        int score1 = 92;
        int score2 = 88;
        int score3 = 95;

        System.out.println("Student Score Calculator:");
        System.out.println("Score 1: " + score1);
        System.out.println("Score 2: " + score2);
        System.out.println("Score 3: " + score3);

        int totalScore = score1 + score2 + score3;
        double averageScore = totalScore / 3.0;

        System.out.println("\nTotal Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);
    }
}
