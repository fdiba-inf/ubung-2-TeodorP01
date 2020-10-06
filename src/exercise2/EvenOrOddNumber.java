package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Number is ");
        if (number == 0)
        {
          System.out.print("even");
        }
        else
        {
          System.out.print("odd");
        }
    }

}