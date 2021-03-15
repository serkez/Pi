import java.util.Scanner;
public class PiCkeckerTester {

	private static Scanner input;

	public static void main(String[] args) {
		
			 input = new Scanner(System.in);
			 
			 System.out.println("Enter up to 200 hundred digits of Pi: ");
			// String usersPi = input.nextLine();
			 PiChecker a = new PiChecker(input.nextLine());
			
			 System.out.println("you know " + a.howMany() + " digits of pi");
			 
			
			 }
	}



