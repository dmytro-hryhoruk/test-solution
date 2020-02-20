import java.io.File;
import java.util.List;
import mate.academy.Converter;
import mate.academy.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
    public static final int CONCATENATED_SIZE = 3;
    public static final int ORIGINAL_SIZE = 8;
    private final String CONTENT_ROOT_PATH = "src/test/resources/test.txt";
    private static Solution solution;
    private static Converter converter;
    private static File file;

    @Before
    public void setVariables() {
        solution = new Solution();
        file = new File(CONTENT_ROOT_PATH);
        converter = new Converter();
    }

    @Test
    public void convertFileToListWrongPathTest() {
        File file = new File("path");
        List<String> fileList = converter.convertFileIntoList(file);
        Assert.assertEquals(true, fileList.isEmpty());
    }

    @Test
    public void convertFileToListTest() {
        List<String> listFromFile = converter.convertFileIntoList(file);
        Assert.assertNotEquals(0, listFromFile.size());
    }

    @Test
    public void convertFileToListSizeTest() {
        List<String> listFromFile = converter.convertFileIntoList(file);
        Assert.assertEquals(ORIGINAL_SIZE, listFromFile.size());
    }

    @Test
    public void longestStringsTest() {
        List<String> fileList = converter.convertFileIntoList(file);
        List<String> concatenated = solution.findConcatenatedWordsFormList(fileList);
        List<String> longests = solution.findTwoLongestStrings(concatenated);
        Assert.assertEquals(true, longests.get(1).length() < longests.get(0).length());
    }

    @Test
    public void findConcatenatedWordsTest() {
        List<String> fileList = converter.convertFileIntoList(file);
        List<String> concatenated = solution.findConcatenatedWordsFormList(fileList);
        Assert.assertEquals(CONCATENATED_SIZE,concatenated.size());
    }
}
