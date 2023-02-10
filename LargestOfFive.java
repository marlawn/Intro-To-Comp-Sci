/*************************************************************************
 * Compilation: javac LargestOfFive.java
 * Execution: java LargestOfFive 35 10 32 1 8
 *
 * @Marlon:
 *
 *          Takes five distinct integers as command-line arguments and prints
 *          the
 *          largest value
 *
 *
 *          % java LargestOfFive 35 10 32 1 8
 *          35
 *
 *          Assume the inputs are 5 distinct integers.
 *          Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main(String[] args) {

        // WRITE YOUR CODE HERE

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);
        if (a > b && a > c && a > d && a > e) {
            int largest = a;
            System.out.print(largest);
        } else if (b > a && b > c && b > d && b > e) {
            int largest = b;
            System.out.print(largest);
        } else if (c > a && c > b && c > d && c > e) {
            int largest = c;
            System.out.print(largest);
        } else if (d > a && d > b && d > c && d > e) {
            int largest = d;
            System.out.print(largest);
        } else {
            int largest = e;
            System.out.print(largest);
        }
    }
}