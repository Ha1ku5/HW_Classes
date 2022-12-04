/*
* class RaceReport
* houses method writeReport that takes three doubles as parameters
* prints them to console in order, and then prints the range and average
* in addition to the tie status of racers
*
* @author: Alexander Leatha
* @version 11/29/2022
 */
public class RaceReport {
    double first;
    double second;
    double third;

    //assigns top three places' times
    public void setTimes(double f, double s, double t){ first = f;second = s;third = t;}

    public void writeReport() {
        //writes to console the sorted times, range, and average
        //writes to console the tie status of racers
        Race race = new Race();

        System.out.println("First place (time in seconds): " + first);
        System.out.println("Second place (time in seconds): " + second);
        System.out.println("Third place (time in seconds): " + third);
        System.out.println();
        if(first == second && first == third) {
            System.out.println("All racers tied!");
        } else if(first == second){
            System.out.println("Two racers shared first place!");
        } else if(second == third){
            System.out.println("Two racers shared second place!");
        }
        System.out.println("The range of times is: " + (third - first));
        System.out.println("The average time is: " + ((first + second + third) / 3));

        race.getAnotherRace();
    }


}

