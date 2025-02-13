import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> name = new Stack<String>();
		name.push("vikas singh");
		name.push("vaibhav singh");
		name.push("Tushar kumar");
		name.push("Yashvi chaudhary");
		
		System.out.println(name);
		System.out.println(name.peek());
		name.pop();
		System.out.println(name);
	}

}
