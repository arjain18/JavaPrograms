import java.util.Arrays;

/*
 * Code to compare 2 strings,
 * do they contain same characters
 * length of both strings can be difffernt
 */

public class compareStrings 
{
    public static void main( String[] args )
    {
    	StringBuilder firstString = new StringBuilder("abcaa1");
    	StringBuilder secondString = new StringBuilder("aabc12	");
    	
    	firstString = uniqueString(firstString);
    	secondString = uniqueString(secondString);
    	
    	String firstStr = firstString.toString();
    	System.out.println(firstStr);
    	char [] firstCharArray = firstStr.toCharArray();
    	System.out.println(firstCharArray);
    	char [] secondCharArray = secondString.toString().toCharArray();
    	Arrays.sort(firstCharArray);
    	System.out.println( firstCharArray);
    	Arrays.sort(secondCharArray);
    	System.out.println(secondCharArray );

    	if (Arrays.equals(firstCharArray,secondCharArray))
    	System.out.println("Strings are equal");
    	else{
    	   System.out.println("strings are not equal");
    	   }
    }
 
	private static StringBuilder uniqueString(StringBuilder firstString) {
		for(int i =0;i<firstString.length();i++) {
			for (int j =0;j<i;j++) {
				if(firstString.charAt(i)== firstString.charAt(j)) {
					firstString.deleteCharAt(j);
					i--;
				}
			}
		}
		System.out.println("unique string " + firstString);
		return firstString;
	
}
}