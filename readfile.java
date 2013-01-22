import java.util.Scanner;
import java.io.PrintWriter;

public class readfile {
	public static void main(String[] args) {
		String inputName = "myfile.txt";
		Scanner inputfile = FileOpen.openScanner(inputName);
		PrintWriter outputfile = FileOpen.openWriter("output.txt");
	} //use outputfile just like System.out
}