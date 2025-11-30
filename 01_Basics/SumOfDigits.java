public class SumOfDigits {

    public static void main(String[] args) {

        int num = 456;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;   // extract last digit
            sum = sum + digit;     // add digit to sum
            num = num / 10;        // remove last digit
        }

        System.out.println("Sum of digits = " + sum);
    }
}
