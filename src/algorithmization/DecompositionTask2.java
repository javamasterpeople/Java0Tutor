 /**DecompositionTask2
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;
import java.util.Scanner;

public class DecompositionTask2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите первое число");
		int n1 = input.nextInt();
		System.out.println("Введите второе число");
		int n2 = input.nextInt();
		System.out.println("Введите третье число");
		int n3 = input.nextInt();
		System.out.println("Введите четвертое число");
		int n4 = input.nextInt();
		System.out.println("Наибольший общий делитель равен  " + check (n1,n2,n3,n4));

	}
	
	static int check (int n1, int n2, int n3, int n4) {
		int nod1 = nod (n1, n2);
		int nod2 = nod (n3, nod1);
		int nod3 = nod (n4, nod2);
        return nod3;
	}
	
	
	// алгоритм Евклида поиск НОД
	static int nod (int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

}
