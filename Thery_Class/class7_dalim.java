// package Thery_Class;
// 1️⃣ Accessing static variable inside the same class (Direct Access)

// public class class7_dalim {
//     static int a = 10;  // static variable inside same class

//     public static void main(String[] args) {
//         // Direct access (same class)
//         System.out.println(a);  
//         a = 50;
//         System.out.println(a);
//     }
// }


// 2️⃣ Accessing static variable from another class (Class Name Reference)

// class Independent {
//     static int a = 20;  // static variable
// }

// public class class7_dalim {
//     public static void main(String[] args) {
//         // Access using class name
//         System.out.println(Independent.a);  
//         Independent.a = 100;
//         System.out.println(Independent.a);

        

//     }
// }


// 3️⃣ Accessing static variable using Object Reference

// class Independent {
//     static int a = 30;  // static variable
// }

// public class class7_dalim {
//     public static void main(String[] args) {
//         // Create object
//         Independent obj = new Independent();

//         // Access using object reference
//         System.out.println(obj.a);  
//         obj.a = 200;  
//         System.out.println(obj.a);
//     }
// }




// static Initialization Block

// class class7_dalim {
//     static int a;

//     // Static initialization block
//     static {
//         a = 10;  // initializing static variable
//         System.out.println("Static block executed, a = " + a);
//     }

//     public static void main(String[] args) {
//         a = 20;
//         System.out.println("Main method executed, a = " + a);
//     }
// }


// Anonymous Block

// class Demo {
//     int a;

//     // Anonymous block (runs before constructor, every time object is created)
//     {
//         a = 10;  
//         System.out.println("Anonymous block executed, a = " + a);
//     }

//     // Constructor
//     Demo() {
//         System.out.println("Constructor executed");
//     }
// }

// public class class7_dalim {
//     public static void main(String[] args) {
//         Demo d1 = new Demo();  // creates first object
//         Demo d2 = new Demo();  // creates second object
//     }
// }
