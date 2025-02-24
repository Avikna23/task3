public class Calculator {
    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

