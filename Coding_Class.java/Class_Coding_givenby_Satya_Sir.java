
/** *************************  factorial  ************************************* */
import java.util.Scanner;
public class factorial {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        int ans = factorial(a);
        System.out.println("the ans of the facorial is: "+ans);
    }
}
/** ************************************  factors  ************************************* */
import java.util.Scanner;
public class factors {
    public static void factors(int n) {
        if (n == 0) {
            System.out.println(n);
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the user input: ");
        int a = sc.nextInt();
        factors(a);
    }
}
// /**************************************  Prime  **************************************/
import java.util.Scanner;
public class Prime {
    public static int prime(int n) {
        if(n <= 1){
            return 0;
        }
        for(int i = 2; i<n; i++){
            if(n % i == 0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the user input: ");
        int a = sc.nextInt();
        int ans = prime(a);
        if(ans == 1){
            System.out.println("the number is prime");
        }
        else{
            System.out.println("the number is not prime");
        }
    }
}
// /**************************************  Composite_Number  **************************************/
import java.util.Scanner;
public class class8_dalim {
    public static int Composite_Number(int n) {
        int count = 0;
        for(int i = 1; i<=n; i++){
            if(n % i == 0){
                count++;
                System.out.print(i+" ");
            }
        }
        return count;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the user input: ");
        int a = sc.nextInt();
        if(Composite_Number(a) > 2){
            System.out.println("\nthe number "+ a +" is Composite");
        }
        else{
            System.out.println("\nthe number "+ a +" is not Composite");
        }
    }
}
// /**************************************  Even Number  **************************************/
import java.util.Scanner;
public class class8_dalim {
    public static int EvenNumber(int n) {
            if(n % 2 == 0){
                return 1;
            }
            return 0;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the user input: ");
        int a = sc.nextInt();
        if(EvenNumber(a) == 1){
            System.out.println("the number "+ a +" is even Number");
        }
        else{
            System.out.println("the number "+ a +" is not even Number ");
        }
    }
}
// /**************************************  Reverse Number  **************************************/
import java.util.Scanner;
public class class8_dalim {
    public static int reverse(int n) {
        int reverseNum = 0;
        while (n != 0) {
            int digit = n % 10;
            reverseNum = reverseNum * 10 + digit;
            n = n / 10;
        }
        return reverseNum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the user input: ");
        int a = sc.nextInt();
        System.out.println("Before reverse the number is: "+a);
        int ans = reverse(a);
        System.out.println("After reverse the number is: "+ans);
    }
}
// /**************************************  Counting Digits  **************************************/
import java.util.Scanner;
public class class8_dalim {
    public static int countDigits(int n) {
        int count = 0;
        if(n == 0)
            return 1;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the user input: ");
        int a = sc.nextInt();
        System.out.println("Print the number is: " + a);
        System.out.println("the number of digit present the array is: " + countDigits(a));
    }
}
/** ********** Print the given array in the reverse order ********** */
public class class8_dalim {
    public static void arrReverse(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        arrReverse(arr);
    }
}
/** ********** WAP to find the sum of all element present ********** */
public class class8_dalim {
    public static int sumArr(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        int sumAns = sumArr(arr);
        System.out.println("the sum of the array is: "+sumAns);
    }
}
/** ********** WAP to find the product of all element present ********** */
public class class8_dalim {
    public static int productArr(int arr[]) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        int productAns = productArr(arr);
        System.out.println("the product of the array is: "+productAns);
    }
}
/** ********** WAP to print the odd index elements ********** */
public class class8_dalim {
    public static void oddIndex(int arr[]) {
        System.out.println("print the odd Index: ");
        for (int i = 0; i < arr.length; i++) {
            if(i %2 != 0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        oddIndex(arr);
    }
}
/** ********** WAP to print the Even index elements ********** */
public class class8_dalim {
    public static void evenIndex(int arr[]) {
        System.out.println("print the even Index: ");
        for (int i = 0; i < arr.length; i++) {
            if(i %2 == 0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        evenIndex(arr);
    }
}
/** ********** Check if an element exist in an array or not ********** */
import java.util.Scanner;
public class class8_dalim {
    public static boolean eleExitu(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4 };
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the target element: ");
        int targetEle = Sc.nextInt();
        eleExitu(arr, targetEle);
        if (eleExitu(arr, targetEle)) {
            System.out.println("Target ele is present");
        }
        else{
            System.out.println("Target ele is not present");
        }
    }
}
// /********** WAP to copy the elements of one array into another array ***********/
public class class8_dalim {
    public static void copyArray(int arr[]){
        int dublicateArray[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            dublicateArray[i] = arr[i];
        }
        System.out.println("Display the dublicate array: ");
        for(int i = 0; i < dublicateArray.length; i++){
            System.out.print(dublicateArray[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]= {1,2,3,4};
        copyArray(arr);
    }
}
// /********** WAP to avg of the elements in an array ***********/
public class class8_dalim {
    public static void avgArray(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;
        System.out.println("the avg of the array number is: " + avg);
    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4 };
        avgArray(arr);
    }
}
// /********** WAP to find how many even,odd,zero elements in an array ***********/
public class class8_dalim {
    public static void countZeroEvenOdd(int arr[]) {
        int zero = 0;
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Count of Zero: "+zero+" ,even number: "+even+" ,odd number: "+odd);
    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4 ,0};
        countZeroEvenOdd(arr);
    }
}
// /********** WAP to find max elements in an array ***********/
public class class8_dalim {
    public static int largerNumber(int arr[]) {
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 8, 4, 0 };
        int max = largerNumber(arr);
        System.out.println("The maximum number is an array is: "+max);
    }
}
/** ******** WAP to find min elements in an array ********** */
public class class8_dalim {
    public static int largerNumber(int arr[]) {
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 8, 4, 0 };
        int min = largerNumber(arr);
        System.out.println("The minimum number is an array is: "+min);
    }
}
/** ********* WAP to find frequency of the target elements in an array  ********** */
 import java.util.Scanner;
public class class8_dalim {
    public static int frequencyNum(int arr[], int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 8, 1, 0 };
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int freqNumber = frequencyNum(arr,target);
        System.out.println("The minimum number is an array is: " + freqNumber);
    }
}
/** ********  Find the pair of elements whose sum is same as the target elemet ********** */
public class PairSumExample {
    public static void pairSum(int arr[], int target) {
        boolean found = false; // to track if any pair is found
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + ", " + arr[j]);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No pairs found.");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3, 0, 5};
        int target = 5;
        pairSum(arr, target); // just call, no need to capture return
    }
}
// using list 
import java.util.*;
public class PairSumExample {
    public static List<int[]> pairSum(int arr[], int target) {
        List<int[]> pairs = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    pairs.add(new int[]{arr[i], arr[j]}); // store pair
                }
            }
        }
        return pairs;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3, 0, 5};
        int target = 5;
        List<int[]> result = pairSum(arr, target);
        if (result.isEmpty()) {
            System.out.println("No pairs found.");
        } else {
            for (int[] p : result) {
                System.out.println(p[0] + ", " + p[1]);
            }
        }
    }
}
/*** ******** Swap the elements in a given array of the target index element ***********/
import java.util.Scanner;
public class swap {
    public static void swapIndex(int arr[], int index_1, int index_2) {
        if (index_1 < 0 || index_2 < 0 || index_1 >= arr.length || index_2 >= arr.length) {
            System.out.println("Invalid Input");
        } else {
            arr[index_1] += arr[index_2];
            arr[index_2] = arr[index_1] - arr[index_2];
            arr[index_1] -= arr[index_2];
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Index: ");
        int index_1 = sc.nextInt();
        System.out.println("Enter the second Index: ");;
        int index_2 = sc.nextInt();
        System.out.print("Array before Swap Index: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        swapIndex(arr, index_1, index_2);
        System.out.print("\nArray after Swap Index: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/** ********* Remove Dublicate from the array ********** */
public class swap {
    public static void removeDuplicate(int arr[]) {
        int dummy = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == dummy) {
                continue; // skip already marked
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[i] != dummy) {
                    arr[j] = dummy; // mark duplicate with dummy
                }
            }
        }
        // Print array without duplicates
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != dummy) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 2, 5};
        removeDuplicate(arr);
    }
}

