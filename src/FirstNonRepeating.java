import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {

    /**
     * Takes in a string and returns first character that is never repeated in the string
     * If none found then returns null
     *
     * @param str - input string
     * @return Character, null
     */
    public Character findFirstNonRepeating(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (Character c : str.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        for (Character c : charCount.keySet()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        return null;
    }
}