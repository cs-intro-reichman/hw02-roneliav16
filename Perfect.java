/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int userNum = Integer.parseInt(args[0]); // Gest a number from the user
		int sumOfDivisors = 1; // Create a variable that save the sum of the divisors 
		String printIfTheNumIsPerfect = userNum + " is a perfect number since " + userNum + " = 1";

		for(int i = 2; i < userNum; i++ ) { // The loop search on the divisors of the number, calculates the sum into a variable
			if(userNum % i == 0) {			// and adds the number into the String that will be printed in the end of the program
				sumOfDivisors += i;
				printIfTheNumIsPerfect = printIfTheNumIsPerfect + " + "+ i; 
			}
		}
		if(sumOfDivisors == userNum){ // Check if the sum of the divisors is equal to the first numbrt
			System.out.println(printIfTheNumIsPerfect);
		} else {
			System.out.println(userNum + " is not a perfect number");
		}
	}
}
