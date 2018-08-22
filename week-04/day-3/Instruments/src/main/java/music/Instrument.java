package main.java.music;

abstract class Instrument {
    private String name;

    public Instrument(String name) {
        this.name = name;
    }

    public Instrument() {
        this.name = "default name";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public void play();
}

