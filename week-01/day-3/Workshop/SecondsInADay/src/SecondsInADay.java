public class SecondsInADay {
    public static void main(String[] args){
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int oneHour = 3600;
        int oneMinute = 60;
        int oneDay = 86400;

        System.out.println(oneDay - (currentHours * oneHour + currentMinutes * oneMinute + currentSeconds));
    }
}
