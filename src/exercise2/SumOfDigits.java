package exercise2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Digit for 0 to 999: ");
        int d = input.nextInt();
        int o1 = d%10;
        d = d/10;
        int o2 = d%10;
        d = d/10;
        int sum = d+o1+o2;
        System.out.println("Sum of digits: "+sum); 

    }

}