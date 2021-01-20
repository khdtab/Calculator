package se.lexicon;

import java.util.Scanner;


public class App {


    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("enter first number");
            int num1 = sc.nextInt();
            System.out.println("enter second number");
            int num2 = sc.nextInt();

            System.out.println("choose an operation to those numbers (1,2,3,4)");
            System.out.println("1. addition\n2. subtraction\n3. multiplication\n4. division\n5. Exit");
            int choice = sc.nextInt();


            int result = 0;
            switch (choice) {
                case 1:
                    result = addition(num1, num2);
                    System.out.println("The result of adding " + num1 + " and " + num2 + " is: " + result);
                    break;
                case 2:
                    result = subtraction(num1, num2);
                    System.out.println("The result of subtracting " + num1 + " and " + num2 + " is: " + result);
                    break;
                case 3:
                    result = multiplication(num1, num2);
                    System.out.println("The result of multiplication " + num1 + " and " + num2 + " is: " + result);
                    break;
                case 4:
                    result = division(num1, num2);
                    System.out.println("The result of division " + num1 + " and " + num2 + " is: " + result);
                    break;
                case 5:
                    System.exit(1);
                    break;

                default:
                    System.out.println("sorry! wrong choice.");
            }
        } while (true);

    }
}
