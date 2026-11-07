public class Assignment01Q01 {
    public static void main(String[] args) {
        // a program that takes a list of strings as command line arguments and prints the first character of each string if the ASCII value of the first character is divisible by 5.
        for (String st: args) {
            if (st.length() > 0) {
                char firstChar = st.charAt(0);
                if (firstChar % 5 == 0) {
                    System.out.println(firstChar);
                }
            }
        }
    }
}

