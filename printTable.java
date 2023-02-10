public class printTable 
public static void printTable(int a) {
	int[][] table = new int[a][a];
	int count = 1;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; i < a.length; i++) {
			table[i][j] = count;
			System.out.print(table[i][j]);
			count++;
		}
		System.out.println();
	}
}