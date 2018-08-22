package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        this.setName("Bass Guitar");
        this.setNumberOfString(4);
    }

    public BassGuitar(int numberOfStrings) {
        this.setName("Bass Guitar");
        this.setNumberOfString(numberOfStrings);
    }

    @Override
    public String sound() {
        String sound = "Duum-duum-duum";
        return sound;
    }
}