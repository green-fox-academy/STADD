import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Student extends Person {

    String previousOrganization;
    int skippedDays;

    Student() {
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = skippedDays;
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already");
    }

    public void skipDays(int numberOfDays) {
        System.out.println(skippedDays += numberOfDays);
    }
}
