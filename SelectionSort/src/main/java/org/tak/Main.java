package org.tak;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr;
        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number elements of the array: ");
        n = scanner.nextInt();
        arr = new int[n];

        System.out.println("Enter the number of the elements: ");
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array before softing: " + Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("Array after sorting: "+ Arrays.toString(arr));

    }

    public static void selectionSort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[index] > arr[j]){
                    index = j;
                }
            }
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}