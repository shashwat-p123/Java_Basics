
// Java Program to Read The Number From Standard Input 

// import java.util.Scanner;

// public class ReadNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();
//         System.out.println("You entered: " + number);
//     }
// }

// Java Program to Get Input from the User 

// import java.util.Scanner;
// public class UserInput {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter your name: ");
//         String name = scanner.nextLine();
//         System.out.print("Enter your age: ");
//         int age = scanner.nextInt();
//         System.out.print("Enter your marks: ");
//         double marks = scanner.nextDouble();
//         System.out.println("\n--- User Information ---");
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Marks: " + marks);
//         scanner.close();
//     }
// }

// Java Program to Multiply Two Floating-Point Numbers 

// import java.util.Scanner;

// public class MultiplyFloats {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         float num1 = scanner.nextFloat();
//         System.out.print("Enter the second number: ");
//         float num2 = scanner.nextFloat();
//         float result = num1 * num2;
//         System.out.println("Product: " + result);
//         scanner.close();
//     }
// }


//java program for swapping of two numbers

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

// Check if a number is Positive, Negative, or Zero

// import java.util.Scanner;
// public class CheckNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         if (num > 0)
//             System.out.println("Positive");
//         else if (num < 0)
//             System.out.println("Negative");
//         else
//             System.out.println("Zero");
//     }
// }


// Find the Greatest of Two Numbers (if-else)

// import java.util.Scanner;
// public class GreatestOfTwo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter two numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         if (a > b)
//             System.out.println(a + " is greater");
//         else
//             System.out.println(b + " is greater");
//     }
// }


// Find the greater number among the three numbers:-

// import java.util.Scanner;
// public class GreatestOfThree {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();
//         System.out.print("Enter third number: ");
//         int c = sc.nextInt();
//         int greatest;
//         if (a >= b && a >= c) {
//             greatest = a;
//         } else if (b >= a && b >= c) {
//             greatest = b;
//         } else {
//             greatest = c;
//         }
//         System.out.println("The greatest number is: " + greatest);
//         sc.close();
//     }
// }

// check if a year is a leap year

// import java.util.Scanner;
// public class LeapYear {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a year: ");
//         int year = sc.nextInt();
//         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
//             System.out.println("Leap Year");
//         else
//             System.out.println("Not a Leap Year");
//     }
// }

// Check if a Character is Vowel or Consonant

// import java.util.Scanner;
// public class VowelConsonant {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a character: ");
//         char ch = sc.next().toLowerCase().charAt(0);
//         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
//             System.out.println("Vowel");
//         else if (Character.isLetter(ch))
//             System.out.println("Consonant");
//         else
//             System.out.println("Not an alphabet");
//     }
// }

// Simple Calculator Using Switch-Case

import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0)
                    System.out.println("Result: " + (num1 / num2));
                else
                    System.out.println("Cannot divide by zero!");
                break;
            default:
                System.out.println("Invalid operator!");
        }
    }
}