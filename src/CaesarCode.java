/*
 * Code to demonstrate encrption and decrption for Capital letters only
 */

public class CaesarCode {
	static String str = "how ARE YOU";
	static int key = 1;
	public static void main(String[] args) {
		
		char[] charArray= str.toCharArray();
		 encryption(charArray);
		 System.out.println();
		 decryption(charArray);
		 }

	private static void decryption(char[] charArray) {
		for (int i = 0; i<charArray.length; i++) {
			int asciiValue = (int)charArray[i];
			if((asciiValue >=65 & asciiValue<=90)) {
				if (asciiValue < (65+key)) {
					int specialCase = asciiValue-key+90-64;
					char encryptedValue = (char)specialCase;
					System.out.print(encryptedValue);
				}
				else {
				int newAsciiValue = asciiValue-key;
				System.out.print((char)newAsciiValue);
				}	
			}
			else
			System.out.print((char)asciiValue);
		}
		
		
	}

	private static void encryption(char[] charArray) {
		for (int i = 0; i<charArray.length; i++) {
			int asciiValue = (int)charArray[i];
			if((asciiValue >=65 & asciiValue<=90)) {
				if (asciiValue > (90-key)) {
					int specialCase = asciiValue+key-90+64;
					System.out.print((char)specialCase);
				}
				else {
				int newAsciiValue = asciiValue+key;
				System.out.print((char)newAsciiValue);
				}	
			}
			else
			System.out.print((char)asciiValue);
		}
		
	}

}
