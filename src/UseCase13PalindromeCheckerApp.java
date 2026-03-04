
public class UseCase13PalindromeCheckerApp {


    public static boolean twoPointerPalindrome(String str) {

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


    public static boolean reversePalindrome(String str) {

        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {

        String input = "madam";


        long start1 = System.nanoTime();
        boolean result1 = twoPointerPalindrome(input);
        long end1 = System.nanoTime();


        long start2 = System.nanoTime();
        boolean result2 = reversePalindrome(input);
        long end2 = System.nanoTime();

        System.out.println("Input String: " + input);

        System.out.println("\nTwo Pointer Method Result: " + result1);
        System.out.println("Execution Time: " + (end1 - start1) + " nanoseconds");

        System.out.println("\nReverse String Method Result: " + result2);
        System.out.println("Execution Time: " + (end2 - start2) + " nanoseconds");
    }
}
