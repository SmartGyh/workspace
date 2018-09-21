package rotate;

public class Rotate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void rotate(int[][] matrix){
		int n = (matrix.length+1)/2;
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++){
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[matrix.length+1-i][]
			}
		}
		
	}

}
