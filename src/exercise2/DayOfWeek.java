package exercise2;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int day = input.nextInt();
        System.out.print("Day of week: ");
        if (day == 1)
        {
          System.out.print("Monday");
        }
        else if (day == 2)
        {
          System.out.print("Tuesday");
        }
        else if (day == 3)
        {
          System.out.print("Wednsday");
        }
        else if (day == 4)
        {
          System.out.print("Thursday");
        }
        else if (day == 5)
        {
          System.out.print("Friday");
        }
        else if (day == 6)
        {
          System.out.print("Saturday");
        }
        else if (day == 7)
        {
          System.out.print("Sunday");
        }
        else
        {
          System.out.print("Invalid day");
        }
      
        
    }

}