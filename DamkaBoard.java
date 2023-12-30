/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]); // Gets a number from the user
		for(int i = 0; i < n; i++) { // The loop print * or space relate to the number the user gave.
			for(int j = 0; j < (n * 2); j++ ) { // In Each lime the loop print n timed '*', and n times ' '
				if((i + j) % 2 == 0){
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

