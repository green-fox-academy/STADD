public class Person {
    private String name;
    private int age;
    private String gender;

    public void setName(String name) {
        if (name.length() <= 3) {
            throw new IllegalArgumentException("name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 150) {
            throw new IllegalArgumentException("age");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        if (gender != "male" && gender != "female") {
            throw new IllegalArgumentException("gender");
        }
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    public Person(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + ".");
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }
}
