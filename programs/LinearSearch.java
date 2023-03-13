package programs;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            int ele = scan.nextInt();
            arr[i] = ele;
        }

        System.out.print("\n Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }

        System.out.print("\nEnter the number to search: ");
        int num = scan.nextInt();
        scan.close();
        int index = linearSearch(arr, n, num);
        System.out.println("Index of the number " + num + " is " + index);
    }

    static int linearSearch(int[] arr, int size, int num) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                index = i;
            }
        }
        return index;
    }
}
