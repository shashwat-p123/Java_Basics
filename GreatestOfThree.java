// Check the number is Even or odd


// import java.util.*;
// public class EvenOddCheck {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         if(a%2==0){
//             System.out.println("Number is even");
//         }
//         else{
//             System.out.println("Number is odd");
//         }
//     }
// }


// Calculate the simple interest :-

// import java.util.Scanner;

// public class first {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Principal Amount: ");
//         float principal = sc.nextFloat();
//         System.out.print("Enter Rate of Interest: ");
//         float rate = sc.nextFloat();
//         System.out.print("Enter Time (in years): ");
//         float time = sc.nextFloat();
//         float interest = (principal * rate * time) / 100;
//         System.out.println("Simple Interest = " + interest);
//     }
// }

//swapping of two numbers

// import java.util.Scanner;

// public class SwapNumbers {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int a = input.nextInt();
//         System.out.print("Enter second number: ");
//         int b = input.nextInt();
//         System.out.println("Before Swapping: a = " + a + ", b = " + b);
//         int temp = a;
//         a = b;
//         b = temp;
//         System.out.println("After Swapping: a = " + a + ", b = " + b);
//     }
// }

//area of circle take radius in float

// import java.util.Scanner;
// public class CircleArea {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);	
//         System.out.print("Enter radius of circle: ");
//         float radius = sc.nextFloat();
//         float area = (float)(Math.PI * radius * radius);
//         System.out.println("Area of Circle = " + area);
//     }
// }

//area of rectangle take radius in float


// import java.util.Scanner;

// public class RectangleArea {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the length of the rectangle: ");
//         double length = sc.nextDouble();
//         System.out.print("Enter the width of the rectangle: ");
//         double width = sc.nextDouble();
//         double area = length * width;
//         System.out.println("The area of the rectangle is: " + area);
//     }
// }

// Greatest Among two numbers 

// import java.util.Scanner;
// public class GreaterNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int num2 = sc.nextInt();
//         if(num1 > num2) {
//             System.out.println("Greater number is: " + num1);
//         } else if(num2 > num1) {
//             System.out.println("Greater number is: " + num2);
//         } else {
//             System.out.println("Both numbers are equal.");
//         }
//     }
// }


// Find the greater number among the three numbers:-

// import java.util.Scanner;
// public class GreatestOfThree {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input three numbers
//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         System.out.print("Enter third number: ");
//         int c = sc.nextInt();

//         // Find the greatest number
//         int greatest;

//         if (a >= b && a >= c) {
//             greatest = a;
//         } else if (b >= a && b >= c) {
//             greatest = b;
//         } else {
//             greatest = c;
//         }

//         // Output the result
//         System.out.println("The greatest number is: " + greatest);

//         sc.close();
//     }
// }
