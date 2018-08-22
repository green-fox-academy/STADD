package main.java.animals;

abstract public class Animal {
    private String name;
    private int age;
    private String gender;
    private boolean capableOfBreeding;

    public String getName1() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    abstract public String breed();

    abstract public void eat();

    public void sleep(){
        System.out.println(this.getName1() + " is sleeping.");
    }
}
