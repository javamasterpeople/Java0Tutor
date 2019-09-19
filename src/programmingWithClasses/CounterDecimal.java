 /**EasyClassTask5
 * 4_Programming_with_classes
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package programmingWithClasses;

public class CounterDecimal {
	private int counterStart; 
	private int counterEnd;
	private int counterValue;

	CounterDecimal (){
		this.counterStart = 0;
		this.counterEnd = 10;
		this.counterValue = 0;
	}
	
	CounterDecimal (int start, int end, int value){
		this.counterStart = start;
		this.counterEnd = end;
		if (value < start)
			this.counterValue = start;
		else
			this.counterValue = value;
	}
	
	
	public static void main(String[] args) {
		CounterDecimal obj = new CounterDecimal ();
		CounterDecimal obj1 = new CounterDecimal (20, 35, 20);
		CounterDecimal obj2 = new CounterDecimal (10,20,5);
		
		
		//����� �������� ��������� ���������
		System.out.println("������� �1: " + obj.printValue() + "\n������� �2: " + obj1.printValue() + "\n������� �3: " + obj2.printValue());
		
		//����������� 16 ���
		System.out.println("*********************************************");
		for (int i = 0; i < 17; i++) {
			obj.increaseCounter();
			System.out.print("������� �1: " + obj.printValue() + "\n");
		}
		System.out.println("*********************************************\n");
		
		//����������� 16 ���
		System.out.println("*********************************************");
		for (int i = 0; i < 17; i++) {
			obj1.increaseCounter();
			System.out.print("������� �2: " + obj1.printValue() + "\n");
		}
		System.out.println("*********************************************\n");
		
		//����������� 16 ���
		System.out.println("*********************************************");
		for (int i = 0; i < 17; i++) {
			obj2.increaseCounter();
			System.out.print("������� �3: " + obj2.printValue() + "\n");
		}
		System.out.println("*********************************************\n");
		
		//����������� 20 ���
				System.out.println("*********************************************");
				for (int i = 0; i < 21; i++) {
					obj.decreaseCounter();;
					System.out.print("������� �1: " + obj.printValue() + "\n");
				}
				System.out.println("*********************************************\n");
				
				//����������� 20 ���
				System.out.println("*********************************************");
				for (int i = 0; i < 21; i++) {
					obj1.decreaseCounter();
					System.out.print("������� �2: " + obj1.printValue() + "\n");
				}
				System.out.println("*********************************************\n");
				
				//����������� 20 ���
				System.out.println("*********************************************");
				for (int i = 0; i < 21; i++) {
					obj2.decreaseCounter();
					System.out.print("������� �3: " + obj2.printValue() + "\n");
				}
				System.out.println("*********************************************\n");


	}
	
	// ��������� �������� ��������� ��������
	private int printValue () {
		return this.counterValue;
	}

	// ���������� �������� �� �������
	private void increaseCounter () {
		if (this.counterValue < this.counterEnd)
			this.counterValue++;
		else
			System.out.print("  ��������� ������ ��������. ���������� ���������\n");
	}
	
	// ���������� �������� �� �������
	private void decreaseCounter () {
		if (this.counterValue > this.counterStart)
			this.counterValue--;
		else
		System.out.print("  ��������� ������ ��������. ���������� �����������\n");
	}
}
