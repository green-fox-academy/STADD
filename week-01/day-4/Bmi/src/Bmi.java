public class Bmi {
    public static void main(String[] args){

        double massInKg = 81.2;
        double heightInM = 1.78;
        double square = Math.pow(heightInM, 2);

        System.out.println(massInKg / square);
    }
}