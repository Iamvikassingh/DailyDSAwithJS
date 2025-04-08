
interface MathOperation {

    double calculate(double a, double b);

    default void calculateAndPrint(double a, double b) {
        System.out.println("Result: " + calculate(a, b));
    }

    static boolean isPositive(double number) {
        return number > 0;
    }
}

class AdditionOperation implements MathOperation {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}

class SubtractionOperation implements MathOperation {
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}

class MultiplicationOperation implements MathOperation {
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}

class DivisionOperation implements MathOperation {
    @Override
    public double calculate(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

public class Mathoper {
    public static void main(String[] args) {

        MathOperation addition = new AdditionOperation();
        addition.calculateAndPrint(10, 5);

        MathOperation subtraction = new SubtractionOperation();
        subtraction.calculateAndPrint(10, 5);

        MathOperation multiplication = new MultiplicationOperation();
        multiplication.calculateAndPrint(10, 5);

        MathOperation division = new DivisionOperation();
        division.calculateAndPrint(10, 5);

        System.out.println("Is 7 positive? " + MathOperation.isPositive(7));
        System.out.println("Is -3 positive? " + MathOperation.isPositive(-3));
    }
}