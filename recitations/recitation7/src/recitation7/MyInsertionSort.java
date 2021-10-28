package recitation7;

import net.datastructures.Position;
import net.datastructures.PositionalList;
import net.datastructures.LinkedPositionalList;

public class MyInsertionSort { 
	
	  /** Insertion-sort of a positional list of integers into nondecreasing order */
	  public static int insertionSort(PositionalList<Integer> list) {
		int distance = 0;
	    Position<Integer> marker = list.first();         // last position known to be sorted
	    while (marker != list.last()) {
	      Position<Integer> pivot = list.after(marker);
	      int value = pivot.getElement();                // number to be placed
	      if (value > marker.getElement())               // pivot is already sorted
	        marker = pivot;
	      else {                                         // must relocate pivot
	        Position<Integer> walk = marker;             // find leftmost item greater than value
	        distance++;
	        while (walk != list.first() && list.before(walk).getElement() > value) {
	          walk = list.before(walk);
	          distance++;
	        }
	        list.remove(pivot);                          // remove pivot entry and
	        list.addBefore(walk, value);                 // reinsert value in front of walk
	      }
	    }
	    return distance;
	  }

}
