import java.util.Scanner;

class ageException extends Exception {
    public ageException(String message) {
        super(message);
    }
}


class throw2 {
    public void testAge(int age) throws ageException {
        if (age < 18) {
            
                throw new ageException("You are under age you are minor");
            
        } else {
            System.out.println("You are major");
        }
    }
}


public class Usethrow{
    public static void main(String... arg) {
        Scanner sc = new Scanner(System.in);
        throw2 d = new throw2();
        int age = sc.nextInt();
        try {
            d.testAge(age);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}