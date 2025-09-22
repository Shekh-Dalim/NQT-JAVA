
/************ Q: sum of all array of an array  TC-> O(n)  SC->O(n)*************/

// package Extra_Coding;  // 👈 matches the folder name

// public class dalim {

//     public static int arrSum(int arr[], int size) {
//         if (size <= 0) {
//             return 0;
//         }
//         return arrSum(arr, size - 1) + arr[size - 1];
//     }

//     public static void main(String args[]) {
//         int arr[] = { 1, 2, 3, 4 };

//         int ans = arrSum(arr, 4);
//         System.out.println(ans);
//     }
// }

/************ Q: Add Element to an array  TC-> O(n)  SC->O(n)*************/

// package Extra_Coding;

// import java.util.Scanner;
// public class dalim {

//     public static void inputArray(int arr[], int n,Scanner sc){
//         System.out.print("Enter " + n + " elements: ");

//         for(int i = 0; i< n;  i++){
//             arr[i] = sc.nextInt();
//         }
//     }
//     public static void displayArray(int arr[], int n){
//         System.out.print("Display " + n + " elements: ");

//         for(int i = 0; i< n;  i++){
//             System.out.print(arr[i]+ " ");
//         }
//     }

//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int Size = sc.nextInt();

//         int arr[] = new int[Size];
//         inputArray(arr, Size,sc);
//         displayArray(arr, Size);

//     }
// }

/*************** Q:Meadian of an unsorted array TC- O(nlogn)  SC-O(1)*************/

// package Extra_Coding;

// import java.util.*;
// public class dalim {

//     public static void inputArray(int arr[], int n,Scanner sc){
//         System.out.print("Enter " + n + " elements: ");

//         for(int i = 0; i< n;  i++){
//             arr[i] = sc.nextInt();
//         }
//     }
//     public static void displayArray(int arr[], int n){
//         System.out.print("Display " + n + " elements: ");

//         for(int i = 0; i< n;  i++){
//             System.out.print(arr[i]+ " ");
//         }
//     }

//     public static double meadian(int arr[],int n){
//         Arrays.sort(arr);

//           if (n % 2 != 0) {
//             // odd length → middle element
//             return arr[n / 2];
//         } else {
//             // even length → average of two middle elements
//             return (arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
//         }

//     }

//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int Size = sc.nextInt();

//         int arr[] = new int[Size];
//         inputArray(arr, Size,sc);
//         displayArray(arr, Size);

//         double ans = meadian(arr, Size);
//         System.out.println("The median of an array is: "+ans);

//     }
// }

/****************** Q:Largest element in an array  TC- O(n) SC- O(1) ***************/
// package Extra_Coding;

// public class Array_1 {
//     public static int largest(int arr[], int size) {
//         int maxElement = Integer.MIN_VALUE; 

//         for (int i = 0; i < size; i++) {
//             if (maxElement < arr[i]) {
//                 maxElement = arr[i];
//             }
//         }
//         return maxElement;
//     }

//     public static void main(String args[]) {
//         int n = 5;
//         int arr[] = { 1, 2, 33, 4, 5 };

//         int largestElement = largest(arr, n);
//         System.out.println("Largest element is: " + largestElement);
//     }

// }

/************* Q: Second largest Element in an array TC- O(n)  SC-O(1)*************/

// package Extra_Coding;

// public class Array_1 {
//     public static int secondLargest(int arr[], int size) {
//         int maxElement = Integer.MIN_VALUE;
//         int secondmax = Integer.MIN_VALUE;

//         for (int i = 0; i < size; i++) {
//             if (maxElement < arr[i]) {
//                 secondmax = maxElement;
//                 maxElement = arr[i];
//             } else if (arr[i] > secondmax && arr[i] < maxElement) {
//                 secondmax = arr[i]; // Update second largest if current is in between
//             }
//         }
//         return secondmax;
//     }

//     public static void main(String args[]) {
//         int n = 5;
//         int arr[] = { 1, 2, 33, 4, 5 };

//         int secondLargestEle = secondLargest(arr, n);
//         System.out.println("Second Largest element is: " + secondLargestEle);
//     }

// }

/************* Q: Smallest Element in an array TC- O(n)  SC-O(1)*************/

// package Extra_Coding;

// public class Array_1 {
//     public static int smallest(int arr[], int size) {
//         int minElement = Integer.MAX_VALUE; 

//         for (int i = 0; i < size; i++) {
//             if (minElement > arr[i]) {
//                 minElement = arr[i];
//             }
//         }
//         return minElement;
//     }

//     public static void main(String args[]) {
//         int n = 5;
//         int arr[] = { 1, 2, -99, 0, 5 };

