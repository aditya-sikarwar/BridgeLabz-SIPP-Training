public class LinearSearchProb2{
    public static String findSentenceWithWord(String[] sentences, String targetWord) {
        for (String sentence : sentences) {
            if (sentence.contains(targetWord)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {"Hello world", "Java programming", "Search for this word"};
        String targetWord = "word";
        System.out.println(findSentenceWithWord(sentences, targetWord)); // Output: Search for this word
    }
}
