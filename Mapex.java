import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapex {

	public static void main(String[] args) {
//		HashMap <String,Integer> map = new HashMap<String, Integer>();
//		LinkedHashMap <String,Integer> map = new LinkedHashMap<String, Integer>();
		TreeMap <String,Integer> map = new TreeMap<String, Integer>(Comparator.reverseOrder());
		map.put("One", 1);
		map.put("Three", 3);
		map.put("Eight", 8);
		map.put("Four", 4);
		map.put("Nine", 9);
		map.put("Nine", 19);
		
		System.out.println(map);
		System.out.println(map.containsKey("Ten"));
		System.out.println(map.containsValue(9));
		map.remove("Three");
		System.out.println(map);
		
		for(String key:map.keySet()) {
			System.out.print(key + " ");
		}
		
		System.out.println();
		
		for(Integer key:map.values()) {
			System.out.print(key + " ");
		}
		

	}

}
