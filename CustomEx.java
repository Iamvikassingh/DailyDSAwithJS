import java.util.ArrayList;
import java.util.Collections;

public class CustomEx {

	public static void main(String[] args) {
		ArrayList<Student>  Students = new ArrayList<Student>();
		Students.add(new Student("Rahul kumar" , 1 , "MCA"));
		Students.add(new Student("Tushar kumar" , 2 , "MCA"));
		Students.add(new Student("Vikas Singh" , 3 , "MCA"));
		Students.add(new Student("Vaibhav Singh" , 4 , "MCA"));
		Students.add(new Student("Yashvi Chaudhary " , 5 , "MCA"));
		
		
		for(Student student : Students) {
			System.out.println(student);
		}
	}
}

class Student {
	private String name;
	private int roll_no;
	private String course;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + ", course=" + course + "]";
	}
	
	public Student(String name, int roll_no, String course) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.course = course;
	}
	
	
}
