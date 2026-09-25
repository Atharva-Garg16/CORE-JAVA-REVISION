public class Rec_string_palindrome {
    public static boolean isPalin(String str) {
        // Base case 1: Empty string or single character is always a palindrome
        if (str.length() <= 1) {
            return true;
        }

        int last = str.length() - 1;

        // Base case 2: Mismatched outer characters
        if (str.charAt(0) != str.charAt(last)) {
            return false;
        }

        // Recursive step: Strip outer characters and check inner substring
        return isPalin(str.substring(1, last));
    }

    public static void main(String[] args) {
        System.out.println(isPalin("abc"));      // false
        System.out.println(isPalin("racecar"));  // true
    }
}