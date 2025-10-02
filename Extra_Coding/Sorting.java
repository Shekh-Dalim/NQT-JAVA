/************************ Bubble Sort******************************/
```
import java.util.Scanner;

public class ruhul {

    public static void inputArry(int arr[], Scanner sc) {
        System.out.println("Enter the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void displayArry(int arr[]) {
        System.out.println("Display the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] A, int n) {
        boolean swapped;
        for (int i = 0; i < n - 1; i++) { // Pass
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) { // Swap
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) { // no swapping -> already sorted
                break;
            }
        }
    }

   

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        inputArry(arr, sc);
        bubbleSort(arr, size);
        displayArry(arr);

    }
}
```
