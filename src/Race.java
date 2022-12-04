
import java.util.Scanner;
/*
 * class Race
 * gets input for three racers and sorts them in order
 *
 * additionally gets the input for the users decision to start another race
 *
 * @author: Alexander Leatha
 * @version 11/29/2022
 */
public class Race {
    double racer1;
    double racer2;
    double racer3;

    //gets input for each racer and sorts them in order
    void getInput() {
        RaceReport raceReport = new RaceReport();
        System.out.println("Enter racer's times (in seconds): ");

        Scanner s = new Scanner(System.in);
        racer1 = s.nextDouble();
        racer2 = s.nextDouble();
        racer3 = s.nextDouble();
        double third = Math.max(racer1, Math.max(racer2, racer3));
        double first = Math.min(racer1, Math.min(racer2, racer3));
        double second = (racer1 + racer2 + racer3) - (first + third);
        timeTesting(first, second, third);
        raceReport.setTimes(first, second, third);
        raceReport.writeReport();
    }

    //gets input for the user's decision
    //and continues the program accordingly
     void getAnotherRace() {
         System.out.println("Enter another race? (y/n)");

         Scanner s = new Scanner(System.in);
         String anotherRace = s.nextLine();
         if (anotherRace.equalsIgnoreCase("y")){
             getInput();
        } else if (anotherRace.equalsIgnoreCase("n")){

        } else {
             System.out.println("Invalid input");
             getAnotherRace();
         }
    }

    private void timeTesting(double one, double two, double three){
        System.out.println("If they appear so below, the times are ordered correctly: ");
        System.out.println("First " + one);
        System.out.println("Second " + two);
        System.out.println("Third " + three);
    }
}
