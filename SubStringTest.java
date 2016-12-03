/* Assignment 7.2: Program to find a substring in a String by using an inbuilt method of String class.
   Display the message stating substring found or not
*/
import java.util.Scanner;
class SubStringTest {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);		
		System.out.print("Enter the string: ");
		String str = in.nextLine();	// Scanner method nextLine to receive String
		System.out.print("Enter the substring: ");
		String sub = in.nextLine();
		System.out.println("Is Substring found in String? " + str.contains(sub));	// String function contains to search substring
		if (str.contains(sub)){
			System.out.println("Position of Substring in String: " + str.indexOf(sub));	// String function indexOf to locate position
		}
	}
}