// practice java questions
//print the sum of First n Natural Numbers
import java.util.Scanner;

 public class Printloop{
	public static void main(String[] arg){
		System.out.println("Enter the number");
		Scanner natural = new Scanner(System.in);
		int number = natural.nextInt();
		int sum =0;
		for(int i=1;i<=number;i++){
			sum += i;
		}
		System.out.println(sum);
	}
}