import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string:
        System.out.println("Please enter a string");
        String s = input.nextLine();

        // The index of the first character:
        int low = 0;

        // The index of the last character:
        int high = s.length() - 1;

        boolean isPalindrome = true;

        while(low < high) {

            if(s.charAt(low)!= s.charAt(high)) {
                isPalindrome = false;
                break;
            }

            low++;
            high--;
        }
        if(isPalindrome) {
            System.out.println(s + " is a palindrome");
        }
        else {
            System.out.println(s + " is not a palindrome");
        }
    }
}