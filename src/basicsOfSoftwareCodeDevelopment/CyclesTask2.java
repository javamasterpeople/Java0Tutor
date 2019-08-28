 /**Cycles2
 * 1_Basics_of_software_code_development
 * Cycles program - Task02
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package basicsOfSoftwareCodeDevelopment;
import java.util.Scanner;

public class CyclesTask2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("¬ведите начальное число");
		int start = input.nextInt();
		System.out.println("¬ведите конечное число");
		int end = input.nextInt();
		System.out.println("¬ведите шаг");
		int step = input.nextInt();
		calculationEndPrint (start, end, step);
	}
	
	static void calculationEndPrint (int start, int end, int step) {
		for (int i = start; i <= end; i += step) {
			if (i > 2)
				System.out.print(i + " ");
			else 
				System.out.print((i * -1) + " ");
		}
	}
}
