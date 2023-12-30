/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args) {
		String userString = args[0]; 	// Gets a number from the user 
		int wordLength = userString.length(); // wordLength contain the String Length
		for(int i = wordLength; i > 0; i--) {  // The loop passes on all the String array and print the string in revearse order.
			System.out.print(userString.charAt(i - 1));
		}

		System.out.println(); // print the new line 
	 	if(wordLength % 2 == 1){ // If the string is odd print the middle char
			System.out.println("The middle character is " + userString.charAt(wordLength / 2));
		} else { 	// If the string is even - print the first middle char
			System.out.println("The middle character is " + userString.charAt((wordLength / 2) - 1));
		
		}
	

	}
}
