import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        n = scanner.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The array before sorting: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("The array after sorting: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
