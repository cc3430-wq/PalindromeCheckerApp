import java.util.*;


    interface PalindromeStrategy {
        boolean checkPalindrome(String str);
    }


    class StackStrategy implements PalindromeStrategy {

        public boolean checkPalindrome(String str) {
            Stack<Character> stack = new Stack<>();

            for (char c : str.toCharArray()) {
                stack.push(c);
            }

            for (char c : str.toCharArray()) {
                if (c != stack.pop()) {
                    return false;
                }
            }

            return true;
        }
    }


    class DequeStrategy implements PalindromeStrategy {

        public boolean checkPalindrome(String str) {

            Deque<Character> deque = new ArrayDeque<>();

            for (char c : str.toCharArray()) {
                deque.addLast(c);
            }

            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) {
                    return false;
                }
            }

            return true;
        }
    }


    public class UseCase12PalindromeCheckerApp {

        public static void main(String[] args) {

            String input = "madam";


            PalindromeStrategy strategy = new StackStrategy();


            boolean result = strategy.checkPalindrome(input);

            if (result)
                System.out.println(input + " is a Palindrome");
            else
                System.out.println(input + " is NOT a Palindrome");
        }
    }

