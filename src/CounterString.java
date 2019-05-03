/*
 * Code to demonstrate CounterString up to 35
 */
public class CounterString 
{
    public static void main( String[] args )
    {
    	StringBuilder myName = new StringBuilder();
    	int j = 35, k = 35;
    	do {
    		myName.insert (0, 'x');
    		myName.insert(0, j); 		
    		j=k-myName.length();
		} while (j> 0);
		System.out.println("CounterString :: " +myName.toString());
 }
}


	

