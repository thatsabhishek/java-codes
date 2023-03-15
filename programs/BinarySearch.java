package programs;

import java.util.Scanner;

class BinarySearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = { 5, 6, 7, 8, 14, 16, 22, 27 };
        System.out.print("Enter the number to search in the array: ");
        int num = scan.nextInt();
        scan.close();
        int result = binarySearch(nums, num);
        System.out.println("The index of the item " + num + " is " + result);

    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}