
import java.util.Scanner;



public class Inputin {

    public static void main(String[] arg) {
        Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Enter your address:");
        String address = sc.nextLine();
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    
    }
}
