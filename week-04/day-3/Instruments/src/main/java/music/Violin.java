package main.java.music;

public class Violin extends StringedInstrument {

    public Violin() {
        this.setName("Violin");
        this.setNumberOfString(4);
    }

    @Override
    public String sound() {
        String sound = "Screech";
        return sound;
    }
}