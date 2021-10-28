package project1;
import java.util.*;
import java.io.*;
import net.datastructures.SinglyLinkedList;

//Code by: KIEREN SINGH GILL

public class PartA {
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter processes: ");
		String myProcess = input.nextLine();
		//Read the input, split it by commas and store it in the dirtyWords array
		//Processes are "dirty" because we only really care about A,B,C
		String[] dirtyWords = myProcess.split(";");
		String[] cleanWords = new String[dirtyWords.length];
		int i = 0;	
		//Cleaning process
		for (i=0; i<dirtyWords.length; i++){
		     String clean = dirtyWords[i].substring(dirtyWords[i].indexOf("(")+1, dirtyWords[i].indexOf(")"));
		     cleanWords[i] = clean;
		}
		//Create SinglyLinkedList and add cleanWords
		SinglyLinkedList<String> myList = new SinglyLinkedList <>();	
		for (i=0; i<cleanWords.length; i++){
			myList.addLast(cleanWords[i]);
		} 
		int cycles = 0;
		while (!(myList.isEmpty())){
			String [] first = (myList.first()).split(",");
			myList.removeFirst();
			int counter = 0;	
			if (!(myList.isEmpty())) {
				String [] temp = (myList.first()).split(",");
				for (i=0; i<first.length; i++){
					if (Arrays.asList(temp).contains(first[i])){
						counter++;
						break;
					}
				}
				//If none of the letters are found in previous 
				if (counter == 0) {
					String [] newArray = new String[3];
					for (i=0; i<first.length; i++){
						newArray[i] = first[i];
					}
					for (i=first.length; i <((first.length) + (temp.length)); i++) {
						newArray[i] = temp[i-(first.length)];
					}
					myList.removeFirst();
					if (myList.first() != null) {
						first = (myList.first()).split(",");
					}					
					int counter2 = 0;
					for (i=0; i<first.length; i++){
						if (Arrays.asList(newArray).contains(first[i])){
							counter2++;
							break;
						}
					}
					if (counter2 == 0) {
						myList.removeFirst();
					}		
				//END OF IF STATEMENT
				}					
			//END OF IF STATEMENT	
			} 
		cycles++;
		//END OF WHILE LOOP	
		}	
		System.out.println("Number of Cycles: " + cycles);
		}		
}