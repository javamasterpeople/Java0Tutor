/**LineTask4
 * 1_Basics_of_software_code_development
 * linear program - Task04
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */
package basicsOfSoftwareCodeDevelopment;
import java.util.Scanner; // Connect to work with input stream

public class LineTask4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter an format number XXX.XXX");
		double x = input.nextDouble();
		double result = ((x*1000)%1000 + ((int)x)/1000.00);
		System.out.println(result);
		input.close();
	}
}
