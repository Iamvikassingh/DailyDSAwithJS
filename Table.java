// print the table of a number input by the user.
import java.util.*;
class Table{
	public static void main (String... arg) {
		System.out.println("Enter the number ");
		Scanner table = new java.util.Scanner(System.in);
		int number = table.nextInt();
		
		for(int i=1;i<=10;i++){
			System.out.println(number + "*" + i + "=" + number*i);
		}
	}
}