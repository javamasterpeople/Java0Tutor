/**LineTask5
 * 1_Basics_of_software_code_development
 * linear program - Task05
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */
package basicsOfSoftwareCodeDevelopment;

import java.util.Scanner;

public class LineTask5 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the number of seconds");
		int x = input.nextInt();
		double OneSecondInAnHour = 0.00027777777777778;
		int InOneHourOfMinutes = 60;
		int InOneMinuteSeconds = 60;
		double h =x * OneSecondInAnHour;
		double m = (h - (int)h) * InOneHourOfMinutes;
		double s = (m - (int)m) * InOneMinuteSeconds;
		System.out.println((int)h + " hour  " + (int)m + " min  " + (int)s + " second");
		input.close();
	}
}
