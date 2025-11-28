public class SwapNumbersWithoutTemp {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        a = a + b;  // a = 30
        b = a - b;  // b = 10
        a = a - b;  // a = 20

        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
}
