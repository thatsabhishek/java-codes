import java.util.Scanner;

public class MultiplicationOfNNumbers {
    public static void main(String[] args) {
        int n, result = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = input.nextInt();
        
        for(int i=1; i<=n; i++) {
            result *= i;
        }
        
        System.out.println("The multiplication of first " + n + " numbers is: " + result);
    }
}