/** ****  Merge short array ****** */
public class ArrayExample {

    public static void mergeArray(int arr1[], int arr2[]) {
        int s1 = 0;
        int E1 = arr1.length;
        int s2 = 0;
        int E2 = arr2.length;

        while (s1 < E1 && s2 < E2) {
            if (arr1[s1] < arr2[s2]) {
                System.out.print(arr1[s1++]);
            } else if (arr1[s1] > arr2[s2]) {
                System.out.print(arr2[s2++]);
            }
        }

        while (s1 < E1) {
            System.out.print(arr1[s1++] + " ");
        }
        while (s2 < E2) {
            System.out.print(arr2[s2++] + " ");
        }
    }

    public static void main(String[] args) {
        int arr_1[] = {1, 3, 5};
        int arr_2[] = {2, 4};

        mergeArray(arr_1, arr_2);

    }
}

/** ****  Merge two array ****** */

public class ArrayExample {

    public static void merge_two_Array(int arr_1[], int arr_2[]) {

        int length = arr_1.length + arr_2.length;
        int arr_3[] = new int[length];

        int i = 0;

        // Copy elements of arr_1 into arr_3
        for (int j = 0; j < arr_1.length; j++) {
            arr_3[i] = arr_1[j];
            i++;
        }

        // Copy elements of arr_2 into arr_3
        for (int k = 0; k < arr_2.length; k++) {
            arr_3[i] = arr_2[k];
            i++;
        }

        // Print merged array
        System.out.print("Merged Array: ");
        for (int val : arr_3) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr_1 = {1, 2, 3, 4};
        int[] arr_2 = {5, 6, 7, 8};

        merge_two_Array(arr_1, arr_2);
    }
}


