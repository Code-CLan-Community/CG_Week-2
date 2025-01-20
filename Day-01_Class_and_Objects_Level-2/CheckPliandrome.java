import java.util.*;

class InnerCheckPalindrome {
    String text;
    public InnerCheckPalindrome(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }

}

class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = sc.nextLine();
        //creating object of InnerCheckPalindrome 
        InnerCheckPalindrome obj = new InnerCheckPalindrome(text);
        obj.displayResult();
        sc.close();
    }
    }