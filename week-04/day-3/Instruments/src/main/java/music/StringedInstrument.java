package main.java.music;

abstract class StringedInstrument extends Instrument {
    private int numberOfString;

    public StringedInstrument(String name, int numberOfString) {
        super(name);
        setNumberOfString(numberOfString);
    }

    public StringedInstrument() {
        super();
        setNumberOfString(0);

    }

    public int getNumberOfString() {
        return numberOfString;
    }

    public void setNumberOfString(int numberOfString) {
        this.numberOfString = numberOfString;
    }

    abstract public String sound();

    public void play() {
        System.out.println(getName() + ", a " + getNumberOfString() + "-stringed instrument that goes " + sound());
    }

}
