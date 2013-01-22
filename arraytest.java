import java.util.Arrays;
import java.util.Scanner;

// Using arrays in Java

public class arraytest {
	public static void main(String[] args) {
		final int NUM_FRUITS = 20;
		int fruitbasket[]	= new int[NUM_FRUITS];
		initializeFruits(fruitbasket);
		System.out.println(averaged(fruitbasket));
	}

	public static int[] initializeFruits(int[] param) {
		Scanner fruitcapture = new Scanner(System.in);
		for (int i = 0; i < param.length; i++) {
			System.out.print("Enter fruit "+(i+1)+" number: ");
			param[i] = fruitcapture.nextInt();
		}
		return param;
	}

	public static double averaged(int[] param) {
		double sum = 0;
		for (int i = 0; i < param.length; i++) {
			sum += param[i];
		}
		return sum / param.length;
	}
}