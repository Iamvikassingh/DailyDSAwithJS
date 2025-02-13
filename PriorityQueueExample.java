import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
//		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Comparator.reverseOrder());
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.offer(12);
		queue.offer(72);
		queue.offer(34);
		queue.offer(64);
		queue.offer(4); // by default find minimum heap
		queue.offer(8); // it will automatically create a hiipy fiiy method
		
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		System.out.println(queue.peek()+ " -> peek value");

	}

}
