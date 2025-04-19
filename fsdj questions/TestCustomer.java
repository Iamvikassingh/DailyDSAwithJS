import java.util.Scanner;


class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}



class Customer {
    private String custNo;
    private String custName;
    private String category;

    public Customer(String custNo, String custName, String category) throws InvalidInputException {
        if (!custNo.toLowerCase().startsWith("c")) {
            throw new InvalidInputException("Customer number must start with 'C' or 'c'");
        }

        if (custName.length() < 4) {
            throw new InvalidInputException("Customer name must be at least 4 characters long");
        }

        if (!(category.equalsIgnoreCase("Platinum") || category.equalsIgnoreCase("Gold") || category.equalsIgnoreCase("Silver"))) {
            throw new InvalidInputException("Category must be either 'Platinum', 'Gold', or 'Silver'");
        }

        this.custNo = custNo;
        this.custName = custName;
        this.category = category;
    }

    public String getCustNo() {
        return custNo;
    }

    public String getCustName() {
        return custName;
    }

    public String getCategory() {
        return category;
    }
}


public class TestCustomer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter customer number: ");
            String custNo = scanner.nextLine();

            System.out.print("Enter customer name: ");
            String custName = scanner.nextLine();

            System.out.print("Enter customer category (Platinum/Gold/Silver): ");
            String category = scanner.nextLine();

            Customer customer = new Customer(custNo, custName, category);

            System.out.println("\nCustomer Details:");
            System.out.println("Customer Number: " + customer.getCustNo());
            System.out.println("Customer Name: " + customer.getCustName());
            System.out.println("Customer Category: " + customer.getCategory());

        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}

