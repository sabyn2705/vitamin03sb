import java.util.Scanner;

public class ExerciseApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Java Practice Menu =====");
            System.out.println("1. Rectangle Calculator");
            System.out.println("2. Basic Calculator (+ - * /)");
            System.out.println("3. Bank Interest Calculator");
            System.out.println("4. Even/Odd Number Checker");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    RectangleCalculator.run();
                    break;
                case 2:
                    BasicCalculator.run();
                    break;
                case 3:
                    BankInterestCalculator.run();
                    break;
                case 4:
                    EvenOddChecker.run();
                    break;
                case 0:
                    System.out.println("Goodbye! 👋");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }

        } while (choice != 0);
    }
}

class RectangleCalculator {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        int width = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        System.out.println("Perimeter = " + 2 * (width + height));
        System.out.println("Area = " + width * height);
    }
}

class BasicCalculator {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        if (b != 0) {
            System.out.println("Quotient: " + ((float) a / b));
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }
}

class BankInterestCalculator {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.print("Enter principal (P): ");
            double p = sc.nextDouble();
            System.out.print("Enter rate per year (R) %: ");
            double r = sc.nextDouble();
            System.out.print("Enter time (T) in years: ");
            double t = sc.nextDouble();

            double interest = (p * r * t) / 100;
            System.out.println("Interest = " + interest);

            System.out.print("Calculate again? (y/n): ");
            choice = sc.next().toLowerCase().charAt(0);
        } while (choice == 'y');
    }
}

class EvenOddChecker {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Please enter a positive number!");
        } else if (num % 2 == 0) {
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number.");
        }
    }
}
