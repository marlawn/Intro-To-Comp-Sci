/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @Marlon:
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 2
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {

		int n = args.length;
		int[] input = new int[n];
		boolean logic = false;

		// array for the input

		for (int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(args[i]);
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((input[i] == input[j]) && (i != j)) {
					logic = true;
				}
			}
		}

		System.out.println(logic);

	}
}
