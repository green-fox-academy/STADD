package main.java.animals;

public class Bird extends Animal {
    private String typeOfBird;

    public Bird(String typeOfBird) {
        super();
        this.typeOfBird = typeOfBird;

    }

    @Override
    public String breed() {
        String breed = "laying eggs";
        return breed;
    }

    public void eat() {
        System.out.println(typeOfBird + " is eating.");
    }

    public void sleep() {
        System.out.println(typeOfBird + " is sleeping.");
    }

    public String getName() {
        return typeOfBird;
    }
}
