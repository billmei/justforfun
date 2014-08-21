import java.util.Scanner;

// Calculate a circle's area

public class CircleArea {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
    
    // Get input
    System.out.print("Enter the radius: ");
    double radius = keyboard.nextDouble();
    final double PI = 3.141592653589;

    System.out.println("The circle's area is: "+radius*radius*PI);
	}
}