/************* Q: Second largest Element in an array TC- O(n) SC-O(1)*************/
package Extra_Coding;
public class Array_1 {
    public static int secondLargest(int arr[], int size) {
        int maxElement = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (maxElement < arr[i]) {
                secondmax = maxElement;
                maxElement = arr[i];
            } else if (arr[i] > secondmax && arr[i] < maxElement) {
                secondmax = arr[i]; // Update second largest if current is in between
            }
        }
        return secondmax;
    }
    public static void main(String args[]) {
        int n = 5;
        int arr[] = { 1, 2, 33, 4, 5 };
        int secondLargestEle = secondLargest(arr, n);
        System.out.println("Second Largest element is: " + secondLargestEle);
    }
}
/**
 * *********** Q: Second smallest Element in an array TC- O(n)* SC-O(1)*************/
package Extra_Coding;
public class Array_1 {
    public static int secondSmallest(int arr[], int size) {
        int minElement = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (minElement > arr[i]) {
                secondmin = minElement;
                minElement = arr[i];
            } else if (arr[i] < secondmin && arr[i] > minElement) {
                secondmin = arr[i]; // Update second largest if current is in between
            }
        }
        return secondmin;
    }
    public static void main(String args[]) {
        int n = 5;
        int arr[] = { 1, -1, -99, -88, 5 };
        int secondSmallestEle = secondSmallest(arr, n);
        System.out.println("Largest element is: " + secondSmallestEle);
    }
}
// Input:- 127342 
// output:- 242173
import java.util.Scanner;
public class ArrayExample {
    public static void inputArray(int arr[], Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); 
        }
    }
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  
        }
        System.out.println();
    }
    public static void arrangeArray(int arr[]) {
        int[] newArr = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newArr[index++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                newArr[index++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newArr[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        inputArray(arr, sc);
        System.out.println("Print before array: ");
        printArray(arr);
        arrangeArray(arr);
        System.out.println("Print after array: ");
        printArray(arr);
    }
}

/*######   2nd approach ########## */
import java.util.Scanner;
public class ArrayExample {
    public static void inputArray(int arr[], Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // Optimized Rearrange function (in-place)
    public static void arrangeArray(int arr[]) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Move left forward if it's even
            if (arr[left] % 2 == 0) {
                left++;
            }
            // Move right backward if it's odd
            else if (arr[right] % 2 != 0) {
                right--;
            }
            // Swap when left is odd and right is even
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        inputArray(arr, sc);
        System.out.println("Print before array: ");
        printArray(arr);
        arrangeArray(arr);
        System.out.println("Print after array: ");
        printArray(arr);
    }
}

/** *************************  Chech a neon number  ************************************* */

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        int sum = 0;

        while (square > 0) {
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is a Neon Number.");
        } else {
            System.out.println(num + " is not a Neon Number.");
        }
    }
}


