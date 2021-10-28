import java.util.*;
import java.time.Duration;
import java.time.Instant;

public class Driver {
	
	static Random rnd = new Random();
	
	static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         } 
	}
	
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    } 
	
	public static void main(String args[]) {
		
		int[] keys = new int[100000];
		
		for (int j=0; j<keys.length; j++) {
			int k = rnd.nextInt(100000)+1;
			keys[j] = k;
		}
		
		
		//copy keys array
		int b[] = new int[keys.length];		 
        for (int i = 0; i < keys.length; i++)
            b[i] = keys[i];
		
		Instant start = Instant.now();
		Arrays.sort(b);
		Instant end = Instant.now();
		
		Duration timeElapsed = Duration.between(start, end);
		System.out.println("ArraySort Method: "+ timeElapsed.toMillis() +" milliseconds");
		
		
		//copy keys array
		Integer e[] = new Integer[keys.length];		 
		for (int i = 0; i < keys.length; i++)
		    e[i] = keys[i];
		
        Comp mycomp = new Comp();
        start = Instant.now();
		MergeSort.mergeSort(e, mycomp);
		end = Instant.now();
		
		timeElapsed = Duration.between(start, end);
		System.out.println("MergeSort Method: "+ timeElapsed.toMillis() +" milliseconds");
		
		
		//copy keys array
		int c[] = new int[keys.length];		 
        for (int i = 0; i < keys.length; i++)
            c[i] = keys[i];
		
		start = Instant.now();
		bubbleSort(c);
		end = Instant.now();
		
		timeElapsed = Duration.between(start, end);
		System.out.println("BubbleSort Method: "+ timeElapsed.toMillis() +" milliseconds");
		
		
		//copy keys array
		int d[] = new int[keys.length];		 
        for (int i = 0; i < keys.length; i++)
            d[i] = keys[i];
		
        start = Instant.now();
		selectionSort(d);
		end = Instant.now();
		
		timeElapsed = Duration.between(start, end);
		System.out.println("SelectionSort Method: "+ timeElapsed.toMillis() +" milliseconds");

		System.out.println();
		System.out.println("Now, let's populate the array with the first 10,000 elements from 1 to 100,000, the next 10,000 from 100,000 to 200,000, and so on!");
		System.out.println();

		int[] values = new int[100000];
		
		for (int j=0; j<keys.length; j++) {
			if (j>=0 && j>10000) {int l = rnd.nextInt(100000)+1; values[j] = l;}
			if (j>=10000 && j>20000) {int l = rnd.nextInt(100000)+100001; values[j] = l;}
			if (j>=20000 && j>30000) {int l = rnd.nextInt(100000)+200001; values[j] = l;}
			if (j>=30000 && j>40000) {int l = rnd.nextInt(100000)+300001; values[j] = l;}
			if (j>=40000 && j>50000) {int l = rnd.nextInt(100000)+400001; values[j] = l;}
			if (j>=50000 && j>60000) {int l = rnd.nextInt(100000)+500001; values[j] = l;}
			if (j>=60000 && j>70000) {int l = rnd.nextInt(100000)+600001; values[j] = l;}
			if (j>=70000 && j>80000) {int l = rnd.nextInt(100000)+700001; values[j] = l;}
			if (j>=80000 && j>90000) {int l = rnd.nextInt(100000)+800001; values[j] = l;}
			if (j>=90000 && j>100000) {int l = rnd.nextInt(100000)+900001; values[j] = l;}	
		}
		
		//copy keys array
		int b1[] = new int[keys.length];		 
        for (int i = 0; i < keys.length; i++)
            b1[i] = values[i];
		
		start = Instant.now();
		Arrays.sort(b1);
		end = Instant.now();
		
		timeElapsed = Duration.between(start, end);
		System.out.println("ArraySort Method: "+ timeElapsed.toMillis() +" milliseconds");
		
		
		//copy keys array
		Integer e1[] = new Integer[keys.length];		 
		for (int i = 0; i < keys.length; i++)
		    e1[i] = values[i];
		
        mycomp = new Comp();
        start = Instant.now();
		MergeSort.mergeSort(e1, mycomp);
		end = Instant.now();
		
		timeElapsed = Duration.between(start, end);
		System.out.println("MergeSort Method: "+ timeElapsed.toMillis() +" milliseconds");
		
		
		//copy keys array
		int c1[] = new int[keys.length];		 
        for (int i = 0; i < keys.length; i++)
            c1[i] = values[i];
		
		start = Instant.now();
		bubbleSort(c1);
		end = Instant.now();
		
		timeElapsed = Duration.between(start, end);
		System.out.println("BubbleSort Method: "+ timeElapsed.toMillis() +" milliseconds");
		
		
		//copy keys array
		int d1[] = new int[keys.length];		 
        for (int i = 0; i < keys.length; i++)
            d1[i] = values[i];
		
        start = Instant.now();
		selectionSort(d1);
		end = Instant.now();
		
		timeElapsed = Duration.between(start, end);
		System.out.println("SelectionSort Method: "+ timeElapsed.toMillis() +" milliseconds");

	}
}
