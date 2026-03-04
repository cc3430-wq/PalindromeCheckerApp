
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

    public class UseCase6PalindromeCheckerApp {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);


            System.out.print("Enter a string: ");
            String word = sc.nextLine();

            Stack<Character> stack = new Stack<>();
            Queue<Character> queue = new LinkedList<>();


            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                stack.push(ch);     // LIFO
                queue.add(ch);      // FIFO
            }

            boolean isPalindrome = true;


            for (int i = 0; i < word.length(); i++) {
                if (queue.remove() != stack.pop()) {
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
