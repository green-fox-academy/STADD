public class Gnirts implements CharSequence {
    private String text;

    public Gnirts(String text) {
        this.text = text;
    }

    @Override
    public int length() {
        return text.length();
    }

    @Override
    public char charAt(int index) {
        return text.charAt(text.length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String subText = "";
        for (int i = 0; i < end - start; i++) {
        }
        return text.substring(text.length() - end, text.length() - start);
    }
}
