import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderProb2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("output.txt")) {
            String input;
            System.out.println("Enter text (type 'exit' to quit):");
            while (!(input = br.readLine()).equalsIgnoreCase("exit")) {
                writer.write(input + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
