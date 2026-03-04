
    import java.util.Scanner;
import java.util.Stack;

    public class UseCase5PalindromeCheckerApp {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Take input from user
            System.out.print("Enter a string: ");
            String word = sc.nextLine();

            Stack<Character> stack = new Stack<>();

            // Push characters into stack
            for (int i = 0; i < word.length(); i++) {
                stack.push(word.charAt(i));
            }

            boolean isPalindrome = true;

            // Pop characters and compare
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }

            // Print result
            if (isPalindrome) {
                System.out.println("The given string is a Palindrome");
            } else {
                System.out.println("The given string is NOT a Palindrome");
            }

            sc.close();
        }
    }

