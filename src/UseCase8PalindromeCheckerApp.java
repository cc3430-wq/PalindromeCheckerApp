class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

    public class UseCase8PalindromeCheckerApp {

        // Convert string to linked list
        public static Node createLinkedList(String str) {
            Node head = null, tail = null;

            for (int i = 0; i < str.length(); i++) {
                Node newNode = new Node(str.charAt(i));

                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }
            return head;
        }

        // Reverse linked list
        public static Node reverse(Node head) {
            Node prev = null;
            Node current = head;
            Node next;

            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;
        }

        // Check palindrome
        public static boolean isPalindrome(Node head) {

            if (head == null || head.next == null)
                return true;

            Node slow = head;
            Node fast = head;

            // Find middle
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Reverse second half
            Node secondHalf = reverse(slow.next);

            Node firstHalf = head;
            Node temp = secondHalf;

            // Compare both halves
            while (temp != null) {
                if (firstHalf.data != temp.data)
                    return false;

                firstHalf = firstHalf.next;
                temp = temp.next;
            }

            return true;
        }

        public static void main(String[] args) {

            String input = "madam";

            Node head = createLinkedList(input);

            if (isPalindrome(head))
                System.out.println(input + " is a Palindrome");
            else
                System.out.println(input + " is NOT a Palindrome");
        }
    }

