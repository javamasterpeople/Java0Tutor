 /**Cycles1
 * 1_Basics_of_software_code_development
 * Cycles program - Task01
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */
package basicsOfSoftwareCodeDevelopment;
import java.util.Scanner;

public class CyclesTask1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		boolean status = true;
		int number = 0;
		int result = 0;
		
		do {
		System.out.println("Enter positive integer number:");
		int x = input.nextInt();
		if (x <= 1)
		{
			System.out.println("You entered an incorrect number. Try again");
		}
		else
			status = false;
		number = x;
		} while (status);
		
		for (int i = 1; i < number; i++) {
			result += i;
		}
		
		System.out.println(result);
		input.close();
	}
}
