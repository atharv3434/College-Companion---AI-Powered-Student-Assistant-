import java.util.Scanner;

public class QuizGame {
    public static void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🎮 Welcome to the Quiz!");

        String[][] questions = {
                {"What is 5 + 7?", "12"},
                {"Java is a ____ language.", "Object-Oriented"},
                {"What does JVM stand for?", "Java Virtual Machine"}
        };

        int score = 0;
        for (String[] q : questions) {
            System.out.println("❓ " + q[0]);
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(q[1])) {
                score++;
                System.out.println("✅ Correct!");
            } else {
                System.out.println("❌ Incorrect! The answer is " + q[1]);
            }
        }
        System.out.println("🏆 Your final score: " + score + "/" + questions.length);
    }
}
