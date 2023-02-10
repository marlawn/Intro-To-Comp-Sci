public class theRange {
    public static void main(String[] args) {
        int numRows = Integer.parseInt(args[0]);
        int numCols = Integer.parseInt(args[1]);
        int[][] a  = new int[numRows][numCols];
        int sum = 0;
        int count = 1;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols-1; j++) {
                a[i][j] = count;
                sum += count;
                count++;
                StdOut.print(a[i][j] + " ");
            }
            a[i][numCols-1] = sum;
            StdOut.print(a[i][numCols-1]);
            StdOut.println();
            sum = 0;
        }
    }
}
