package mate.academy;

import java.io.File;
import java.util.List;

public class Main {
    private static final String CONTENT_ROOT_PATH = "src/main/resources/words.txt";

    public static void main(String[] args) {
        Solution solution = new Solution();
        File wordsFile = new File(CONTENT_ROOT_PATH);
        List<String> listFromFile = solution.convertFileIntoList(wordsFile);
        if (listFromFile.isEmpty()) {
            throw new RuntimeException("No such file");
        }
        List<String> concatenatedWords = solution.findConcatenatedWordsFormList(listFromFile);
        System.out.println("\nAmount of words in words.txt file = " + listFromFile.size());
        System.out.println("Amount of concatenated words = " + concatenatedWords.size());
        String theLongestWord = solution.findTheLongestString(concatenatedWords);
        System.out.println("The longest concatenated word in file = " + theLongestWord);
        concatenatedWords.remove(theLongestWord);
        String secondTheLongestWord = solution.findTheLongestString(concatenatedWords);
        System.out.println("The second longest word in file = " + secondTheLongestWord);
    }
}
