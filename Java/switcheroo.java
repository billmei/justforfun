// Using a switch statement

public class switcheroo {
	public static void main(String[] args) {
		String foo = "Apr";
		int noMonth = 0;
		switch (foo) {
			case "Jan" : noMonth = 1; break;
			case "Feb" : noMonth = 2; break;
			case "Mar" : noMonth = 3; break;
			case "Apr" : noMonth = 4; break;
			case "May" : noMonth = 5; break;
			case "Jun" : noMonth = 6; break;
			case "Jul" : noMonth = 7; break;
			case "Aug" : noMonth = 8; break;
			case "Sep" : noMonth = 9; break;
			case "Oct" : noMonth = 10; break;
			case "Nov" : noMonth = 11; break;
			case "Dec" : noMonth = 12; break;
		}
		System.out.println(noMonth);
	}
}