package recitation7;
import java.util.*;
import java.io.*;
import net.datastructures.Position;
import net.datastructures.LinkedPositionalList;
import net.datastructures.PositionalList;

public class Driver {
	  static Random rnd = new Random();
	  
	  
	  public static void main(String[] args) {
		  int totalDistance = 0;
		  int min = Integer.MAX_VALUE;
		  int max = 0;
		  int listLimit = 1000;
		  int counter = 0;
		  MyInsertionSort IS = new MyInsertionSort();
		  while (counter < listLimit) {
		  	PositionalList<Integer> myList = generateRandomList();
		  	System.out.println("Before: " + myList);
		  	int distance = IS.insertionSort(myList);
		  	System.out.println("After:  " + myList);
		    System.out.println("Distance: " + distance);
		    System.out.println();
		    counter++;
		    totalDistance += distance;
		    if(distance < min) {
		    	min = distance;
		    }else if(distance > max) {
		    	max = distance;
		    }
		    
		  }
		  double averageDistance = Double.valueOf(totalDistance)/listLimit;
		  System.out.println("Average Distance: " + averageDistance);
		  System.out.println("Minimum Distance: " + min);
		  System.out.println("Maximum Distance: " + max);
		  System.out.println();
		  }
	  

	  public static PositionalList<Integer> generateRandomList() {
		  PositionalList<Integer> data = new LinkedPositionalList<>();
		  
		  for (int i = 0; i < 7; i++) {
			    data.addLast((rnd.nextInt(13)) + 1);
			}
		  
		  return data;
	  }
	
	
}
