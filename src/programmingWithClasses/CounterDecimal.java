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
		
		
		//вывод текущего состояния счётчиков
		System.out.println("Счётчик №1: " + obj.printValue() + "\nСчётчик №2: " + obj1.printValue() + "\nСчётчик №3: " + obj2.printValue());
		
		//увеличиваем 16 раз
		System.out.println("*********************************************");
		for (int i = 0; i < 17; i++) {
			obj.increaseCounter();
			System.out.print("Счётчик №1: " + obj.printValue() + "\n");
		}
		System.out.println("*********************************************\n");
		
		//увеличиваем 16 раз
		System.out.println("*********************************************");
		for (int i = 0; i < 17; i++) {
			obj1.increaseCounter();
			System.out.print("Счётчик №2: " + obj1.printValue() + "\n");
		}
		System.out.println("*********************************************\n");
		
		//увеличиваем 16 раз
		System.out.println("*********************************************");
		for (int i = 0; i < 17; i++) {
			obj2.increaseCounter();
			System.out.print("Счётчик №3: " + obj2.printValue() + "\n");
		}
		System.out.println("*********************************************\n");
		
		//увеличиваем 20 раз
				System.out.println("*********************************************");
				for (int i = 0; i < 21; i++) {
					obj.decreaseCounter();;
					System.out.print("Счётчик №1: " + obj.printValue() + "\n");
				}
				System.out.println("*********************************************\n");
				
				//увеличиваем 20 раз
				System.out.println("*********************************************");
				for (int i = 0; i < 21; i++) {
					obj1.decreaseCounter();
					System.out.print("Счётчик №2: " + obj1.printValue() + "\n");
				}
				System.out.println("*********************************************\n");
				
				//увеличиваем 20 раз
				System.out.println("*********************************************");
				for (int i = 0; i < 21; i++) {
					obj2.decreaseCounter();
					System.out.print("Счётчик №3: " + obj2.printValue() + "\n");
				}
				System.out.println("*********************************************\n");


	}
	
	// Получение текущего состояния счётчика
	private int printValue () {
		return this.counterValue;
	}

	// увеличение счётчика на единицу
	private void increaseCounter () {
		if (this.counterValue < this.counterEnd)
			this.counterValue++;
		else
			System.out.print("  Достигнут предел счётчика. Попробуйте уменьшать\n");
	}
	
	// уменьшение счётчика на единицу
	private void decreaseCounter () {
		if (this.counterValue > this.counterStart)
			this.counterValue--;
		else
		System.out.print("  Достигнут предел счётчика. Попробуйте увеличивать\n");
	}
}
