import java.util.*;

public class Driver {
	
	static Random rnd = new Random();
	
	public static void main(String[] args) {		
       int total = 0;
       int height = 0;
       double counter = 0.0;
       for (int j = 0; j<10 ; j++) {
    	   String Letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
           String toReturn = "";
	       MyTreeMap<String, Integer>  t = new MyTreeMap() ;
	       for (int i = 26; i>0 ; i--) {
	    	   int x = rnd.nextInt(i);
	    	   char c = Letters.charAt(x);
	    	   int a = (int) c - 64;
	    	   String s = String.valueOf(c);
	    	   t.put(s,a);
	    	   
	    	   toReturn += c;
	    	   Letters = Letters.replace(s, "");
	    	   
	       }
	       height = t.getHeight();
	       total += height;
	       System.out.println(toReturn);
	       System.out.println(height);
	       System.out.println("Search Depth of A: "+ t.searchDepth("A"));
	       System.out.println("Search Depth of B: "+ t.searchDepth("B"));
	       System.out.println("Search Depth of C: "+ t.searchDepth("C"));
	       System.out.println();
	       counter++;
	       
	       
	       
	       
       }
       double average = total/counter;
       System.out.println("Total Height: " + total);
       System.out.println("Average: " + average);

	}
	
}
