
public class PiChecker {
	private final String PI = "1415926535897932384626433832795028841971"
			+ "6939937510582097494459230781640628620899"
			+ "8628034825342117067982148086513282306647"
			+ "0938446095505822317253594081284811174502"
			+ "8410270193852110555964462294895493038196";
	private String usersPi; 
	public PiChecker(String p) {
		usersPi = p;
	}
	public int howMany() {
//		 if(usersPi.equals("")) {
//			 System.out.println("Please enter digits of Pi: ");
//		 }
//		 else if(usersPi.equals(PI)){
//			 System.out.println("Congratulations! you know at least 200 digits of Pi!");
//		 }
//			 else {
				 int counter = 0;
				 for(int x = 0; x < usersPi.length(); x++) {
					 if(usersPi.substring(x, x + 1).equals(PI.substring(x, x + 1))) {
						 counter++;
					 }
						 else {
							 return counter;
						 }
					 }
				 return counter;
			 }
	}

