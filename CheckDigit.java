/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @Marlon:
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {

        // WRITE YOUR CODE HERE

        long num = Long.parseLong(args[0]);
        int length = String.valueOf(num).length();
        long num2 = num / 10;
        int length2 = String.valueOf(num2).length();
        double a = 0;
        double b = 0;
        while (length > 0) {
            double x = num % 10;
            num = num / 100;
            a = a + x;
            length = length - 2;
        }
        double out = a % 10;

        while (length2 > 0) {
            double x = num2 % 10;
            num2 = num2 / 100;
            b = b + x;
            length2 = length2 - 2;
        }
        double mod = b % 10;
        double out2 = (mod * 3) % 10;
        int sum = (int) out + (int) out2;
        int sumMod = sum % 10;
        System.out.println(sumMod);
    }
}