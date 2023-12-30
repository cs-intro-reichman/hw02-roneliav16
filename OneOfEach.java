
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		char  firstChildType; // Contain the first children type (b or g)
		int countChildren = 1; // count the sum of the children.

		if(Math.random() < 0.5) { // Enter the first children type to a variable.
			firstChildType = 'g';
		} else {
			firstChildType = 'b';
		}
		System.out.print(firstChildType + " "); // print first child
		boolean boyAndGirl = true;

		while(boyAndGirl) { // The loop check if the next children is the same like before. If so, she continues if not ends the loop.
			char anotherChildType;

			if(Math.random() < 0.5) {
				anotherChildType = 'g';
			} else {
				anotherChildType = 'b';
			} 
			System.out.print(anotherChildType + " ");
			if(anotherChildType != firstChildType) {
				boyAndGirl = false;
			}
			countChildren++;
		}
		System.out.println();
		System.out.println("You made it... and you now you have " + countChildren + " children.");
	}
}
