
 /**Branching4
 * 1_Basics_of_software_code_development
 * branching program - Task04
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */
package basicsOfSoftwareCodeDevelopment;
import java.util.Scanner;

public class BranchingTask4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter length A");
		double a = input.nextDouble();
		System.out.println("Enter length B");
		double b = input.nextDouble();
		System.out.println("Enter length x");
		double x = input.nextDouble();
		System.out.println("Enter length y");
		double y = input.nextDouble();
		System.out.println("Enter length z");
		double z = input.nextDouble();
		
		if ((a >= x) & (b >= y) | (b >= x) & (a >= y))
			System.out.println("brick fits hole");
		else if ((a >= z) & (b >= x) | (b >= z) & (a >= x))
			System.out.println("brick fits hole");
		else if ((a >= z) & (b >= y) | (b >= z) & (a >= y))
			System.out.println("brick fits hole");
		else System.out.println("brick does not fit the hole");
		input.close();
	}
}
