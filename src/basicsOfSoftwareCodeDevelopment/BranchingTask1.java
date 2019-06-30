/**Branching1
 * 1_Basics_of_software_code_development
 * branching program - Task01
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */
package basicsOfSoftwareCodeDevelopment;
import java.util.Scanner;

public class BranchingTask1 {

	public static void main(String[] args) {
		int sumOfAnglesForATriangle = 180;
		int rightAngle = 90;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter angle number 1");
		double angleOne = input.nextDouble();
		System.out.println("Enter angle number 2");
		double angleTwo = input.nextDouble();
		if ((angleTwo + angleOne) < sumOfAnglesForATriangle )
		{
			System.out.println("The triangle exists!");
			if ((sumOfAnglesForATriangle - (angleTwo + angleOne)) == rightAngle)
				System.out.println("Triangle is rectangular");
			else
				System.out.println("The triangle is not rectangular");
		}
		else
			System.out.println("Triangle does not exist!");
		input.close();
	}
}