//         int smallestElement = smallest(arr, n);
//         System.out.println("smallest element is: " + smallestElement);
//     }

// }

/************* Q: Second smallest Element in an array TC- O(n)  SC-O(1)*************/

// package Extra_Coding;

// public class Array_1 {
//     public static int secondSmallest(int arr[], int size) {
//         int minElement = Integer.MAX_VALUE;
//         int secondmin = Integer.MAX_VALUE;

//         for (int i = 0; i < size; i++) {
//             if (minElement > arr[i]) {
//                 secondmin = minElement;
//                 minElement = arr[i];
//             } else if (arr[i] < secondmin && arr[i] > minElement) {
//                 secondmin = arr[i]; // Update second largest if current is in between
//             }
//         }
//         return secondmin;
//     }

//     public static void main(String args[]) {
//         int n = 5;
//         int arr[] = { 1, -1, -99, -88, 5 };

//         int secondSmallestEle = secondSmallest(arr, n);
//         System.out.println("Largest element is: " + secondSmallestEle);
//     }

// }

/****** Balance Point of an Array  TC:O(N) SC: O(1)*******/

// package Extra_Coding;

// public class Array_1 {
//     public static int equilibrium(int arr[], int n) {
//         int sum = 0; // Initialize sum of whole array
//         int leftsum = 0; // initialize leftsum

//         // find sum of whole araay
//         for (int i = 0; i < n; i++) {
//             sum += arr[i];
//         }

//         for (int i = 0; i < n; i++) {
//             sum -= arr[i]; // sum is now right sum for index i
//             if (leftsum == sum) {
//                 return i;
//             } else {
//                 leftsum += arr[i];
//             }

//         }
//         // if no equilibrium index found then return -1
//         return -1;
//     }

//     public static void main(String args[]) {
//         int arr[] = { 1, 4, 3, 4, 1 };
//         int atIndex = equilibrium(arr, arr.length);
//         System.out.println("The equilibrium index is : " + atIndex);

//     }
// }

/*************
 * Array is a subset of another array TC: O(m*n) Sc: O(1)
 ************/

// public class Array_1 {

//     public static boolean subSet(int arr1[], int arr2[]) {
//         for (int i = 0; i < arr2.length; i++) {
//             for (int j = 0; j < arr1.length; j++) {
//                 if (arr2[i] == arr1[j]) {
//                     {
//                         break;
//                     }
//                 } else if (j == arr1.length - 1) {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         int arr1[] = { 1, 2, 3, 4, 5 };
//         int arr2[] = { 3, 4, 5 };

//         boolean ans = subSet(arr1, arr2);

//         if (ans) {
//             System.out.print("the arr2 is subset of a");
//         } else {
//             System.out.print("the arr2 is not subset of a");

//         }
//     }
// }

/***********
 * Program to check if an array is sorted or not TC: O(n) SC: O(1)
 ************/

// public class Array_1 {

//     public static boolean sortArray(int arr[]) {
//         int size = arr.length;
//         if (size == 1 || size == 0) {
//             return true;
//         }
//         for (int i = 1; i < size; i++) {
//             if (arr[i] < arr[i - 1]) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4 };

//         boolean ans = sortArray(arr);

//         if (ans) {
//             System.out.println("The array is sorted ");
//         } else {
//             System.out.println("The array is not sorted ");
//         }

//     }
// }


/*************** @LEETCODEIO By me Rank Transform of an Array  TC: O(N log N)  SC: O(N)************/


    // step_1 - Create an array temp[] to copy the orginal array
    // step_2 - sort the array  (By default in acending order)
    // step_3 - Visit all element in the temp and give the rank value
    // step_4 - Create Ranks array

/************ Find all symmetric pairs from a pairs of array ***********/

// import java.util.*;

// public class Array_1 {

//     // Function to find all symmetric pairs in a given array
//     static void findSymPairs(int[][] arr, int row) {
//         HashMap<Integer, Integer> hM = new HashMap<>();

//         for (int i = 0; i < row; i++) {
//             int first = arr[i][0]; // First element of the pair
//             int sec = arr[i][1];   // Second element of the pair

//             // Check if the symmetric pair exists in the map
//             if (hM.containsKey(sec) && hM.get(sec) == first) {
//                 System.out.println("(" + sec + ", " + first + ")");
//             } else {
//                 // Otherwise, store the pair in the map
//                 hM.put(first, sec);
//             }
//         }
//     }

//     // Driver function
//     public static void main(String[] args) {
//         int[][] arr = {
//             {11, 20},
//             {30, 40},
//             {5, 10},
//             {40, 30},
//             {10, 5}
//         };

//         int row = arr.length; // Calculate number of rows
//         findSymPairs(arr, row); // Find symmetric pairs
//     }
// }
