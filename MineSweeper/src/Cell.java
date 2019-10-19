/**	
 * @author Trevor Little
 * @version 2/1/19
 * MineSweeper Project
 * This is the Cell class that defines what it means to be a cell. Each method changes the 
content of ONE cell, and the Gameboard class takes care of all of the cells respectively.
*/

public class Cell {
	
	
	public Cell() {
		
	}
	
	
	
	private boolean isThereAMine= false;
	private char character= '-';
	
	private int numberOfBombsAround= 0;
		

	/**
	 * 
	 * @param numberOfBombsAround changes the amount of bombs if the game detects an adjacent bomb
	 */
	public void SetNumberOfBombsAround(int numberOfBombsAround) {
		this.numberOfBombsAround = numberOfBombsAround;
	}
	
	/**
	 * 
	 * @return an integer for the amount of bombs adjacent to the cell being input
	 */
	public int GetNumberOfBombsAround() {
		return numberOfBombsAround;
	}
	/**
	 * 
	 * @param character allows the output to change based on Gameboard input
	 */
	
	public void SetCharacter(char character) {
		this.character = character;
	}

	/**
	 * 
	 * @return character that is based on the user input and logic of the game
	 */
	
	public char GetCharacter() {
		return character;
	}

		
	/**
	* Makes the bombs and makes sure that that they are distinctly placed (no repeats)
	* @return true/false statement checks whether or not a bomb is already in a spot when being generated.
	*/
	public int makeBomb() {
		
		int checkBomb= 0;
			
		if(isThereAMine== true) {
			return checkBomb;
		}else{
		checkBomb++;
		isThereAMine= true;		
		}
		return checkBomb;
		}
		
	/**
	* Changes character from the default value to 'M' to mark bomb placement
	* @return character M if a random spot was picked as a bomb
	*/
	public char MarkAsaBomb() {
		character= 'M';
		return character;
	}
		
	/**
	* Checks whether or not there is indeed a bomb at a position or not
	*@return whether or not a mine is there or not
	*/
	public boolean BombQueue() {
		if(isThereAMine== true) {
			return true;
		}
			
		return isThereAMine;
			
	}
		
	/**		
	*Sets the character to the number of mines adjacent to a cell
	*/
	public void setNumber() {
		switch(numberOfBombsAround) {
			case 0: character= '0';
				break;
			case 1: character= '1';
				break;
			case 2: character= '2';
				break;
			case 3: character= '3';
				break;
			case 4: character= '4';
				break;
			case 5: character= '5';
				break;
			case 6: character= '6';
				break;
			case 7: character= '7';
				break;
			case 8: character= '8';
				break;
			default: character= '9';
				break;
			
		}
	}
		
		
		
		
		
		
	
	
	
	
	

}


