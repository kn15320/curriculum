package check;

public class Main extends constants.Constants{
	
	public static void main(String[] args) { 
		
		final String firstName = "KAWAMURA";
		final String lastName = "NOBUKO";
		
		printName(firstName, lastName);
		
		Pet dog = new Pet(CHECK_CLASS_JAVA, CHECK_CLASS_HOGE);
		dog.introduce();
		RobotPet robotPet = new RobotPet(CHECK_CLASS_R2D2, CHECK_CLASS_LUKE);
		robotPet.introduce();
	}	
	
	private static void printName(String first, String last) {
		System.out.println("printNameメソッド→ " + first + " " + last);
	}
}
