import java.util.HashMap;
import java.util.Scanner;

public class TaskManager {
    private static HashMap<String, String> assignments = new HashMap<>();

    public static void manageTasks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("📅 Assignment Manager");

        System.out.println("Enter subject:");
        String subject = scanner.nextLine();
        System.out.println("Enter assignment deadline:");
        String deadline = scanner.nextLine();

        assignments.put(subject, deadline);
        System.out.println("✅ Assignment Added!");

        System.out.println("\n📌 Your Pending Assignments:");
        assignments.forEach((sub, due) -> System.out.println("📖 " + sub + " - Due: " + due));
    }
}
