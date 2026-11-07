public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int n = Integer.parseInt(args[0]); // exchages string to int;
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            double mechane = 2 * i + 1;
            if (i % 2 == 0) {
                sum += 1.0 / mechane; // when i is even we are adding to the sum
            } else {
                sum -= 1.0 / mechane; // when i is odd we are subtracting from the sum
            }
        }
        approxPi = 4 * sum;

        System.out.println(approxPi + " " + actualPi);
    }
}
