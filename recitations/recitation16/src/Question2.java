import java.util.Random;

public class Question2 {
	public static void main(String[] args) {
		// 2) Run 100 sorts of 1000 randomly chosen numbers from 1 to 100. 
		// For each test, determine the number of comparisons. 
		// Output the minimum, maximum and average of this number across the 100 sorts.
		int max = -1;
		int min = -1;
		int prev = 0;
		int turn = 0;
		int counter = 0;
		final int ARRAYLENGTH=1000;
			Random r = new Random();
			//Running 100 sorts per type
			for (int j=0; j<100; j ++) {
				int[]  numbers = new int[ARRAYLENGTH];
				for (int i = 0; i<numbers.length;i++){	
				numbers[i]= r.nextInt(99)+1;
				}
				//PrintArray(numbers);
				//System.out.println();	
				IntegerComp ic = new IntegerComp();
				LeftQuickSort.quickSortInPlace(numbers, ic);
				counter++;
				
				turn = LeftQuickSort.comparisons - prev;
				prev = LeftQuickSort.comparisons;
				if (max == -1) {max = turn;}
				if (min == -1) {min = turn;}
				if (turn > max) {max = turn;}
				if (turn < min) {min = turn;}
				
			}
			int average = LeftQuickSort.comparisons/counter;
			System.out.println("Total comparisons: " + LeftQuickSort.comparisons);
			System.out.println("Minimum: " + min);
			System.out.println("Maximum: " + max);
			System.out.println("Average: " + average);
			}
	
			public static void PrintArray(int inarray[]) {
		  	  System.out.println();
		  	  for (int i = 0; i<inarray.length;i++){	
					System.out.print(inarray[i]);
					System.out.print(" ");
			}
			}
}
