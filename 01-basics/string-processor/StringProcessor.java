
public class StringProcessor {

    // Reverse String
    public static String reverse(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }

    // Count Vowels
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' 
                || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }

    // Check Palindrome
    public static boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {

        String text = "Madam";

        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reverse(text));
        System.out.println("Vowel Count: " + countVowels(text));
        System.out.println("Is Palindrome: " + isPalindrome(text));
    }
}
