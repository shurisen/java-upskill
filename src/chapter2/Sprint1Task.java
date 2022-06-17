package chapter2;

import java.text.MessageFormat;
import java.util.Scanner;


public class Sprint1Task {

    public enum seasons {
        winter, summer, spring, autumn
    }
    public static void main (String arg[]){

        System.out.println("Whats the current season of the year");
        Scanner scanner = new Scanner(System.in);
        seasons season = seasons.valueOf(scanner.nextLine());

        System.out.println(MessageFormat.format("How many cups of coffee are you drinking on average {0} day", season));
        int cups = scanner.nextInt();
        scanner.nextLine();

        System.out.println("How would you describe in one word current season of the year");
        String adjective = scanner.nextLine();

        System.out.println(MessageFormat.format("On a {0} {1} day i drink {2} cups of coffee.",  adjective, season, cups));
    }
}
