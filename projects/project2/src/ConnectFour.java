import java.util.Scanner;

public class ConnectFour {
	static final int BLUE =1, RED=2;
	static int NUM_COLUMNS;
	static int NUM_IN_ROW=NUM_COLUMNS;
	static Scanner input = new Scanner(System.in);
	static int firstplayer;
	static int p1=0,p2=0,ties=0;
	static long cnt=0;

	public static void main(String[] args) {
		System.out.println("Welcome to Connect Four!");
		System.out.print("Enter 3 for 3x3 and 4 for 4x4: ");
		NUM_COLUMNS = input.nextInt();
		NUM_IN_ROW=NUM_COLUMNS;
		System.out.println();
		
		if (NUM_COLUMNS == 3) {
			for (int i=0; i<3; i++) {
				int[ ][ ] list = new int[NUM_COLUMNS][NUM_COLUMNS];
				firstplayer = BLUE;
				p1=0;p2=0;cnt=0;ties=0;
			    switch(i) {
			    case 0: list[2][0]=BLUE; break; //  1st column
			    case 1: list[2][1]=BLUE; break; //  2nd column
			    case 2: list[2][2]=BLUE; break; //  3rd column
			    
			    }
				Play(list , RED);
				System.out.println("COLUMN "+(i+1));
				System.out.println ("P1 Net Wins: " + (p1-p2));
				System.out.println("BLUE Wins:  "+p1 +" RED Wins: "+p2+ " Ties: " + ties);
				System.out.println ("Total recursive calls: " + cnt);
				System.out.println();
			}
		}else if (NUM_COLUMNS == 4) {
			for (int i=0; i<4; i++) {
				int[ ][ ] list = new int[NUM_COLUMNS][NUM_COLUMNS];
				firstplayer = BLUE;
				p1=0;p2=0;cnt=0;ties=0;
			    switch(i) {
			    case 0: list[3][0]=BLUE; break; //  1st column
			    case 1: list[3][1]=BLUE; break; //  2nd column
			    case 2: list[3][2]=BLUE; break; //  3rd column
			    case 3: list[3][3]=BLUE; break; //  4th column
			    
			    }
				Play(list , RED);
				System.out.println("COLUMN "+(i+1));
				System.out.println ("P1 Net Wins: " + (p1-p2));
				System.out.println("BLUE Wins:  "+p1 +" RED Wins: "+p2+ " Ties: " + ties);
				System.out.println ("Total recursive calls: " + cnt);
				System.out.println();
			}
		}

	}
	public static int Play(int[][] inlist, int clr) {
		cnt++;
		int res=checkBoard(inlist,clr);
		// 0 - board full, 1- RED wins  2 = BLUE wins   3-keep playing
		if (res < 3) { 
			if (res == 0) {ties++;return 0;
			} else {
				if (res == firstplayer) {p1++; return 1;} else {p2++; return -1;}
			}
		}	
		res = 0;

		// for each space that can be the next move
		//    make a copy of board (next lines)	

		//   update the board for this move
		for (int col = 0; col<NUM_COLUMNS;col++  ){
			int row = getCoords(inlist, col);
				if (row!=-1) {
								
					int[][] clonelist = new int[NUM_COLUMNS][NUM_COLUMNS];
					for (int x = 0;x <NUM_COLUMNS;x++  ){
						for (int y = 0; y<NUM_COLUMNS;y++  ){
							clonelist[x][y] = inlist[x][y] ;
						}
					}					 
					clonelist[row][col] = clr;
					Play(clonelist, 3- clr);
				
				
			}	
		}
		
		//  recursively call Play
		return res;
	}
	public static boolean isFull(int[][] inlist){
		boolean empty = true;
		for (int i = 0 ; i<NUM_COLUMNS ; i++ ) {
			for (int i2 = 0 ; i2<NUM_COLUMNS ; i2++ ) {
				if (inlist[i][i2] ==0   ) { empty = false; break;} 
			}
		}
		return empty;
	}
	public static int checkBoard(int[][] inlist ,int clr){
		int chkclr = 3-clr;
		for (int i = 0 ; i<NUM_COLUMNS; i++ ) {
			int colcnt = 0;
			for (int j=0; j<NUM_COLUMNS; j++) {
				if (inlist[i][j] == chkclr) {
					colcnt++;
					if (colcnt == NUM_IN_ROW)  { return chkclr;}	 
				}  else {
					colcnt =0;
				}
			}
		}
		for (int i = 0 ; i<NUM_COLUMNS; i++ ) {
			int colcnt = 0;
			for (int j=0; j<NUM_COLUMNS; j++) {
				if (inlist[j][i] == chkclr) {
					colcnt++;
					if (colcnt == NUM_IN_ROW)  { return chkclr;}	 
				}  else {
					colcnt =0;
				}
			}
		}
		int colcnt = 0;
		for (int i = 0 ; i<NUM_COLUMNS; i++ ) {
			if (inlist[i][i] == chkclr) {
				colcnt++;
				if (colcnt == NUM_IN_ROW)  {return chkclr;}	 
			}  else {
				colcnt =0;
			}
		}
		colcnt = 0;
		for (int i = 0 ; i<NUM_COLUMNS; i++ ) {
			if (inlist[NUM_COLUMNS-1-i][i] == chkclr) {
				colcnt++;
				if (colcnt == NUM_IN_ROW)  { return chkclr;}	 
			}  else {
				colcnt =0;
			}
		}
		if (isFull(inlist)) {  return 0; 
		} else {
			return 3;
		}


	}
	public static void printlist(int[][] inlist) {
		for (int i =0; i<inlist.length; i++) {
			for (int j =0; j<inlist.length; j++) {
				System.out.print(inlist[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static int getCoords(int[][] inlist, int col) {
		int row;
		for (int i = NUM_COLUMNS-1; i>=0; i--){
			if (inlist[i][col] == 0) {
				row = i;
				return row;
			}
		}
		row = -1;
		return row;
	}
}
