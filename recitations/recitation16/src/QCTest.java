import java.util.Random;

public class QCTest {
	public static void main(String[] args) {
 /* 1)  Change Attached Code to select the pivot as below the right most element.
	� � a) the left most element
	� � b) a random number between 1 and 100
	� � c) the middle element
	For each pivot selection , print out the number of comparisons that are needed
 */
// some starter code	
final int ARRAYLENGTH=10;
		Random r = new Random();
		//Running 100 sorts per type
		for (int j=0; j<100; j ++) {
			int[]  numbers = new int[ARRAYLENGTH];
			int[] numbers2 = new int[ARRAYLENGTH];
			int[] numbers3 = new int[ARRAYLENGTH];
			for (int i = 0; i<numbers.length;i++){	
			int x = r.nextInt(99)+1;
			numbers[i]= x;
			numbers2[i]= x;
			numbers3[i]= x;
			}    //numbers from 1 to 99
			//PrintArray(numbers);
			//System.out.println();
		
			IntegerComp ic = new IntegerComp();
			QuickSort.quickSortInPlace(numbers, ic);
			LeftQuickSort.quickSortInPlace(numbers2, ic);
			MiddleQuickSort.quickSortInPlace(numbers3, ic);
		}
		/*
		PrintArray(numbers);
		PrintArray(numbers2);
		PrintArray(numbers3);
		*/
		//Printing total number of comparisons needed per type after 100 sorts
		System.out.println("Total number of comparisons needed per type after 100 sorts");
		System.out.println("Right QuickSort: " + QuickSort.comparisons);
		System.out.println("Left QuickSort: " + LeftQuickSort.comparisons);
		System.out.println("Middle QuickSort: " + MiddleQuickSort.comparisons);
	}
	public static void PrintArray(int inarray[]) {
  	  System.out.println();
  	  for (int i = 0; i<inarray.length;i++){	
			System.out.print(inarray[i]);
			System.out.print(" ");
	}
	}
}
