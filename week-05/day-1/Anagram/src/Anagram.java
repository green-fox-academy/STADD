import java.util.Arrays;

public class Anagram {
    public boolean anagramOne(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }

        char[] charArray1 = string1.toCharArray();
        char[] charArray2 = string2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) {
                return false;
            }
        }
        return true;
    }
}
