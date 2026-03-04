
    import java.util.Scanner;

    public class UseCase3PalindromeCheckerApp {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            
            System.out.print("Enter a string: ");
            String original = sc.nextLine();

            String reverse = "";

            
            for (int i = original.length() - 1; i >= 0; i--) {
                reverse = reverse + original.charAt(i);
            }

            
            if (original.equals(reverse)) {
                System.out.println("The given string is a Palindrome");
            } else {
                System.out.println("The given string is NOT a Palindrome");
            }

            sc.close();
        }
    }
