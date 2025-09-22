// package Thery_Class;
// public class dalim {
//     public static void main(String[] args) {
//         for(; ;) {   // infinite loop
//             System.out.println("dalim");
//         }
//     }
// }

// 1. OutOfMemoryError
// Happens when memory runs out due to object creation inside infinite loop.

// public class class6_dalim {
//     public static void main(String[] args) {
//         for(; ;) {
//             String s = new String("dalim"); // creates new object every time
//         }
//     }
// }


// 2. StackOverflowError
// Occurs if recursion is called inside infinite loop without exit.
// Reason → Each recursive call uses stack memory, infinite recursion → stack overflow.

// public class class6_dalim {
//     public static void main(String[] args) {
//         for(; ;) {
//             main(null);  // recursive call inside loop
//         }
//     }
// }


// 3. ArithmeticException
// Division by zero inside infinite loop.

// public class class6_dalim {
//     public static void main(String[] args) {
//         for(; ;) {
//             int x = 10 / 0;
//         }
//     }
// }


// 4. NullPointerException
// Reason → s is null, calling length() → NullPointerException.

// public class class6_dalim {
//     public static void main(String[] args) {
//         String s = null;
//         for(; ;) {
//             System.out.println(s.length());
//         }
//     }
// }


// 5. ArrayIndexOutOfBoundsException
// Reason → Array has only 3 elements, accessing index 5 → ArrayIndexOutOfBoundsException.

// public class class6_dalim {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3};
//         for(; ;) {
//             System.out.println(arr[5]);
//         }
//     }
// }

// 6. NumberFormatException  Converting invalid string to number.

// public class class6_dalim {
//     public static void main(String[] args) {
//         for(; ;) {
//             int num = Integer.parseInt("dalim");
//         }
//     }
// }

// 7. ClassCastException    Invalid type casting.
// Reason → String cannot be cast to Integer → ClassCastException.

// public class class6_dalim {
//     public static void main(String[] args) {
//         Object obj = "dalim";
//         for(; ;) {
//             Integer i = (Integer) obj; // wrong cast
//         }
//     }
// }


// 8. InputMismatchException    When wrong type of input is entered with Scanner.

// import java.util.*;

// public class class6_dalim {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         for(; ;) {
//             int n = sc.nextInt();  // expecting number
//         }
//     }
// }


// public class class6_dalim {
//     public static void main(String[] args) {
//         for(int i = 0; ; i++) {
//             System.out.println("dalim");  // run infinite
//         }
//     }
// }


// public class class6_dalim {
//     // method with variable arguments
//     static void printNumbers(int... numbers) {
//         System.out.println("Number of arguments: " + numbers.length);

//         for (int num : numbers) {
//             System.out.println(num);
//         }
//     }

//     public static void main(String[] args) {
//         // printNumbers();                // no arguments
//         // printNumbers(10);              // one argument
//         printNumbers(1, 2, 3, 4, 5);   // multiple arguments
//     }
// }
