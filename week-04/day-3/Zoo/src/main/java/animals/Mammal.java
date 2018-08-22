package main.java.animals;

public class Mammal extends Animal {
    private String typeOfMammal;

    public Mammal(String typeOfMammal) {
        super();
        this.typeOfMammal = typeOfMammal;

    }

    @Override
    public String breed() {
        String breed = "pushing miniature versions out.";
        return breed;
    }

    public void eat() {
        System.out.println(typeOfMammal + " is eating.");
    }

    public void sleep() {
        System.out.println(typeOfMammal + " is sleeping.");
    }

    public String getName() {
        return typeOfMammal;
    }
}
