import java.util.Scanner;

class Calculator {
    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add() {
        return this.a + this.b;
    }

    public double subtract() {
        return this.a - this.b;
    }

    public double multiply() {
        return this.a * this.b;
    }

    public double divide() {
        if (this.b != 0) {
            return this.a / this.b;
        } else {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = sc.nextLine();

        Calculator calc = new Calculator(a, b);

        switch (operation) {
            case "add":
                System.out.println("Result: " + calc.add());
                break;
            case "subtract":
                System.out.println("Result: " + calc.subtract());
                break;
            case "multiply":
                System.out.println("Result: " + calc.multiply());
                break;
            case "divide":
                System.out.println("Result: " + calc.divide());
                break;
            default:
                System.out.println("Invalid operation!");
                break;
        }

        sc.close();
    }
}
