public class Palindrome {
    public static void main(String args[]) {
        
    }

    public static boolean pali(String input) {
        input = input.toLowerCase();
        char[] forwards = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            input.charAt(i) = forwards[i];
        }

        char[] backwards = new char[input.length()];
        for (int i = input.length(); i > 0; i--) {
            input.charAt(i) = backwards[i];
        }

        boolean bool = (forwards == backwards);

        return bool;
    }
}