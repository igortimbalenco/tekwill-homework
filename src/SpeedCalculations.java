import java.util.Scanner;

public class SpeedCalculations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours, minutes, seconds;
        double speedInKm, speedInMiles, speedInMeters, distance;


        System.out.println("Enter hours: ");
        hours = scanner.nextInt();
        System.out.println("Enter minutes: ");
        minutes = scanner.nextInt();
        System.out.println("Enter seconds: ");
        seconds = scanner.nextInt();
        System.out.println("Enter distance in meters: ");
        distance = scanner.nextInt();

        speedInMeters = distance/(hours * 60 * 60 + minutes * 60 + seconds);

        System.out.println("Your speed in meters/seconds: " + speedInMeters);

        speedInKm = speedInMeters * 3.6;

        System.out.println("Speed in km/h " + speedInKm);

        speedInMiles = speedInKm/1.609;

        System.out.println("speed in miles/hour " + speedInMiles);
    }


}