/** *************************  Bouncy Number  ************************************* */
import java.util.Scanner;

public class Array_1 {

    // Function to check if a number is bouncy
    public static boolean checkBouncyNumber(int num) {

        // Numbers with less than 3 digits are never bouncy
        if (num < 100) {
            return false;
        }

        boolean increasing = false;
        boolean decreasing = false;

        int prevDigit = num % 10; // last digit
        num = num / 10;

        while (num > 0) {
            int currDigit = num % 10;

            if (currDigit < prevDigit) {
                increasing = true;  // trend is increasing
            } else if (currDigit > prevDigit) {
                decreasing = true;  // trend is decreasing
            }

            // If both increasing and decreasing trends exist → number is bouncy
            if (increasing && decreasing) {
                return true;
            }

            prevDigit = currDigit;
            num = num / 10;
        }

        return false; // number is not bouncy
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the user number: ");
        int num = sc.nextInt();

        boolean ans = checkBouncyNumber(num);

        if (ans) {
            System.out.println("The number is Bouncy");
        } else {
            System.out.println("The number is not Bouncy");
        }

        sc.close();
    }
}

/** *************************  Harshad number  ************************************* */


import java.util.Scanner;

public class NeonNumber {

    public static boolean chekharshad(int num) {
        int sum = 0;
       int trial = num;

        while (trial > 0) {
            int digit = trial % 10;
            sum += digit;
            trial /= 10;
        }

        if (num % sum == 0) {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (chekharshad(num)) {
            System.out.println(num + " is a Harshad Number.");
        } else {
            System.out.println(num + " is not a Harshad Number.");
        }
    }
}


/** *************************  Palindrome number  ************************************* */

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int num) {
        int original = num;   // store original number
        int reversed = 0;     // to store reversed number

        while (num > 0) {
            int digit = num % 10;         // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            num = num / 10;               // remove last digit
        }

        return original == reversed; // check if palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome number.");
        } else {
            System.out.println(num + " is NOT a Palindrome number.");
        }

        sc.close();
    }
}

/** *************************  Xylem or Phloem number  ************************************* */


import java.util.Scanner;

public class XylemPhloem {

    // Function to get sum of first and last digits
    public static int sumFirstLast(int num) {
        int last = num % 10;

        int first = num;
        while (first >= 10) {
            first = first / 10; // keep dividing to get first digit
        }

        return first + last;
    }

    // Function to get sum of middle digits
    public static int sumMiddleDigits(int num) {
        int sum = 0;

        // Remove last digit
        num = num / 10;

        // Remove first digit
        int first = num;
        while (first >= 10) {
            first = first / 10; // get first digit
        }

        // Sum all digits except first digit
        while (num > 0) {
            int digit = num % 10;
            if (digit != first) {  // skip first digit
                sum += digit;
            }
            num = num / 10;
        }

        return sum;
    }

    // Function to check Xylem or Phloem
    public static void checkXylemPhloem(int num) {
        int sumExtreme = sumFirstLast(num);
        int sumMiddle = sumMiddleDigits(num);

        if (sumExtreme == sumMiddle) {
            System.out.println(num + " is a Xylem Number.");
        } else {
            System.out.println(num + " is a Phloem Number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        checkXylemPhloem(num);
        sc.close();
    }
}


/** *************************WAP to return array is accending or decending in same program ************************************* */
import java.util.Scanner;

public class ArrayOrderCheck {

    // Returns an array of two booleans: [ascending, descending]
    public static boolean[] checkArrayOrder(int[] arr) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                descending = false;
            } else if (arr[i] > arr[i + 1]) {
                ascending = false;
            }
        }

        return new boolean[]{ascending, descending};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call function to get ascending/descending flags
        boolean[] result = checkArrayOrder(arr);
        boolean ascending = result[0];
        boolean descending = result[1];

        // Printing logic in main
        if (ascending) {
            System.out.println("The array is in Ascending order.");
        } else if (descending) {
            System.out.println("The array is in Descending order.");
        } else {
            System.out.println("The array is neither Ascending nor Descending.");
        }

        sc.close();
    }
}

/** *************************  print the common element between two array  ************************************* */

