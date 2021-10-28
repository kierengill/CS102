
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	static int RomneyVotes = 0;
	static int ObamaVotes = 0;

	public static void main(String[] args) {
		// File Formats: 
		//  data/ElectoralVotes.csv :  State, Number of electoral votes
		//  data/ElectionData 2012.csv:  State, # of Obama votes, # of Romney votes
		File selectedfile = new File ("data/ElectoralVotes.csv");		
		// Confirm if the file exists -- if not, prompt error
		Scanner fileInput = null;
		try {
			fileInput = new Scanner(selectedfile);
		}
		catch (FileNotFoundException e1) {
			System.out.println("\n[ERROR]: Cannot find the electoral votes file.");
		}		
		// Scan each entry until no more exist  
		HashMap <String,Integer> map = new HashMap<String,Integer>();
		while (fileInput.hasNextLine()) {
			// Read the next line in the file
			String buffline = fileInput.nextLine();
			//System.out.println(buffline);
			// Split the line into an array
			String[] data_line = buffline.split(",");
			// Store the information  in your HashMap
			String state = data_line[0];
			int votes = Integer.valueOf(data_line[1]);
			map.put(state, votes);
		}
		selectedfile = new File ("data/ElectionData2012.csv");		
		// Confirm if the file exists -- if not, prompt error
		fileInput = null;
		try {
			fileInput = new Scanner(selectedfile);
		}
		catch (FileNotFoundException e1) {
			System.out.println("\n[ERROR]: Cannot find the electoral votes file.");
		}		
		while (fileInput.hasNextLine()) {
			// Read the next line in the file
			String buffline = fileInput.nextLine();
			//System.out.println(buffline);
			// Split the line into an array
			String[] data_line = buffline.split(",");
			// Store the information  in your HashMap
			String state = data_line[0];
			int Obama = Integer.valueOf(data_line[1]);
			int Romney = Integer.valueOf(data_line[2]);
			int winner = (Obama > Romney)? 1:0;
			if (winner == 1) {
				ObamaVotes += map.get(state);
			}else {
				RomneyVotes += map.get(state);
			}
			
		}
		// Use above logic to read each state's actual vote total
		// For each state, find out who won
		// Look up in HashMap number of electoral votes for the state
		// Award electoral votes for that state to the winning candidate
		System.out.println("Romney Votes: " + RomneyVotes);
		System.out.println("Obama Votes: " + ObamaVotes);
		

	}

}
