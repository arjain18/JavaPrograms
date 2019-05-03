/*
 * Code to demonstrate Interget to Roman conversion upto 399 
 */
public class IntToRoman {

	public static void main(String[] args) {
		int num1=178;
		
		while (num1 >=140) {
			System.out.print("C");
			num1=num1-100;
			
		}
		int num2 = num1;
		if ( num1 < 40 & num1>9) {
			for (int i = 0; i < (num1/10) ; i++) {
				System.out.print("X");
				num2=num2-10;
			}
		}else if(num1 < 90 & num1 > 9){ 
			if (num1 < 50) {
				System.out.print("XL");
				num2=num2-40;
			}
			else {
				System.out.print("L");
				num2=num2-50;
				for (int i = 0; i < ((num1/10)-5) ; i++) {
					System.out.print("X");
					num2=num2-10;
			}
			}
		}else if (num1 <140 & num1 > 9) {
			if (num1 < 100) {
					
				System.out.print("XC");
				num2=num2-90;
			}
			else {
				System.out.print("C");
				num2=num2-100;
				for (int i = 0; i < ((num1/10)-10) ; i++) {
				
					System.out.print("X");
					num2=num2-10;
		}
		}
			}
		
		if (num2 < 10) {
			if(num2<4) {
				
				for (int i= 0;i <num2;i++)
					System.out.print("I");
					}
			if (num2==4)
				System.out.print("IV");
			if (num2==5)
				System.out.print("V");

			if (num2>5 & num2<9) {
				System.out.print("V");
				for (int i = 0; i < (num2-5); i++) {
					
					System.out.print("I");

				}}
			if (num2==9)
				System.out.print("IX");
	
			}
	}
}
