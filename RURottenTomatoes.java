/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

		int row = Integer.parseInt(args[0]);
		int col = Integer.parseInt(args[1]);
		int[][] ratings = new int[row][col];
		int[] sum = new int[col]; 
		int count = 2;
		int biggest = 0;
		int index = 0;

		// COMPLETED THE FOLLOWING PART WHICH STORES THE DATA INTO THE 2D ARRAY

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				ratings[i][j] = Integer.parseInt(args[count]);
				count++;
			}
		}

		// COMPLETED CALCULATING SUM IN EACH COLUMN

		for (int i = 0; i < col; i++) {
			sum[i] = 0;
			for (int j = 0; j < row; j++) {
				sum[i] = sum[i] + ratings[j][i];
			}
		}

		// INCOMPLETE

		biggest = sum[0];

		for (int i = 1; i < sum.length; i++) {
			if (biggest < sum[i]) {
				biggest = sum[i];
				index = i;
			}
		}
		System.out.print(index);
	}
}
