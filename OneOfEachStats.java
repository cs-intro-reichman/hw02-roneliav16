import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		double rnd = generator.nextDouble();
		double countSumOfAllChildren = 0;
		String numOfChildInEachFamily = "";

		for(int i = 0; i < T; i ++) {
			char  firstChildType; // Contain the first children type (b or g)
			int countChildren = 1; // count the sum of the children.
	
			if(rnd < 0.5) { // Enter the first children type to a variable.
				firstChildType = 'g';
			} else {
				firstChildType = 'b';
			}
			boolean boyAndGirl = true;
	
			while(boyAndGirl) { // The loop check if the next children is the same like before. If so, she continues if not ends the loop.
				char anotherChildType;
				rnd = generator.nextDouble();
				if(Math.random() < 0.5) {
					anotherChildType = 'g';
				} else {
					anotherChildType = 'b';
				} 
				if(anotherChildType != firstChildType) {
					boyAndGirl = false;
				}
				countChildren++;
			}
			countSumOfAllChildren += countChildren; //Adds the quantity of the current family to the sum of all families.
			numOfChildInEachFamily += countChildren;
		}
		int family2 = 0;
		int family3 = 0;
		int family4 = 0;
		char mostCommon;

		for(int i = 0; i < numOfChildInEachFamily.length(); i++ ) { // The loop check how much families have 2/3/4 or more children
			if(numOfChildInEachFamily.charAt(i) == '2') {
				family2++;
			} else {
				if(numOfChildInEachFamily.charAt(i) == '3') {
					family3++;
				} else {
						family4++;
				}
			}
		}
		if((family2 >= family3) && (family2 >= family4)) { // check which of the groups is the most common
			mostCommon = '2';
		} else {
			if ((family3 >= family2) && family3 >= family4) {
				mostCommon = '3';
			} else { 
				mostCommon = '4';
			}
		}
		System.out.println("Average: " + countSumOfAllChildren / T + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + family2 + ".");
		System.out.println("Number of families with 3 children: " + family3+ ".");
		System.out.println("Number of families with 4 or more children: " + family4+ ".");
		System.out.println("The most common number of children is " + mostCommon + ".");
	}
}
