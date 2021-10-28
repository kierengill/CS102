import java.util.Random;

public class Driver {
	
	static Random rnd = new Random();
	
	public static void main(String[] args) {		

    	   String Letters = "DHGLKJCF";
	       MyTreeMap<String, Integer>  t = new MyTreeMap() ;
	       for (int i = 7; i>=0 ; i--) {
	    	   char c = Letters.charAt(i);
	    	   int a = (int) c - 64;
	    	   String s = String.valueOf(c);
	    	   t.put(s,a);
	    	   
	    	   Letters = Letters.replace(s, "");	    	   
	       }     
	       t.dump();
	       System.out.println(t.remove("J"));
	       System.out.println();
	       t.dump();
	       
		}
	
	
};
