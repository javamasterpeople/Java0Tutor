
 /**Branching2
 * 1_Basics_of_software_code_development
 * branching program - Task02
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package basicsOfSoftwareCodeDevelopment;
import java.util.Scanner;

public class BranchingTask2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter point A - X1");
		double x1 = input.nextDouble();
		System.out.println("Enter point A - Y1");
		double y1 = input.nextDouble();
		System.out.println("Enter point B - X2");
		double x2 = input.nextDouble();
		System.out.println("Enter point B - Y2");
		double y2 = input.nextDouble();
		System.out.println("Enter point C - X3");
		double x3 = input.nextDouble();
		System.out.println("Enter point C - Y3");
		double y3 = input.nextDouble();
		
		//if (((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)))
		if ((((x2 - x1)*(y3 - y1)) - ((x3 - x1)*(y2 - y1))) == 0)
			System.out.println("Points are on one straight line");
		else
			System.out.println("The points are not on the same straight line");
		input.close();
	}
	
}
