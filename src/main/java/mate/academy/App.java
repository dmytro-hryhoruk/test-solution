package mate.academy;

import java.io.File;
import java.util.List;

public class App {
    private Solution solution;
    private Converter converter;

    public App() {
        solution = new Solution();
        converter = new Converter();
    }

    public void launchApp(String fileName) {
        File file = new File(fileName);
        List<String> listFromFile = converter.convertFileIntoList(file);
        System.out.println("\nAmount of words in file = " + listFromFile.size());
        List<String> concatenatedWords = solution.findConcatenatedWordsFormList(listFromFile);
        System.out.println("Amount of concatenated words = " + concatenatedWords.size());
        List<String> theLongestWords = solution.findTwoLongestStrings(concatenatedWords);
        System.out.println("The longest concatenated word in file = " + theLongestWords.get(0));
        System.out.println("The second longest word in file = " + theLongestWords.get(1));
    }
}
