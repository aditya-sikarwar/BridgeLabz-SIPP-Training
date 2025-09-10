import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileProb2{
    public static void main(String[] args) {
        String filePath = "example.txt"; 
        String targetWord = "example"; 
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }
            System.out.println("The word '" + targetWord + "' occurs " + count + " times.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
