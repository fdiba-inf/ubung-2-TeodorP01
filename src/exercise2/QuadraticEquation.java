package exercise2;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner inputa = new Scanner(System.in);
        Scanner inputb = new Scanner(System.in);
        Scanner inputc = new Scanner(System.in);

        System.out.print("Enter a, b and c: ");

        int a = inputa.nextInt();
        int b = inputb.nextInt();
        int c = inputc.nextInt();

        if (a != 0)
        {
          int disk = (b*b)-(4*a*c);
          //System.out.println("D= " + disk);
           if (disk>=0)
           {
             double wurzeldisk = Math.sqrt(disk);
             //System.out.println("D2= " + wurzeldisk);
             double x1 = (-b-wurzeldisk)/(2*a);
             System.out.println(x1);
             double x2 = (-b+wurzeldisk)/(2*a);
             System.out.println(x2);
           }
           else 
           {
             System.out.println("Imaginary values");
           }

        }
        else if (b != 0)
        {
          double x = -b/(2*a);
          System.out.println(x);

        }
        else if (c != 0)
        {
          System.out.println("No values");
        }
        else 
          {
            System.out.println("Many values");
          }    
    }

}