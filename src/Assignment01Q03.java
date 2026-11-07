public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        assert x >= 3;
        System.out.println("The first " + x + " Fibonacci numbers are:");

        int numOdd = 0;
        int num1 = 1;
        int num2 = 1;

        for (int i = 0; i < x; i++) {
            int current;
            if (i == 0) {
                current = num1;
            } else if (i == 1) {
                current = num2;
            } else {
                current = num1 + num2;
                num1 = num2;
                num2 = current;
            }
            System.out.print(current);
            if (i < x - 1) {
                System.out.print(" "); // Make sure we don't print a trailing space
            }
            if (current % 2 != 0) {
                numOdd++;
            }
        }
        System.out.println();
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
