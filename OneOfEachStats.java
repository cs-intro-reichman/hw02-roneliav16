import java.util.Random;

public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		double rnd = generator.nextDouble();
		double countSumOfAllChildren = 0;
		int family2 = 0;
		int family3 = 0;
		int family4 = 0;
		char mostCommon;

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
				if(rnd < 0.5) {
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
			if(countChildren == 2) {
				family2++;
			} else { 
				if(countChildren == 3){
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
