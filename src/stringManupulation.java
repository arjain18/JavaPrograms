/*
 * String Manipulation
 * reverse string with out reverse of spaces
 */
public class stringManupulation {

	public static void main(String args[]) {
		String original = "this is a test string";
		String noSpace;
		noSpace = noSpaceString(original);
		conversion(noSpace, original);
		
	}

	private static void conversion(String noSpace, String original) {
		
		char[] charOriginal = original.toCharArray();
		char[] charnoSpace = noSpace.toCharArray();
		
		System.out.println("Original String:  " + original);
		int lenOriginal = original.length();
		int lenNoSpace = noSpace.length();		
		
		int i;
		int length =lenNoSpace-1;
				for (i = 0; i<lenOriginal; i++) {
					
					if (charOriginal[i] == ' ')
						System.out.print(" ");
					else {
						
						System.out.print(charnoSpace[length]);
						length--;
					}
				}
				
	}

	private static String noSpaceString(String str) {
		str = str.replaceAll("\\s","");
		return str;
		
	}
}
