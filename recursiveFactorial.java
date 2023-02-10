public class recursiveFactorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        int fact = factorial(input);
        System.out.println(fact);
    }
}