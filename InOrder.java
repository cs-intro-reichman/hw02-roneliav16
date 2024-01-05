/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int previoustNum = (int)(Math.random() * 10); // Generates the previoust number beteen 0 to 9
		System.out.print(previoustNum + " "); // print the previoust number
		boolean loopBool = true; // Boolean variable that indicates the continuity of the loop
		do{
			int currentNum = (int)(Math.random() * 10); // Generates a new number between 0 to 9
			if(currentNum >= previoustNum) { // check if the new number is bigger or equals to the current number
				System.out.print(currentNum + " "); // print the new number
				previoustNum = currentNum; 
			} else {
				loopBool = false;
			}

		} while(loopBool);
		/* your solution is very good, just a remark, do-while is less widely used and not all languages support it.
  		so next time maybe do it with a regular while if you can*/
	
	}
}
