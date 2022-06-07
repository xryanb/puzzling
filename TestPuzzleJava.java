import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
    	//..
		// Write your other test cases here.
		String randomLetter=generator.getRandomLetter();
		System.out.println(randomLetter);

		String generatePassword=generator.generatePassword();
		System.out.println(generatePassword);

		ArrayList<String>randomPassword=generator.getNewPasswordSet(8);
		System.out.println(randomPassword);
		//..
	}
}