public class ArrayOrderCheck {

    public static void intersection_ele(int arr_1[], int arr_2[]) {
        System.out.print("Intersection element are: ");
        for (int i = 0; i < arr_1.length; i++) {
            for (int j = 0; j < arr_2.length; j++) {
                if (arr_1[i] == arr_2[j]) {
                    System.out.print(arr_1[i] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr_1[] = {1, 2, 3, 4};
        int arr_2[] = {2, 3};
        intersection_ele(arr_1, arr_2);
    }
}


/** *************************  right shift the array   ************************************* */



/** *************************  left shif and the array   ************************************* */
/** ************************* the 1st half of the array is reverse order and the 2nd half in normal order ************************************* */
/** *************************  happy number and Sad number   ************************************* */
/** *************************  WAP to find the highest common factor of two number   ************************************* */
/** ************************* WAP to cheack wheather a given number armstrong or not   ************************************* */
/** *************************  WAP check wheather a given number is perfect    ************************************* */
/** *************************magic number************************************* */
/** *************************  Fibonacci Series ************************************* */
/** ************************* Alter prime number  ************************************* */
/** *************************  find the frequency of all the element present in an array ************************************* */
/** ************************* Count the total number of alphabets present in string  ************************************* */
/** ************************* Count the vowels the string  ************************************* */
/** ************************* Print only the constrant from string ************************************* */
/** ************************* replace the character in a string ************************************* */
/** *************************Reverse a string ************************************* */
/** ************************* Check wheather a string is palindrom or not ************************************* */
/** ************************* Check wheather a string is Anagram number or not  ************************************* */
/** ************************* Count the frequency of a target character from a String ************************************* */
/** *************************Count the frequency of all the characters present in a given string ************************************* */
/** ************************* remove Dublicate from string or print unique element from a string ************************************* */
/** ************************* Print the 1st non-repeating character in a string ************************************* */
/** *************************Check wheather a char is present in a string or not  ************************************* */
/** ************************* Check wheather a substring is present insize another string or not  ************************************* */


/** *************************   Find the largest sub-string of a string ************************************* */
/** *************************  Count the Frequency of a sub-string  ************************************* */
/** *************************  Find the 1st char of every word in a string  ************************************* */
/** *************************  Count the number ,upper-case Alphabets , lowercase,alphabets and Special chaaracter pressent in a string  ************************************* */
/** *************************  Wheather the passward is valid or not  ************************************* */
/** *************************  Find the missing char from a sequency of a character  ************************************* */
/** *************************  Find wheather a  string is in either ascending and or decending order  ************************************* */

/######################## Pattern #####################/ 
    /*
    Grid
    co-ordinate 
    condition
    space 
    */
    

/** *************************  Printing the primary diagonal  ************************************* */
/** *************************  printing the secondery diagonal  ************************************* */
/** *************************  Printing a cross ************************************* */
/** *************************  printing to print jessus cross ************************************* */
/** *************************  printing to print holosquare  ************************************* */
/** *************************  printing right angle traingle ************************************* */
/** *************************  printing to RAT toward the upper part of the printing diagonal  ************************************* */
/**************************** printing RAT for secondary diagonal **************************/    
/**************************** printing RAT towar the top of the secondary diagonal **************************/    
/**************************** printing the normal traingle  **************************/    
/**************************** printing the reverse normal traingle **************************/
/**************************** printing a number normal traingle **************************/


/######################## 2D Array #####################/     







    
    
/**************************** TO Store and printing in 2D array **************************/    
/****************************  Find the sum of all the element present in the primarge diagonal if the matrix **************************/     
/****************************  To iterate the row array **************************/ 
/**************************** FInd the product of all the element present in the secondary diagonal in a given matrix  **************************/ 
/**************************** Transposing a given matrix **************************/ 
/****************************  **************************/ 
    

/######################## Sorting #####################/       

     // using one for loop
    
    public static void bubbleSort(int[] A, int n) {
        boolean swapped;
        for (int i = 0; i < n - 1; i++) { // Pass
                if (A[i] > A[i + 1]) {
                    int temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                    i = -1;
            }
            
        }
    }

// // using two for loop
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
            if (!swapped) { // NOT swappedOr wapped == false
                break;
            }
        }
    }
    
    





