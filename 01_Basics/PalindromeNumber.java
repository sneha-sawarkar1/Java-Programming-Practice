public class PalindromeNumber {

    public static void main(String[] args) {

        int num = 121;
        int originalNum = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        if (originalNum == reversed) {
            System.out.println(originalNum + " is a Palindrome Number");
        } else {
            System.out.println(originalNum + " is Not a Palindrome Number");
        }
    }
}
