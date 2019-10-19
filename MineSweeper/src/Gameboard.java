/**
 * @author Trevor Little
 * @version 2/1/19
 * MineSweeper Project
 * This is the Gameboard class that sets up the board and does most of the logic.
*/
import java.util.Random;
import java.util.Scanner;

public class Gameboard {
	
	private final int amountOfMines= 10;
	
	private Cell[][]board= new Cell[10][10];

	private int row;

	private int column;


	
	public Gameboard() {
		
	}
	
	
	private void setBombs() {
		Random ran= new Random();
		int x= ran.nextInt(8-1)+1;
		int y= ran.nextInt(8-1)+1;
		
		int BombCount= 0;
			while(BombCount < amountOfMines) {
				BombCount+= board[x][y].makeBomb();
				x= ran.nextInt(8-1)+1;
				y= ran.nextInt(8-1)+1;
			}
				
		
	}
	
	/**
	 *Reveals the number of bombs around current position, and update the cell's numberOfBombsAround. 
	 *@param x gets integer for x coordinate
	 *@param y gets integer for y coordinate
	 */
	public void NumberOfBombsAround(int x, int y){
		for(int i= x-1; i<=x+1; i++ ) {
			for(int j= y-1; j<=y+1; j++) {
					if(board[i][j].BombQueue()== true) {
						board[x][y].SetNumberOfBombsAround(board[x][y].GetNumberOfBombsAround()+1);
						board[x][y].GetNumberOfBombsAround();
					}
			
			}
		}
		board[x][y].setNumber();
		
		
		
		
	}
	
	
	private void revealBombs() {
		for(int i= 0; i< board.length; i++) {
			for(int j= 0; j< board[i].length; j++) {
					if(board[i][j].BombQueue()== true) {
						board[i][j].MarkAsaBomb();	
					}
				
			}
		}
			
		
	}
		
		
	
	/**
	 *Makes the board, sets the bombs, and sets the questions prompted to user, with
	 	functions for each instance. This will loop for every turn or on a restart.
	 */
	public void Run() {
		
		Scanner in= new Scanner (System.in);
		
			for(int i= 0; i< board.length; i++) {
				for(int j= 0; j < board[i].length; j++) {
					board[i][j]= new Cell();
					
				}
			
			}
			this.setBombs();
			while(true) {
				for(int i= 1; i< board.length-1; i++) {
					for(int j= 1; j < board[i].length-1; j++) {
						System.out.print(board[i][j].GetCharacter() + " ");
					}
						System.out.println();
						
				}
				
			
			System.out.println();
			
			
			System.out.println("Row:");
				row = in.nextInt();
				row++;
			System.out.println("Column:");
				column = in.nextInt();
				column++;
				
			System.out.println("Do you think there is a mine at this location?");
				String isThereABomb= in.next();
					if(isThereABomb.equalsIgnoreCase("Yes") || isThereABomb.equalsIgnoreCase("Y")) {
						if(board[row][column].BombQueue()) {
							board[row][column].MarkAsaBomb();
							
						}else {
							System.out.println("You guessed a place that was not a mine. YOU LOST!");					
							for(int i= 0; i< board.length; i++) {
								for(int j= 0; j < board[i].length; j++) {
									board[i][j]= new Cell();
									
								}
							
							}
							this.setBombs();
						}
					}else{
						if(board[row][column].BombQueue()) {
							System.out.println("You landed on a mine. YOU LOST!");
							for(int i= 0; i< board.length; i++) {
								for(int j= 0; j < board[i].length; j++) {
									board[i][j]= new Cell();
									
								}
							
							}
							this.setBombs();
						}else {
							this.NumberOfBombsAround(row, column);
						}
					}
					
			System.out.println("Would you like to take a peek?");
				String peek= in.next();
					if(peek.equalsIgnoreCase("Yes") || peek.equalsIgnoreCase("Y") ) {
						this.revealBombs();
					}
		
			System.out.println("Would you like to restart?");
			String clearBoard= in.next();
				if(clearBoard.equalsIgnoreCase("yes") || clearBoard.equalsIgnoreCase("Y")) {
						 for(int i= 1; i< board.length-1; i++) {
								for(int j= 1; j < board[i].length-1; j++) {
									
										board[i][j]= new Cell();
								}
									
						 }		
						 this.setBombs();
				}
		
			
			
			}
			
	}
	
}
