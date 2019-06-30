
 /**Branching3
 * 1_Basics_of_software_code_development
 * branching program - Task03
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */
package basicsOfSoftwareCodeDevelopment;
import java.util.Scanner;

public class BranchingTask3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter  A");
		int a = input.nextInt();
		System.out.println("Enter  B");
		int b = input.nextInt();
		System.out.println("Enter  C");
		int c = input.nextInt();
		System.out.println("Enter  D");
		int d = input.nextInt();
		int numberOne = 0;
		int numberTwo = 0;
		
		if (a < b)
			numberOne = a;
		else numberOne = b;
		
		if (c < d)
			numberTwo = c;
		else numberTwo = d;
		
		if (numberOne == numberTwo)
			System.out.println(numberOne + " = " + numberTwo);
		else if (numberOne > numberTwo)
			System.out.println("Maximum number  " + numberOne);
		else System.out.println("Maximum number  " + numberTwo);
		input.close();
	}
}
