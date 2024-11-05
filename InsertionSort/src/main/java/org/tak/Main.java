package org.tak;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr;
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        n = scanner.nextInt();

        arr = new int[n];

        System.out.println(("Enter the value of the element: "));
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("The array before sorting: " + Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("The array after sorting: " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr){
        int key, j;
        for (int i = 1; i < arr.length; i++){
            key = arr[i];
            j = i - 1;
            while (j >= 0 && key < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}