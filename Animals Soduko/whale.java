package animalSoduko;

public class whale extends fish {

	/*public whale(int age, String gender) {
		super(age, gender);
	}// constructor*/
	
	public String toString() {
		return "whale";
	}//toString

	public boolean isValid(animals[][] board, int row, int col) {// a method that checks if there is a shark or a whale
		// in a given square
		animals temp;
		int boxrow = row - (row % 2);
		int boxcol = col - (col % 2);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				temp = board[boxrow + i][boxcol + j];
				if (temp instanceof shark && ((boxrow + i) != row) && ((boxcol + j) != col))
					return false;
			} // inner for
		} // outer for
		return true;
	}// isValid
}// whale
