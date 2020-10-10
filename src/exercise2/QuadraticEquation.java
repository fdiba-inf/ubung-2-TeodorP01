package exercise2;

import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b and c: ");
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();

        if (a != 0)
        {
          double disk = (b*b)-(4*a*c);
          //System.out.println("D= " + disk);
           if (disk>=0)
           {
             double wurzeldisk = Math.sqrt(disk);
             //System.out.println("D2= " + wurzeldisk);
             double x1 = (-b-wurzeldisk)/(2*a);
             double x2 = (-b+wurzeldisk)/(2*a);
             System.out.println(x1 + ", " + x2 );
           }
           else 
           {
             System.out.println("Imaginary values");
           }
        }

        else if (b != 0)
        {
          double asd = -c/b;
          System.out.println("asd= "+asd);

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


