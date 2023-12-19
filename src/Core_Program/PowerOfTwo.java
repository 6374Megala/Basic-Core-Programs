
package Core_Program;


public class PowerOfTwo {
    public static void main(String[] args) {
        // Check if the command-line argument is provided
        if (args.length != 1) {
            System.out.println("Usage: java PowerOf2Table <N>");
            return;
        }

        // Parse the command-line argument
        int N = Integer.parseInt(args[0]);

        // Validate the input range
        if (N < 0 || N >= 31) {
            System.out.println("N should be in the range 0 <= N < 31");
            return;
        }

        // Print the table of powers of 2
        System.out.println("Powers of 2 table for N = " + N + ":");
        for (int i = 0; i <= N; i++) {
            int result = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + result);
        }
    }
}
