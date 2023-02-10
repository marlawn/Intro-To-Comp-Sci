public class recursiveTriangle {
    
    public static void printRow(int nStars) {
        if (nStars == 0) {
            System.out.println(); // Force a new line
            return; // no more recursion
        }
        System.out.print("*");
        printRow(nStars - 1);
    }
    public static void main(String[] args) {

    }
}