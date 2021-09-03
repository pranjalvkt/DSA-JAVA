package LeetCode;
import java.util.*;

public class Problem1773CountItemsMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleIndex = 0;
        int count = 0;
        
        if(ruleKey.equals("color")) {
            ruleIndex = 1;
        }
        if(ruleKey.equals("name")) {
            ruleIndex = 2;
        }
        
        for(int i = 0; i < items.size(); i++) {
            List<String> item = items.get(i);
            if(item.get(ruleIndex).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
