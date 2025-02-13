
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Setex {
	public static void main(String[] args) {
		Integer data[]= {12,11,11,3,3,5,6};
//		HashSet <Integer> set = new HashSet<Integer>();
		TreeSet <Integer> set = new TreeSet<Integer>();
		set.add(12);
		set.add(45);
		set.add(78);
		set.add(34);
		set.add(87);
		set.add(12);
		set.addAll(List.of(data));
		System.out.println(set);
		
		for(int i=0; i<set.size(); i++) {
			System.out.print(set.getFirst()+" ");
		}
		
		System.out.println();
		
		
		for(Integer v:set) {
			System.out.print(v+" ");
		}
		System.out.println();
		
		
	}
}
