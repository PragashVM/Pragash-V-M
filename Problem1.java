
    import java.util.Scanner;

    public class Problem1 {
        public static class Calculator {
            double a, b;

            Calculator(double a, double b) {
                this.a = a;
                this.b = b;
            }

            double calculate(String operation) {
                switch (operation.toLowerCase()) {
                    case "add":
                        return a + b;
                    case "subtract":
                        return a - b;
                    case "multiply":
                        return a * b;
                    case "divide":
                        return b != 0 ? a / b : Double.NaN;
                    default:
                        System.out.println("Invalid operation");
                        return 0;
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a: ");
            double a = sc.nextDouble();
            System.out.print("Enter b: ");
            double b = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter operation (add/subtract/multiply/divide): ");
            String operation = sc.nextLine();

            Calculator calc = new Calculator(a, b);
            double result = calc.calculate(operation);
            System.out.println("Result: " + result);
        }
    }


