import java.util.Random;

public class AIStudyBuddy {
    public static void suggestTopics() {
        String[] topics = {
                "🖥️ Revise Data Structures",
                "📊 Practice SQL Queries",
                "📝 Read about Design Patterns",
                "⚡ Learn about Multithreading",
                "🔢 Solve Math-based Programming Problems"
        };

        Random random = new Random();
        System.out.println("💡 Suggested Topic: " + topics[random.nextInt(topics.length)]);
    }
}
