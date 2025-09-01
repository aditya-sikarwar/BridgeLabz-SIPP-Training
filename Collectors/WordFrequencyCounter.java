import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String paragraph = "the quick brown fox jumps over the lazy dog the quick fox";

        Map<String, Long> wordCounts = Arrays.stream(paragraph.toLowerCase().split(" "))
            .collect(Collectors.toMap(
                Function.identity(), 
                word -> 1L,         
                Long::sum             
            ));

        System.out.println(wordCounts);
           }
}