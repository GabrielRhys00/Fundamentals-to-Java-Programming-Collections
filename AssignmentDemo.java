public class AssignmentDemo {

    public static void main(String[] args) {
        int score = 50;
        System.out.println("Intial score: " + score);
        score += 10;
        System.out.println("After += 10, score: " + score);
        score -= 5;
        System.out.println("After -= 5, score: " + score);
        score *= 2;
        System.out.println("After *= 2, score: " + score);
        score /= 5;
        System.out.println("After /= 5, score: " + score);
       
        // Challenge: starting with points = 100;
        int points = 100;
        System.out.println("\nInitial points: " + points);
        points += 25;
        System.out.println("After += 25, points: " + points);
        points -= 15;
        System.out.println("After -= 15, points: " + points);
        points *= 2;
        System.out.println("After *= 2, points: " + points);
        points /= 5;
        System.out.println("After /= 5, points: " + points);
    }

}