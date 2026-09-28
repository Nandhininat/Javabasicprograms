package task;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== CALCULATOR =====");
        System.out.println("1. Arithmetic Operators");
        System.out.println("2. Assignment Operators");
        System.out.println("3. Relational Operators");
        System.out.println("4. Logical Operators");
        System.out.print("Choose category (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: {
                System.out.print("Enter first number: ");
                int a = sc.nextInt();
                System.out.print("Enter second number: ");
                int b = sc.nextInt();
                System.out.print("Enter operator (+, -, *, /, %): ");
                char op = sc.next().charAt(0);

                int result;
                switch (op) {
                    case '+': result = a + b; break;
                    case '-': result = a - b; break;
                    case '*': result = a * b; break;
                    case '/': result = a / b; break;
                    case '%': result = a % b; break;
                    default:
                        System.out.println("Invalid Operator");
                        sc.close();
                        return;
                }
                System.out.println("Result = " + result);
                break;
            }

            case 2: {
                System.out.print("Enter a number: ");
                int a = sc.nextInt();

                a += 5;  System.out.println("a += 5 -> " + a);
                a -= 3;  System.out.println("a -= 3 -> " + a);
                a *= 2;  System.out.println("a *= 2 -> " + a);
                a /= 4;  System.out.println("a /= 4 -> " + a);
                a %= 5;  System.out.println("a %= 5 -> " + a);
                break;
            }

            case 3: {
                System.out.print("Enter first number: ");
                int a = sc.nextInt();
                System.out.print("Enter second number: ");
                int b = sc.nextInt();

                System.out.println("a == b : " + (a == b));
                System.out.println("a != b : " + (a != b));
                System.out.println("a > b  : " + (a > b));
                System.out.println("a < b  : " + (a < b));
                System.out.println("a >= b : " + (a >= b));
                System.out.println("a <= b : " + (a <= b));
                break;
            }

            case 4: {
                System.out.print("Enter first condition (true/false): ");
                boolean x = sc.nextBoolean();
                System.out.print("Enter second condition (true/false): ");
                boolean y = sc.nextBoolean();

                System.out.println("x && y : " + (x && y));
                System.out.println("x || y : " + (x || y));
                System.out.println("!x     : " + (!x));
                break;
            }

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}