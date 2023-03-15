package programs;

import java.util.Scanner;

class BubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("\n");

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " Element: ");
            arr[i] = scan.nextInt();
        }

        scan.close();

        System.out.print("\nUnsorted Array: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(" " + arr[j]);
        }

        bubbleSort(arr, n);

        System.out.print("\nSsorted Array: ");
        for (int j = 0; j < n; j++) {
            System.out.print(" " + arr[j]);
        }
    }

    static void bubbleSort(int[] arr, int size) {
        int temp = 0;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

}