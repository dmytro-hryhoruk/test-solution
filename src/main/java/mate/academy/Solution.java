package mate.academy;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

public class Solution {
    private static final Logger LOGGER = Logger.getLogger(Solution.class);

    public List<String> convertFileIntoList(File file) {
        try {
            return Files.lines(Paths.get(file.getAbsolutePath()))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            LOGGER.error("No such file", e);
            return Collections.emptyList();
        }
    }

    public List<String> findConcatenatedWordsFormList(List<String> list) {
        Set<String> set = new HashSet<>(list);
        List<String> result = new ArrayList<>();
        for (String w : list) {
            set.remove(w);
            if (isConcatenated(w, set)) {
                result.add(w);
            }
            set.add(w);
        }
        return result;
    }

    public String findTheLongestString(List<String> stringList) {
        int indexMaxLength = 0;
        for (int i = 1; i < stringList.size(); i++) {
            if (stringList.get(i).length() > stringList.get(indexMaxLength).length()) {
                indexMaxLength = i;
            }
        }
        return stringList.get(indexMaxLength);
    }

    private boolean isConcatenated(String word, Set<String> set) {
        if (set.contains(word)) {
            return true;
        }
        for (int i = 1; i < word.length(); i++) {
            if (set.contains(word.substring(0, i)) && isConcatenated(word.substring(i), set)) {
                return true;
            }
        }
        return false;
    }
}
