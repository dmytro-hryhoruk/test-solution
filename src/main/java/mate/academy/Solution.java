package mate.academy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

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

    public List<String> findTwoLongestStrings(List<String> stringList) {
        int indexMaxLength = 0;
        int indexSecondLength = 0;
        List<String> result = new ArrayList<>();

        for (int i = 1; i < stringList.size(); i++) {
            if (stringList.get(i).length() > stringList.get(indexMaxLength).length()) {
                indexSecondLength = indexMaxLength;
                indexMaxLength = i;
            }
            if (stringList.get(i).length() > stringList.get(indexSecondLength).length()
                    && stringList.get(i).length() != stringList.get(indexMaxLength).length()) {
                indexSecondLength = i;
            }
        }
        result.add(stringList.get(indexMaxLength));
        result.add(stringList.get(indexSecondLength));
        return result;
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
