public class Otest {
    public static void main(String[] args) {
        int n=231313;
        int[] digits = new int[10];
        while (n != 0) {
            digits[n % 10]++;
            n /= 10;
        }

        int sorted = 0;
        for (int digit = 1; digit < digits.length; digit++) {
            for (int count = digits[digit]; count > 0; count--) {
                sorted = sorted * 10 + digit;
            }
        }
        System.out.println(sorted);
    }
}
