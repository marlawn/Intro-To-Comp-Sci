public class summation {
    public static void main (String[] args) {
        int input = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}