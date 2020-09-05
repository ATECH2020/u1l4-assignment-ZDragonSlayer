import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hourDegrees = scanner.nextInt();

        //my code
        int minuteDegrees = hourDegrees - ((hourDegrees/30)*30);
        if(minuteDegrees != 0)
        {
          minuteDegrees *= 12;
        }

        System.out.print(minuteDegrees);
        // closing the scanner object
        scanner.close();
    }
}