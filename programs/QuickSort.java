package programs;

import java.util.Scanner;

class QuickSort {
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

        quickSort(arr, 0, n - 1);

        System.out.print("\nSsorted Array: ");
        for (int j = 0; j < n; j++) {
            System.out.print(" " + arr[j]);
        }

    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}