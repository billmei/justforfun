import java.util.Scanner;

// Simple recursive function test by calculating factorials.

public class factorial {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner listner = new Scanner(System.in);
        long input = listner.nextInt();
        System.out.println(fact(input));
    }

    public static long fact(long thenumber) {
            if (thenumber <= 0) {
                return 1;
            }
            else {
                return thenumber * fact(thenumber-1);
            }
    }
}
