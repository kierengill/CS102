import java.util.Comparator;

public class MiddleQuickSort {
	static int comparisons;
	
	  //-------- support for in-place quick-sort of an array --------
	  /** Quick-sort contents of a queue. */
	  public static  void quickSortInPlace(int[] S,  Comparator<Integer> comp) {
	    quickSortInPlace(S, comp, 0, S.length-1);
	  }

	  /** Sort the subarray S[a..b] inclusive. */
	  private static void quickSortInPlace(int[] S, Comparator<Integer> comp, int a, int b) {
	    if (a >= b) return;                // subarray is trivially sorted
	    int left = a+1;
	    int right = b;    
	    int pivot;
	    int temp; 
	    if (b-a<=2) {pivot = S[0];} 
	    else {pivot = S[(b-a+1)/2]; temp = S[0]; S[0] = pivot; S[(b-a+1)/2] = temp;}
	        
	    while (left <= right) {
	      // scan until reaching value equal or larger than pivot (or right marker)
	      while (left <= right && comp.compare(S[left], pivot) < 0) left++; comparisons++;
	      // scan until reaching value equal or smaller than pivot (or left marker)
	      while (left <= right && comp.compare(S[right], pivot) > 0) right--; comparisons++;
	      if (left <= right) {             // indices did not strictly cross
	        // so swap values and shrink range
	        temp = S[left]; S[left] = S[right]; S[right] = temp;
	        left++; right--;
	      }
	    }
	    // put pivot into its final place (currently marked by right index)
	    temp = S[right]; S[right] = S[a]; S[a] = temp;
	    // make recursive calls
	    quickSortInPlace(S, comp, a, right - 1);
	    quickSortInPlace(S, comp, right + 1, b);
	    
	  }
	  
}
