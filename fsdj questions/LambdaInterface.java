@FunctionalInterface
interface Operation {
    int M1(int x, int y);
}

@FunctionalInterface
interface Check {
    String M2(int x);
}

@FunctionalInterface
interface MathOperationSquar {
    int operation(int a);
}

@FunctionalInterface
interface MaxOperationMAX {
    int max(int a, int b);
}

@FunctionalInterface
interface StringJoiner {
    String join(String a, String b);
}

@FunctionalInterface
interface DivisibilityCheck {
    boolean isDivisible(int a);
}



public abstract class LambdaInterface {
    public static void main(String... arg) {

        Operation add = Integer::sum;
        Operation sub = (x, y) -> x - y;
        Operation mul = (x, y) -> x * y;
        Check evenOdd = (x) -> (x % 2 == 0)?"Even":"Odd";
        MathOperationSquar square = (a) -> a * a;
        MaxOperationMAX maximum = (a, b) -> (a > b) ? a : b;
        StringJoiner joinStrings = (a, b) -> a + b;
        DivisibilityCheck isDivBy3 = (a) -> a % 3 == 0;

        System.out.println("Addition = " + add.M1(4, 5));
        System.out.println("Subtraction = " + sub.M1(9, 5));
        System.out.println("Multiplication = " + mul.M1(4, 5));
        System.out.println("EvenOdd : "+ evenOdd.M2(4));
        System.out.println("Square of 5: " + square.operation(5));
        System.out.println("Maximum of 10 and 20: " + maximum.max(10, 20));
        System.out.println("Joined string: " + joinStrings.join("Hello ", "World"));
        System.out.println("Is 9 divisible by 3? " + isDivBy3.isDivisible(9));
    }
}
