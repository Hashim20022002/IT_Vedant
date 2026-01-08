

import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        // Declare and initialize an array
        // int[] numbers = { 10, 20, 30, 40, 50 };
        // int num1[] = new int[5];
        // num1[0] = 5;
        // num1[1] = 15;
        // num1[2] = 25;
        // num1[3] = 35;
        // num1[4] = 45;
        // // num1[5]=55; This will cause an ArrayIndexOutOfBoundsException

        // // Access and print elements of the array
        // for (int i = 0; i < numbers.length; i++) {
        // System.out.println("Element at index " + i + ": " + numbers[i]);
        // }

        // // Largest element in an array
        // int a = num1[0];
        // for (int i = 0; i < num1.length; i++) {
        // if (num1[i] > a) {
        // a = num1[i];
        // }

        // }
        // System.out.println("Largest element is: " + a);

        // // Smallest element in an array
        // int b = num1[0];
        // for (int i = 0; i < num1.length; i++) {
        // if (num1[i] < b) {
        // a = num1[i];
        // }

        // }
        // System.out.println("Smallest element is: " + b);

        // // Sum of elements in an array
        // int sum = 0;
        // for (int i = 0; i < num1.length; i++) {
        // sum = sum + num1[i];
        // }
        // System.out.println("Sum of elements is: " + sum);

        // // Average of elements in an array
        // double average = sum / num1.length;
        // System.out.println("Average of elements is: " + average);

        // Reversed array
        // int arr[] = { 2, 4, 6, 8, 10, 12, 4, 8 };
        // int arr1[] = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        // arr1[(arr.length - 1) - i] = arr[i];
        // }
        // System.out.println("Reversed array is: ");
        // for (int i = 0; i < arr1.length; i++) {
        // System.out.print(arr1[i] + " ");
        // }
        // System.out.println();

        // User input array
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter size of array:");
        // int size = sc.nextInt();
        // int arr2[] = new int[size];
        // System.out.println("Enter elements of array:");
        // for (int i = 0; i < size; i++) {
        // arr2[i] = sc.nextInt();
        // }
        // System.out.println("Entered elements are:");
        // for (int i = 0; i < size; i++) {
        // System.out.print(arr2[i] + " ");
        // }

        // more array programs
        // Find duplicate elements in an array
        // int arr[] = {2,4,6,8,10,12,4,8};
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[j] == arr[i]) {
        // System.out.println("Duplicate element found: " + arr[i]);
        // }

        // }
        // }

        // Count occurrences of each element in an array
        // int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[j] == arr[i]) {
        // count++;
        // }

        // }
        // System.out.println("Element " + arr[i] + " occurs " + (count + 1) + "
        // times.");
        // count = 0;

        // }

        // take an array as input from user and search for an element x and print index
        // of x
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter size of array:");
        // int size = sc.nextInt();
        // int arr[] = new int[size];
        // System.out.println("Enter elements of array:");
        // for (int i = 0; i < size; i++) {
        // arr[i] = sc.nextInt();
        // }
        // System.out.println("Enter element to search:");
        // int x = sc.nextInt();
        // int index = -1;
        // for (int i = 0; i < size; i++) {
        // if (arr[i] == x) {
        // System.out.println("Element found at index: " + i);
        // index = i;

        // }
        // }
        // if (index == -1) {
        // System.out.println("Element not found in the array.");
        // }

        // more array programs
        // take an array of number as input and check if it is sorted in ascending order
        // int arr[] = {1,2,3,4,5,6};
        // boolean isSorted = true;
        // for (int i = 0; i < arr.length - 1; i++) {
        // if (arr[i] > arr[i + 1]) {
        // isSorted = false;
        // break;
        // }
        // }
        // if (isSorted) {
        // System.out.println("Array is sorted in ascending order.");
        // } else {
        // System.out.println("Array is not sorted in ascending order.");
        // }

        // take an array of number as input and check if it is sorted in descending
        // order
        // int arr[] = {6,5,4,3,2,1};
        // boolean isSorted = true;
        // for (int i = 0; i < arr.length - 1; i++) {
        // if (arr[i] < arr[i + 1]) {
        // isSorted = false;
        // break;
        // }
        // }
        // if (isSorted) {
        // System.out.println("Array is sorted in descending order.");
        // } else {
        // System.out.println("Array is not sorted in descending order.");
        // }

        // Reverse an array without using another array
        // elements ko swap karna padega
        int arr[] = { 2, 4, 6, 8, 10 };
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = temp;
        }
        System.out.println("Reversed array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
