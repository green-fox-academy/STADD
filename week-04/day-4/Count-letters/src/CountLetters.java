import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    private String string;
    private Map<Character, Integer> map;

    public Map<Character, Integer> getMap() {
        return map;
    }

    public CountLetters(String string) {
        this.string = string;
        this.map = new HashMap<>();
    }

    public void countOccurence() {
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            try {
                map.put(charArray[i], map.get(charArray[i]) + 1);
            } catch (NullPointerException e) {
                map.put(charArray[i], 1);
            }
        }
    }
}
