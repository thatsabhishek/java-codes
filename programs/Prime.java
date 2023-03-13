package programs;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        scan.close();
        int t = 0;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                t += 1;
            } else {
                continue;
            }
        }

        if (t > 1) {
            System.out.println(number + " is not prime number.");
        } else {
            System.out.println(number + " is a prime number.");
        }

    }
}
