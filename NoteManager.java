import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NoteManager {
    public static void takeNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("📝 Enter your note:");
        String note = scanner.nextLine();

        try (FileWriter writer = new FileWriter("notes.txt", true)) {
            writer.write(note + "\n");
            System.out.println("✅ Note saved successfully!");
        } catch (IOException e) {
            System.out.println("❌ Error saving note!");
        }
    }
}
