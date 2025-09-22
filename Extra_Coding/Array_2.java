
/***** Q: Remove duplicate from unsorted array TC:-O(n2)  SC:-O(1)  ****/

import java.util.Scanner;

public class Array_2 {

    public static void arrInput(int arr[],Scanner sc){
        System.out.println("Input the array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(i+" ");
        }
    }
    public static void arrPrint(int arr[]){
        System.out.println("Display the array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(i+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        arrInput(arr, sc);
        arrPrint(arr);
        
    }
}