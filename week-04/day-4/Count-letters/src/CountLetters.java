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

    public void addToMap() {
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            map.put(charArray[i], i);
        }
    }

    public void countOccurence() {
        char[] charArray = string.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            char occur = charArray[i];
            if (map.containsKey(occur)) ;
            counter++;
            map.put(charArray[i], counter);
        }
    }
}
