public class FactorCount {

    public static void main(String[] args) {

        int num = 12;
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        System.out.println("Total factors of " + num + " = " + count);
    }
}
