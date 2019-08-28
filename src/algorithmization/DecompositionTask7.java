 /**DecompositionTask7
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

public class DecompositionTask7 {

	public static void main(String[] args) {
		System.out.println("�������������, ������ ��������� ����");
		System.out.println("����� ����������� �������� ����� �� 9 �����:  " + calculation());
	}
	
	
	 // ����������� ����� ��� �������� ����������
    static int factorial(int n) {
        int result;
        if (n == 1)
            return 1;
        result = factorial(n - 1) * n;
        return result;
    }

    
    static int calculation () {
    	int sum = 0;
    	for (int i = 1; i < 10; i++) {
    		if (i%2 != 0) {
    			sum += factorial (i);
    		}
    	}
    	return sum;
    }
}
