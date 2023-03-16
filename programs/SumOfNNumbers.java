package programs;

import java.util.Scanner;

public class SumOfNNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scan.nextInt();
        int sum = 0;
        scan.close();
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("The Sum of first " + n + " numbers is " + sum);
    }
}
