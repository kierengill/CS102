import java.util.*;

public class Main {
	
	static Random rnd = new Random();

	public static void main(String args[]) {
		
		int[] keys = new int[100];
		int[] values = new int[100];
		
		for (int j=0; j<keys.length; j++) {
			int k = rnd.nextInt(1000)+1;
			keys[j] = k;
			values[j] = k;
		}
		System.out.print("Array Contents: [");
		for (int l=0; l<keys.length; l++) {
			if (l!=99) {System.out.print(keys[l]+",");}
			else {System.out.print(keys[l]);};
		}
		System.out.print("]");
		System.out.println();
		
		HeapPriorityQueue<Integer, Integer> HeapQueue = new HeapPriorityQueue();
		
		for (int i=0; i<keys.length; i++) {
			HeapQueue.insert(keys[i], values[i]);
		}
		
		for (int i=0; i<keys.length; i++) {
			System.out.println(HeapQueue.removeMin().getKey());
			System.out.println("Upheap: " + HeapQueue.upheapnum + " DownHeap: " + HeapQueue.downheapnum);
		}
		
	}
}
