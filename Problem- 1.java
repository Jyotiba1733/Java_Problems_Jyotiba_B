import java.util.Scanner;

class Calculator 
{
    double a, b;
    String operation;

    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    public void calculate() 
    {
        switch (operation) {
            case "addition":
                System.out.println("Result: " + (a + b));
                break;
            case "subtraction":
                System.out.println("Result: " + (a - b));
                break;
            case "multiplication":
                System.out.println("Result: " + (a * b));
                break;
            case "division":
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation. Please enter addition, subtraction, multiplication, or division.");
        }
    }
}

public class Main 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Enter operation (addition, subtraction, multiplication, division): ");
        String operation = scanner.nextLine();

        Calculator calc = new Calculator(a, b, operation);
        calc.calculate();

        scanner.close();
    }
}
