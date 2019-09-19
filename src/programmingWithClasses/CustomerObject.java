 /**EasyClassTask8
 * 4_Programming_with_classes
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package programmingWithClasses;

import java.util.Scanner;

public class CustomerObject {
	

	public static void main(String[] args) {
		CustomerObject obj = new CustomerObject ();
		Customer[] objCustomer;  // создаём ссылку на массив кастомеров
		objCustomer = obj.createCustomer();  // дёргаем метод для моздания массива кастомеров и заполнения
		obj.printSearch(objCustomer);	
		System.out.println("\n");
		obj.printSorting (objCustomer);
	}
	
	//метод создания массива Customer
	private Customer[] createCustomer () {
		Customer[] arrayObj = new Customer [5];
		arrayObj[0] = new Customer(75236, "Мылин", "Георгий", "Петрович", "г. Жлобин, проспект Металла 9", 4916123456788852l, "125871AA15");
		arrayObj[1] = new Customer();
		arrayObj[2] = new Customer(71116, "Косилкин", "Михаил", "Васильевич", "г. Речица, проспект ДСП 9", 4916123456787410l, "125871AA13");
		arrayObj[3] = new Customer(75536, "Клавкин", "Вячеслав", "Олегович", "г. Солигорск, проспект Солей 9", 6616123456788852l, "315871AA15");
		arrayObj[4] = new Customer(75736, "Ключик", "Константин", "Фёдорович", "г. Светлогорск, проспект Света 9", 4916123456744852l, "125871AA20");
		return arrayObj;
	}
	
	// поиск и вывод покупателей в алфавитном порядке
	private void printSearch (Customer[] obj) {
		Scanner input = new Scanner (System.in);
		System.out.println("Произвёдём поиск по диапазону карт:");
		System.out.println("Введите начало интервала:");
		long start = input.nextLong();
		System.out.println("Введите конец интервала:");
		long end = input.nextLong();
		

		boolean status = false;
		for (int i = 0; i < obj.length; i++) {
			if ((obj[i].getNumberCard() > start) & (obj[i].getNumberCard() < end)) {
				status = true;
				System.out.println(obj[i].toString());
			}
		}
		if (!status)
			System.out.println("Искомые данные не найдены!");
	}
	
	
	// поиск и вывод покупателей номер кредитки которых находится в заданном диапазоне
	private void printSorting (Customer[] obj) {
		System.out.println("Выводим список покупателей в алфавитном порядке:");
		Customer[] objClone = obj.clone();
	    for (int i = objClone.length - 1; i >= 1; i--){  //Внешний цикл
	        for (int j = 0; j < i; j++)
	        {       //Внутренний цикл
	        	for (int k = 0;((k < objClone[j].getSurname().length()) & (k < objClone[j + 1].getSurname().length())); k++) {
	        		if (objClone[j].getSurname().charAt(k) == objClone[j + 1].getSurname().charAt(k))
	        			continue;
	        		else if(objClone[j].getSurname().charAt(k) < objClone[j + 1].getSurname().charAt(k)) {               //Если порядок элементов нарушен
	        			Customer temp = objClone[j + 1];
						objClone[j+1] = objClone[j];
						objClone[j] = temp;            //вызвать метод, меняющий местами
		            }
	}
	        }
	    }
	    for (Customer i: objClone)
	    	System.out.println(i.toString());
	}

}
