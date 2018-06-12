
public class SpiralMatrixPrint {
	
	public static void spiralMatrixPrint(int highRow, int highCol, int mat[][]) {
		int lowRow, lowCol;
		lowRow = lowCol = 0;
		/*
		 * lowRow, lowCol refer to current lowest row and column respectively.
		 * highRow and highCol refer to current highest row and column respectively.
		 */
		int i;
		while(lowRow < highRow && lowCol < highCol) {
			for(i=lowCol; i< highCol; i++) {
				System.out.print(mat[lowRow][i] + " ");
			}
			lowRow++;
			
			for(i=lowRow; i < highRow; i++) {
				System.out.print(mat[i][highCol-1] + " ");
			}
			highCol--;
			
			if(lowRow < highRow) {
				for(i=highCol-1; i >= lowCol; i--) {
					System.out.print(mat[highRow - 1][i] + " ");
				}
				highRow--; 
			}
			
			if(lowCol < highCol) {
				for(i=highRow-1; i >= lowRow; i--) {
					System.out.print(mat[i][lowCol] + " ");
				}
				lowCol++;
			}
		}	
	}
	
	public static void main(String[] args) {
        int inpMatrix[][] = { {1,  2,  3,  4},
                      {5, 6, 7, 8},
                      {9, 1, 2, 3},
                      {4, 5, 6, 9}
                    };
        spiralMatrixPrint(4, 4, inpMatrix);
	}
	
}
