package assignment.week3;

public class Palindrome {

	public static void main(String[] args) {
		/*a) Declare A String value as"madam"
	 
	 * b) Declare another String rev value as ""
	 * c) Iterate over the String in reverse order
	 * d) Add the char into rev
	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
	 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String */
		
		String value="madam";
		String rev="";
		
		for (int i = value.length()-1; i>=0; i--) {
			rev += value.charAt(i);
		}
			if (value.equalsIgnoreCase(rev)) {
				System.out.println("The given string is Palindrome :" +rev);
			}
				else {
					System.out.println("It is not a palindrome");
			
				
			}
			
		}
	}

	



