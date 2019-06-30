 /**Cycles5
 * 1_Basics_of_software_code_development
 * Cycles program - Task05
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package basicsOfSoftwareCodeDevelopment;
import java.util.Scanner;

public class CyclesTask5 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("¬ведите число E:");
		double e = input.nextDouble();
		double a = 1;
		double result = 0;
		
		for (int i = 1; a > 0.0; i++) {
			a = (1/Math.pow(2, i)) + (1/Math.pow(3, i));
			if (Math.abs(a) >= e)
				result +=a;
		}
		System.out.println(result);
		input.close();
	}
}
