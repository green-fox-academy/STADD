public class Student extends Person implements Cloneable {
    private String previousOrganization;
    private int skippedDays;

    Student() {
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }

    @Override
    public Object clone() {
       try{
           return super.clone();
       } catch (Exception e){
       }
       return null;
    }
}
