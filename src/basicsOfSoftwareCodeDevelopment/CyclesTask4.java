 /**Cycles4
 * 1_Basics_of_software_code_development
 * Cycles program - Task04
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */
package basicsOfSoftwareCodeDevelopment;
import java.math.BigInteger;

public class CyclesTask4 {

	public static void main(String[] args) {
		BigInteger result = BigInteger.valueOf(1);
		for (int i = 1; i <= 200; i++) {
			long a = (long) Math.pow(i, 2);
			BigInteger x = BigInteger.valueOf(a);
			result = result.multiply(x);
			System.out.println(result);
		}
	}
}
