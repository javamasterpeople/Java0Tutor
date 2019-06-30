 /**Branching5
 * 1_Basics_of_software_code_development
 * branching program - Task05
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */
package basicsOfSoftwareCodeDevelopment;
import java.util.Scanner;

public class BranchingTask5 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter number X");
		int x = input.nextInt();
		double result = 0;
		if (x > 3) {
			result = 1 / ((Math.pow(x, 3)) + 6);
		}
		
		if (x <= 3) {
			result = Math.pow(x, 2) - 3*x + 9;
		}
		System.out.println(result);
		input.close();
	}
}
