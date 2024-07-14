import java.util.Stack;
public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            stack.push(input.charAt(i));
        }
        int startIndex = (length % 2 == 0) ? length / 2 : length / 2 + 1;
        for (int i = startIndex; i < length; i++) {
            char currentChar = input.charAt(i);
            if (!stack.isEmpty() && stack.peek() == currentChar) {
                stack.pop();
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String[] testStrings = {"aca", "bcb", "abcba", "abbcbba"};

        for (String str : testStrings) {
            boolean result = isPalindrome(str);
            System.out.println("\"" + str + "\" is a palindrome: " + result);
        }
    }
}