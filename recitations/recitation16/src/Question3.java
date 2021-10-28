public class Question3 {
	public static void main(String[] args) {
		// 3) Generate a series of numbers that cause a n squared 
		// number of comparisons, the QuickSort worst case.
		
		// 3 cases:
		// 1) Array is already sorted in same order.
		final int ARRAYLENGTH=1000;
		int[]  numbers = new int[ARRAYLENGTH];
		for (int i = 0; i<numbers.length;i++){	
			numbers[i]= i;
			}
		PrintArray(numbers);
		System.out.println();	
		IntegerComp ic = new IntegerComp();
		LeftQuickSort.quickSortInPlace(numbers, ic);
		int case1 = LeftQuickSort.comparisons;
		System.out.println("Total comparisons for worst case 1: " + case1);
		
		// 2) Array is already sorted in reverse order.
		
		numbers = new int[ARRAYLENGTH];
		for (int i = 0; i<numbers.length;i++){	
			numbers[i]= 999-i;
			}
		PrintArray(numbers);
		System.out.println();	
		LeftQuickSort.quickSortInPlace(numbers, ic);
		int case2 = LeftQuickSort.comparisons - case1;
		System.out.println("Total comparisons for worst case 2: " + case2);
		
		// 3) All elements are the same (special case of case 1 and 2)
		numbers = new int[ARRAYLENGTH];
		for (int i = 0; i<numbers.length;i++){	
			numbers[i]= 1;
			}
		PrintArray(numbers);
		System.out.println();	
		LeftQuickSort.quickSortInPlace(numbers, ic);
		int case3 = LeftQuickSort.comparisons - case1 - case2;
		System.out.println("Total comparisons for worst case 3: " + case3);
		
		}
	
		public static void PrintArray(int inarray[]) {
	  	  System.out.println();
	  	  for (int i = 0; i<inarray.length;i++){	
				System.out.print(inarray[i]);
				System.out.print(" ");
		}
		}
}
