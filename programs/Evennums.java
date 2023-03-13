package programs;

import java.util.Scanner;

class Evennums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.close();
        if (num % 2 == 0) {
            System.out.println("Number " + num + " is Even.");
        } else {
            System.out.println("Number " + num + " is Odd.");
        }
    }
}