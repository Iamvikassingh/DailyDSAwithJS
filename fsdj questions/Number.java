class Number {
    private double value;

    // Constructor to initialize value
    public Number(double value) {
        this.value = value;
    }

    // Method to check if the number is zero
    public boolean isZero() {
        return value == 0;
    }

    // Method to check if the number is positive
    public boolean isPositive() {
        return value > 0;
    }

    // Method to check if the number is negative
    public boolean isNegative() {
        return value < 0;
    }

    // Method to check if the number is even
    public boolean isEven() {
        return (int) value % 2 == 0;
    }

    // Method to check if the number is odd
    public boolean isOdd() {
        return (int) value % 2 != 0;
    }

    // Method to check if the number is prime
    public boolean isPrime() {
        if (value < 2 || value != (int) value) return false;
        int num = (int) value;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to check if the number is an Armstrong number
    public boolean isArmstrong() {
        if (value < 0 || value != (int) value) return false;
        int num = (int) value, sum = 0, temp = num, digits = 0;

        // Count digits
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == num;
    }

    // Method to display results
    public void displayResults() {
        System.out.println("Number: " + value);
        System.out.println("Is Zero? " + isZero());
        System.out.println("Is Positive? " + isPositive());
        System.out.println("Is Negative? " + isNegative());
        System.out.println("Is Even? " + isEven());
        System.out.println("Is Odd? " + isOdd());
        System.out.println("Is Prime? " + isPrime());
        System.out.println("Is Armstrong? " + isArmstrong());
    }

    // Main method to test the class
    public static void main(String[] args) {
        Number num1 = new Number(153);  // Armstrong number
        Number num2 = new Number(-7);
        Number num3 = new Number(11);   // Prime number

        num1.displayResults();
        System.out.println();
        num2.displayResults();
        System.out.println();
        num3.displayResults();
    }
}
