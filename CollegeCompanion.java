import java.util.Scanner;

public class CollegeCompanion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🎓 Welcome to College Companion!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1️⃣ Manage Assignments 📅");
            System.out.println("2️⃣ Take Notes 📝");
            System.out.println("3️⃣ Start a Quiz 🎮");
            System.out.println("4️⃣ Get Study Suggestions 📖");
            System.out.println("5️⃣ Exit ❌");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> TaskManager.manageTasks();
                case 2 -> NoteManager.takeNote();
                case 3 -> QuizGame.startQuiz();
                case 4 -> AIStudyBuddy.suggestTopics();
                case 5 -> {
                    System.out.println("Goodbye! 🎓");
                    System.exit(0);
                }
                default -> System.out.println("❌ Invalid Choice! Try Again.");
            }
        }
    }
}
