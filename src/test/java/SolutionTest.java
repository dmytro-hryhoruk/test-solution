import java.io.File;
import java.util.List;
import mate.academy.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
    public static final int CONCATENATED_SIZE = 3;
    public static final int ORIGINAL_SIZE = 8;
    private final String CONTENT_ROOT_PATH = "src/main/resources/test.txt";
    private static Solution solution;
    private static File file;

    @Before
    public void setVariables() {
        solution = new Solution();
        file = new File(CONTENT_ROOT_PATH);
    }

    @Test
    public void convertFileToListWrongPathTest() {
        File file = new File("path");
        List<String> fileList = solution.convertFileIntoList(file);
        Assert.assertEquals(true, fileList.isEmpty());
    }

    @Test
    public void convertFileToListTest() {
        List<String> listFromFile = solution.convertFileIntoList(file);
        Assert.assertNotEquals(0, listFromFile.size());
    }

    @Test
    public void convertFileToListSizeTest() {
        List<String> listFromFile = solution.convertFileIntoList(file);
        Assert.assertEquals(ORIGINAL_SIZE, listFromFile.size());
    }

    @Test
    public void longestStringTest() {
        List<String> fileList = solution.convertFileIntoList(file);
        List<String> concatenated = solution.findConcatenatedWordsFormList(fileList);
        String longest = solution.findTheLongestString(concatenated);
        concatenated.remove(longest);
        String secondLongest = solution.findTheLongestString(concatenated);
        Assert.assertEquals(true, secondLongest.length() < longest.length());
    }

    @Test
    public void findConcatenatedWordsTest() {
        List<String> fileList = solution.convertFileIntoList(file);
        List<String> concatenated = solution.findConcatenatedWordsFormList(fileList);
        Assert.assertEquals(CONCATENATED_SIZE,concatenated.size());
    }
}
