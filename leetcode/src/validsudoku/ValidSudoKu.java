package validsudoku;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoKu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	public static boolean isValid(char[][] board){
		Set<String> set = new HashSet<>();
		int number = 0;
		for(int i = 0;i < 9;i++){
			for(int j = 0;j < 9;j++){
				if (board[i][j] != '.') {
					number = board[i][j];
					if (!set.add(number + "in rows" + i)
							|| !set.add(number + "in column" + j)
							|| !set.add(number + "in block" + i / 3 + "-"
									+ "j/3")) {
						return false;
					}
				}
			}
		}
		
		
		return true;
	}
	
}
