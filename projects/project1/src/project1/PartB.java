package project1;
import java.util.*;
import java.io.*;
import net.datastructures.SinglyLinkedList;

//Code by: KIEREN SINGH GILL

public class PartB {
	
	static int processNumber = 0;
	static Random rnd = new Random();
	
	public static void main(String[] args) {
		int i;
		SinglyLinkedList<String> myList = new SinglyLinkedList <>();	
		for (i=0; i<20; i++){
			myList.addLast(generateRandomProcess());
		} 
		System.out.println("Starting list of processes: " + myList.toString());
		int cycles = 0;
		while ((!(myList.isEmpty())) | (cycles >= 1000)){
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
		if (myList.size() !=0) {
			myList.addLast(generateRandomProcess());
		}
		if (cycles%100 == 0) {
			System.out.println("Length of processes at cycle " + cycles + " : " + myList.size());
		}
		//END OF WHILE LOOP	
		}
		
		if (myList.isEmpty()) {
			System.out.println("List emptied, it took " + cycles + " cycles!");
		}else {
			System.out.println("Length of processes after " + cycles + " cycles: " + myList.size());
		}		
	}
	public static String generateRandomProcess() {
		int numberOfResources = (int) (Math.random()*3 +1) ;
		int i;
		String[] resources = new String[numberOfResources];
		for (i=0; i<numberOfResources; i++) {
			if (i == 0) {
				resources[i]= String.valueOf((char)('A' + rnd.nextInt(3)));
			}else if (i == 1){
				resources[i]= String.valueOf((char)('A' + rnd.nextInt(3)));
				while (resources[i].equals(resources[0])) {
					resources[i]= String.valueOf((char)('A' + rnd.nextInt(3)));
				}
			}else {
				resources[i]= String.valueOf((char)('A' + rnd.nextInt(3)));
				while ((resources[i].equals(resources[0])) | (resources[i].equals(resources[1]))) {
					resources[i]= String.valueOf((char)('A' + rnd.nextInt(3)));
				}
			}
		}
		String toReturn = "";
		for (i=0; i<numberOfResources; i++) {
			if (i == numberOfResources - 1) {
				toReturn += resources[i];
			}else {
				toReturn += resources[i];
				toReturn += ",";
			}
		}
		processNumber++;
	return toReturn; 
	}	
}
