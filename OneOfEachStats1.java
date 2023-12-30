/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]); // Gets a number from the user
		double countSumOfAllChildren = 0;	
		String numOfChildInEachFamily = ""; //Contains all the family children number in 1 string

		for(int i = 0; i < T; i ++) {
			char  firstChildType; // Contain the first children type (b or g)
			int countChildren = 1; // count the sum of the children.
	
			if(Math.random() < 0.5) { // Enter the first children type to a variable.
				firstChildType = 'g';
			} else {
				firstChildType = 'b';
			}
			boolean boyAndGirl = true;
	
			while(boyAndGirl) { // The loop check if the next children is the same like before. If so, she continues if not ends the loop.
				char anotherChildType;
	
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
