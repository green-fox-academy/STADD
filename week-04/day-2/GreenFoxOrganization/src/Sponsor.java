public class Sponsor extends Person {
    private String company;
    private int hiredStudents;

    Sponsor() {
        this.company = "Google";
        this.hiredStudents = 0;
    }

    Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + " a " + getAge() + " year old " + getGender() + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire() {
        hiredStudents++;
    }

    @Override
    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

}
