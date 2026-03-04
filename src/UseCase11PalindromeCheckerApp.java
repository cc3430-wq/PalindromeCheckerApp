class PalindromeChecker {


    public boolean checkPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

    public class UseCase11PalindromeCheckerApp {

        public static void main(String[] args) {

            String input = "madam";


            PalindromeChecker checker = new PalindromeChecker();

            boolean result = checker.checkPalindrome(input);

            if (result)
                System.out.println(input + " is a Palindrome");
            else
                System.out.println(input + " is NOT a Palindrome");
        }
    }

