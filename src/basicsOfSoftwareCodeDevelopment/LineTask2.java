
/**LineTask2
 * 1_Basics_of_software_code_development
 * linear program - Task02
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package basicsOfSoftwareCodeDevelopment;
import java.util.Scanner; // Connect to work with input stream

public class LineTask2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter an integer A");
		double a = input.nextDouble();
		System.out.println("Please enter an integer B");
		double b = input.nextDouble();
	    System.out.println("Please enter an integer C");
		double c = input.nextDouble();
		double z = (b + (Math.sqrt(Math.pow(b, 2) + (4 * a * c))) / (2 * a) ) - 
				    (Math.pow(a, 3) * c) + (Math.pow(b, -2));
		System.out.println("Result  Z = " + z);
		input.close();
	}
}
