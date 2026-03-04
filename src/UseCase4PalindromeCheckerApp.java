
    import java.util.Scanner;

    public class UseCase4PalindromeCheckerApp {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Take input from user
            System.out.print("Enter a string: ");
            String word = sc.nextLine();

            // Convert string to character array
            char[] arr = word.toCharArray();

            int start = 0;
            int end = arr.length - 1;
            boolean isPalindrome = true;

            // Two-pointer comparison
            while (start < end) {

                if (arr[start] != arr[end]) {
                    isPalindrome = false;
                    break;
                }

                start++;
                end--;
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

