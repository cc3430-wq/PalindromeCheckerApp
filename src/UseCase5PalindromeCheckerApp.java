
    import java.util.Scanner;
import java.util.Stack;

    public class UseCase5PalindromeCheckerApp {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            
            System.out.print("Enter a string: ");
            String word = sc.nextLine();

            Stack<Character> stack = new Stack<>();

           
            for (int i = 0; i < word.length(); i++) {
                stack.push(word.charAt(i));
            }

            boolean isPalindrome = true;

           
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }

            
            if (isPalindrome) {
                System.out.println("The given string is a Palindrome");
            } else {
                System.out.println("The given string is NOT a Palindrome");
            }

            sc.close();
        }
    }

