import javax.speech.*;
import javax.speech.recognition.*;
import java.io.FileWriter;
import java.util.Locale;

public class SpeechToTextApp extends ResultAdapter {
    static Recognizer recognizer;

    public static void main(String[] args) {
        try {
            recognizer = Central.createRecognizer(new EngineModeDesc(Locale.ENGLISH));
            recognizer.allocate();
            recognizer.addResultListener(new SpeechToTextApp());

            System.out.println("🎤 Speak Now... (Say 'exit' to stop)");

            recognizer.resume();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resultAccepted(ResultEvent e) {
        Result result = (Result) (e.getSource());
        String spokenText = result.getBestFinalResultNoFiller();

        if (spokenText.equalsIgnoreCase("exit")) {
            System.out.println("Stopping Speech Recognition...");
            recognizer.deallocate();
            System.exit(0);
        } else {
            System.out.println("📝 You Said: " + spokenText);
            NoteManager.saveNote(spokenText);
        }
    }
}
