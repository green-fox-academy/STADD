public class CodingHours {
    public static void main(String[] args){

        int hoursDay = 6;
        int weeks = 17;
        double semester = weeks * hoursDay * 5;
        double hoursWeekly = 52 *17;

        System.out.println(semester);
        System.out.println(semester / hoursWeekly + "%");
    }
}
