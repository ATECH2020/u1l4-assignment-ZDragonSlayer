import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int room1 = scanner.nextInt();
        int room2 = scanner.nextInt();
        int room3 = scanner.nextInt();

        //my code
          int tables1 = room1/2;
          if(room1 % 2 == 1)
          {
            tables1++;
          }

          int tables2 = room2/2;
          if(room2 % 2 == 1)
          {
            tables2++;
          }

          int tables3 = room3/2;
          if(room3 % 2 == 1)
          {
            tables3++;
          }

          System.out.print(tables1 + tables2 + tables3);
        // closing the scanner object
        scanner.close();
    }
}