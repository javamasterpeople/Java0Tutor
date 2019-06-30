 /**Cycles3
 * 1_Basics_of_software_code_development
 * Cycles program - Task03
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package basicsOfSoftwareCodeDevelopment;

public class CyclesTask3 {
	public static void main(String[] args) {
		int result = 0;
		for ( int i = 1; i <= 100; i++) {
			result += Math.pow(i, 2);
			}
	System.out.println(result);
	}
}
