
/**LineTask1
 * 1_Basics_of_software_code_development
 * linear program - Task01
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package basicsOfSoftwareCodeDevelopment;
import java.util.Scanner; // Connect to work with input stream

public class LineTask1 {
	public static void main (String [] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("Please enter an integer A");
	int a = input.nextInt();
	System.out.println("Please enter an integer B");
	int b = input.nextInt();
    System.out.println("Please enter an integer C");
	int c = input.nextInt();
	int z = ((a - 3)*(b/2))+c;
	System.out.println("Result  Z = " + z);
	input.close();
}
}
