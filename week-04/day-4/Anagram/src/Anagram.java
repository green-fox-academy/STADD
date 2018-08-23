import java.util.Arrays;

public class Anagram {
    private String anagram1;
    private String anagram2;

    public Anagram(String anagram1, String anagram2) {
        this.anagram1 = anagram1;
        this.anagram2 = anagram2;
    }

    public boolean areAnagram() {
        //Check if Strings have the same length
        if (anagram1.length() != anagram2.length()) {
            return false;
        }

        //Strings into char list
        char[] charArray1 = anagram1.toCharArray();
        char[] charArray2 = anagram2.toCharArray();

        //Sorting char lists
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        //Check if lists have the same chars.
        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) {
                return false;
            }
        }
        return true;
    }
}
