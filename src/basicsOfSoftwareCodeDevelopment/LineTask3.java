/**LineTask3
 * 1_Basics_of_software_code_development
 * linear program - Task03
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */
package basicsOfSoftwareCodeDevelopment;
import java.util.Scanner;

public class LineTask3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter an integer X");
		double x = input.nextDouble();
		System.out.println("Please enter an integer Y");
		double y = input.nextDouble();
		double z = ((Math.sin ((x) + Math.cos (y)) / (Math.cos (x) - Math.sin (y))) * Math.tan(x*y));
		System.out.println("Result  Z = " + z);
		input.close();
	}
}
