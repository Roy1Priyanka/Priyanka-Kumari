import java.util.*;

class Calculator {
    public double calculate(double a, double b, String op) {
        switch (op) {
            case "add": return a + b;
            case "sub": return a - b;
            case "mul": return a * b;
            case "div":
                if (b == 0) return Double.NaN;
                return a / b;
            default: return Double.NaN;
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String op = sc.next().toLowerCase();

        Calculator calc = new Calculator();
        System.out.println(calc.calculate(a, b, op));

        sc.close();
    }
}
