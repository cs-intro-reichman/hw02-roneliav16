import java.util.Random;

public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);
		int countSumOfAllChildren = 0;
		int family2 = 0;
		int family3 = 0;
		int family4 = 0;

		for(int i = 0; i < T; i ++) {
			boolean isBoy = false;
			boolean isGirl = false;
			int countChildren = 0; // count the sum of the children.

			while(!isBoy || !isGirl) { // The loop check if the next children is the same like before. If so, she continues if not ends the loop.
				double rnd = generator.nextDouble();
				if(rnd < 0.5) {
					isGirl = true;
				} else {
					isBoy = true;
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
		System.out.println("Average: " + (double)countSumOfAllChildren / T + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + family2);
		System.out.println("Number of families with 3 children: " + family3);
		System.out.println("Number of families with 4 or more children: " + family4);
		int max = Math.max(Math.max(family2, family3), family4);
		int average = 0;
		if(max == family2){
			average = 2;
		} else {
			if(max == family3) {
				average = 3;
			} else {
				average = 4;
			}
		}
		System.out.println("The most common number of children is " + average + ".");
	}
}
