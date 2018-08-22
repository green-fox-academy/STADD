package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        this.setName("Electric Guitar");
        this.setNumberOfString(6);
    }

    public ElectricGuitar(int numberOfStrings) {
        this.setName("Electric Guitar");
        this.setNumberOfString(numberOfStrings);
    }

    @Override
    public String sound() {
        String sound = "Twang";
        return sound;
    }
}
