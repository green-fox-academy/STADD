public class tester {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();

        person.introduce();
        person.getGoal();
        student.skipDays(5);
        student.introduce();

    }
}
