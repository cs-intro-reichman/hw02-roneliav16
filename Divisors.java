/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) { 
		int num = Integer.parseInt(args[0]); // gets a number from the user
		for(int i = 1; i <= num; i++){ // the loop passes all the numbers between 1 - the number that the user gave, and print all the divisors.
			if(num % i == 0){ // check if i+1 is a divisor of the number that the user gave.
				System.out.println(i);

			}
		}

		}
}
