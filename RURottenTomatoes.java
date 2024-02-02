/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author: Arnav Dashaputra ad1589 arnav.dashaputra@rutgers.edu
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


		int[][] theater = new int[Integer.parseInt(args[0])][Integer.parseInt(args[1])];

		int[] arr = new int[args.length - 2];

		for (int i = 2; i < args.length; i++) {
			arr[i - 2] = Integer.parseInt(args[i]);
		}


		int i = 2;
		for (int row = 0; row < Integer.parseInt(args[0]); row++) {
			for (int col = 0; col < Integer.parseInt(args[1]); col++) {
				theater[row][col] = Integer.parseInt(args[i]);
				i++;
			}
		}

		int total = 0;
		int tempTotal = 0;
		int tempIndex = 0;
		int index = 0;

		for (int k = 0; k < theater[0].length; k++) {
			tempTotal = 0;
			for (int p = 0; p < theater.length; p++) {
				tempTotal = tempTotal + theater[p][k];
				tempIndex = k;
			}
			// System.out.println("Sum of " + (k+1) +" column: " + tempTotal);  
			// System.out.println("temptotal"+tempTotal);
			// System.out.println("tempindex"+tempIndex);




			if (tempTotal > total) {
				total = tempTotal;
				index = tempIndex;
			}
			//tempTotal = 0;
			tempIndex = 0;

			// System.out.println("temptotal"+tempTotal);
			// System.out.println("total"+total);
		}



		System.out.println(index);

	}
}