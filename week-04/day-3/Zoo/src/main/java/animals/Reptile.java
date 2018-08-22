package main.java.animals;

public class Reptile extends Animal {
    private String typeOfReptile;

    public Reptile(String typeOfReptile) {
        super();
        this.typeOfReptile = typeOfReptile;

    }

    @Override
    public String breed() {
        String breed = "laying eggs.";
        return breed;
    }

    public void eat() {
        System.out.println(typeOfReptile + " is eating.");
    }

    public void sleep() {
        System.out.println(typeOfReptile + " is sleeping.");
    }

    public String getName() {
        return typeOfReptile;
    }
}
