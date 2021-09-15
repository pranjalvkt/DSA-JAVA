package LeetCode;

import java.util.*;

public class Problem1832CheckIfTheSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        Set<Character> letters = new HashSet<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
                'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        for (char ch : sentence.toCharArray()) {
            letters.remove(ch);
        }

        return letters.isEmpty();
    }
}
