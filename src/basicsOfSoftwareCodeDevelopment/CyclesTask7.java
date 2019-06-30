 /**Cycles7
 * 1_Basics_of_software_code_development
 * Cycles program - Task07
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */
package basicsOfSoftwareCodeDevelopment;
import java.util.Scanner;

public class CyclesTask7 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("¬ведите число  M");
		int m = input.nextInt();
		System.out.println("¬ведите число  N");
		int n = input.nextInt();
		
		for(int i = m; i <= n; i++) {
			boolean status = false;
			System.out.println("\n ƒл€ числа " + i + " найдены следующие делители:");
			for(int j = 2; j < i; j++) {
				if (i%j == 0) {
					System.out.print(j + " ");
					status = true;
				}
			}
			if (!status)
				System.out.print("не найдены");
		}
		input.close();
	}
}
