package handsOn.proj;

import java.util.Scanner;

public class myProject {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=======================================");
            System.out.println();
            System.out.println("Java Programming Structure:");
            System.out.println("1] Sequential");
            System.out.println("2] Selection");
            System.out.println("3] Iteration");
            System.out.println("0] Exit the program");
            System.out.println();
            System.out.println();
            System.out.print("Choose the structure you want: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    SequentialMenu(scanner);
                    break;
                case 2:
                    SelectionMenu(scanner);
                    break;
                case 3:
                    IterationMenu(scanner);
                    break;
                case 0:
                    System.out.println("SYSTEM SHUT DOWN!");
                    System.out.println();
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

    }

    public static void SequentialMenu(Scanner scanner) {

        while (true) {
            System.out.println();
            System.out.println("=======================================");
            System.out.println();
            System.out.println("1] Calculate the area of the triangle");
            System.out.println("2] Convert Fahrenheit to Celsius");
            System.out.println("3] Compute Area, circumference and diameter of a circle");
            System.out.println("0] Back to the previous option");
            System.out.println();
            System.out.print("Please enter the number you choose: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    AreaOftriangle(scanner);
                    break;
                case 2:
                    CelciusToFahrenheit(scanner);
                    break;
                case 3:
                    CirclePropertiesCalculator(scanner);
                    break;
                case 0:
                    return;
            }
        }
    }

    public static void SelectionMenu(Scanner scanner) {

        while (true) {
            System.out.println();
            System.out.println("=======================================");
            System.out.println("1] Determin odd or even");
            System.out.println("2] Determine if year is leap year or not");
            System.out.println("3] Shipping Cost");
            System.out.println("0] Back to the previous option");
            System.out.println();
            System.out.print("Please enter the number you choose: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    OddOrEven(scanner);
                    break;
                case 2:
                    LeapYear(scanner);
                    break;
                case 3:
                    ShippingCost(scanner);
                    break;
                case 0:
                    return;
            }
        }
    }

    public static void IterationMenu(Scanner scanner) {

        while (true) {
            System.out.println();
            System.out.println("=======================================");
            System.out.println("1] First 10 Fibonacci numbers");
            System.out.println("2] ATM simulation");
            System.out.println("3] Multiplication Table of a given number");
            System.out.println("0] Back to the previous option");
            System.out.println();
            System.out.print("Please enter the number you choose: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Fibonacci(scanner);
                    break;
                case 2:
                    AtmSimulation(scanner);
                    break;
                case 3:
                    Multiplication(scanner);
                    break;
                case 0:
                    return;
            }
        }
    }

    public static void AreaOftriangle(Scanner scanner) {
        System.out.println();
        System.out.println("=======================================");
        System.out.println();
        System.out.println("[[ AREA OF TRIANGLE CALCULATOR ]]");
        System.out.println();

        System.out.print("Enter the length of the triangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the triangle: ");
        double width = scanner.nextDouble();

        double area = 0.5 * length * width;
        System.out.println();
        System.out.println("The area of triangle is: " + area);
    }

    public static void CelciusToFahrenheit(Scanner scanner) {
        System.out.println();
        System.out.println("=======================================");
        System.out.println();
        System.out.println("[[ FAHRENHEIT TO CELSIUS CONVERTER ]]");
        System.out.println();

        System.out.print("Enter a value(FAHRENHEIT): ");
        double fahrenheit = scanner.nextDouble();

        double convertedValue = (fahrenheit - 32) * 5 / 9;

        System.out.println();
        System.out.println("Converted Value: " + convertedValue);
    }

    public static void CirclePropertiesCalculator(Scanner scanner) {
        System.out.println();
        System.out.println("=======================================");
        System.out.println();
        System.out.println("[[ CIRCLE PROPERTIES CALCULATOR ]]");
        System.out.println();

        System.out.print("Enter the RADIUS of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        double diameter = 2 * radius;

        System.out.println();
        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Diameter of the circle: " + diameter);
        System.out.println();
    }

    public static void OddOrEven(Scanner scanner) {
        System.out.println();
        System.out.println("=======================================");
        System.out.println();
        System.out.println("[[ DETERMINE IF ODD OR EVEN ]]");
        System.out.println();

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean ifEven = number % 2 == 0;

        if (ifEven) {
            System.out.println("The " + number + " is an even number.");
        } else {
            System.out.println("The " + number + " is an odd number.");
        }
    }

    public static void LeapYear(Scanner scanner) {
        System.out.println();
        System.out.println("=======================================");
        System.out.println();
        System.out.println("[[ DETERMINE IF LEAP YEAR OR NOT ]]");
        System.out.println();

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " was a leap year!");
        } else {
            System.out.println(year + " was not a leap year!");
        }
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void ShippingCost(Scanner scanner) {
        System.out.println();
        System.out.println("=======================================");
        System.out.println();
        System.out.println("[[ SHIPPINIG COST ]]");
        System.out.println();

        System.out.print("Enter The package weight(POUNDS): ");
        double weight = scanner.nextInt();

        if (weight <= 10) {
            System.out.println("Your package cost Php 250.00");
        } else {
            System.out.println("Your package cost Php 400.00");
        }
    }

    public static void Fibonacci(Scanner scanner) {
        int n = 10;
        long[] fibonacci = new long[n];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("THE FIRST 10 FIBONACCI SEQUENCE:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }

    public static void AtmSimulation(Scanner scanner) {
        double initialBalance = 0;

        while (true) {
            System.out.println("=======================================");
            System.out.println("[[ ATM MACHINE ]]");
            System.out.println();
            System.out.print("Your current balance is " + initialBalance);
            System.out.println();
            System.out.println("1] Deposit");
            System.out.println("2] Withdraw");
            System.out.println("0] Back to the previous menu");

            System.out.println();
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("=======================================");
                    System.out.println();
                    System.out.print("Your current balance is " + initialBalance);
                    System.out.println();
                    System.out.print("Enter amount you want to deposit: ");

                    double amount = scanner.nextDouble();
                    initialBalance += amount;
                    break;
                case 2:
                    System.out.println("=======================================");
                    System.out.println("Your current balance is " + initialBalance);
                    System.out.print("Enter amount you want to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount <= initialBalance) {
                        initialBalance -= withdrawAmount;
                    } else {
                        System.out.println("Insufficient funds!");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;

            }
        }
    }

    public static void Multiplication(Scanner scanner) {
        System.out.println();
        System.out.println("=======================================");
        System.out.println();
        System.out.println("[[ MULTIPLICATION ]]");
        System.out.println();

        System.out.print("Enter a number you want to multiply: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int ans = num * i;
            System.out.println(num + " x " + i + " = " + ans);
        }

    }
}
