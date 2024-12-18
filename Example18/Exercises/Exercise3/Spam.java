package Example18.Exercises.Exercise3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Spam {
    public static void main(String[] args) {
        try (PrintWriter  pw = new PrintWriter(new FileWriter(new File("Example18\\Exercises\\Exercise3\\mbox.txt")))) {
            pw.close();
            // X-DSPAM-Confidence
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}