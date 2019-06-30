/**LineTask6
 * 1_Basics_of_software_code_development
 * linear program - Task06
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */
package basicsOfSoftwareCodeDevelopment;

import java.util.Scanner;

public class LineTask6 {

	public static void main(String[] args) {
		int xMin1 = -2;
		int xMax1 = 2;
		int yMin1 = 0;
		int yMax1 = 4;
		int xMin2 = -4;
		int xMax2 = 4;
		int yMin2 = 0;
		int yMax2 = -3;
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter X");
		int x = input.nextInt();
		System.out.println("Please enter Y");
		int y = input.nextInt();
		if (((x <= xMax1) & (x >= xMin1)) & ((y <= yMax1) & (y >= yMin1)) | 
				((x <= xMax2) & (x >= xMin2)) & ((y >= yMax2) & (y <= yMin2)) )
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
		input.close();
	}
}
