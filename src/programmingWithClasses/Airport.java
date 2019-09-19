package programmingWithClasses;

import java.util.Scanner;

public class Airport {

	public static void main(String[] args) {
		Airport obj1 = new Airport();
		Airline[] obj = new Airline [5];
		obj[0] = new Airline ("Минск", 3358, "Boeing - 737", 1748, "Вторник");
		obj[1] = new Airline ();
		obj[2] = new Airline ("Вильнюс", 8874, "СУ-25", 1748, "Среда Суббота");
		obj[3] = new Airline ("Киев", 3413, "АН-2", 1748, "Четверг");
		obj[4] = new Airline ("Москва", 3102, "ИЛ-76", 1748, "Понедельник");
		
		obj1.printSearchDestination(obj);
		System.out.println("\n");
		obj1.printSearchDay(obj);
		System.out.println("\n");
		obj1.printSearch(obj);
		
	}
	
	
	// вывод рейсов для пункта назначения
		private void printSearchDestination (Airline[] obj) {
			Scanner input = new Scanner (System.in);
			System.out.println("Произвёдём поиск пункту назначения:");
			String name = input.nextLine();
			
			boolean status = false;
			for (int i = 0; i < obj.length; i++) {
				if (obj[i].getDestination().contains(name)) {
					status = true;
					System.out.println(obj[i].toString());
				}
			}
			if (!status)
				System.out.println("Искомые данные не найдены!");
		}
	
		// вывод рейсов для дня недели
		private void printSearchDay(Airline[] obj) {
			Scanner input = new Scanner (System.in);
			System.out.println("Произвёдём поиск по дню недели:");
			String name = input.nextLine();
			
			boolean status = false;
			for (int i = 0; i < obj.length; i++) {
				if (obj[i].getDay().contains(name)) {
					status = true;
					System.out.println(obj[i].toString());
				}
			}
			if (!status)
				System.out.println("Искомые данные не найдены!");
		}

		// вывод рейсов для дня недели и время вылета больше заданного
		private void printSearch(Airline[] obj) {
			Scanner input = new Scanner (System.in);
			System.out.println("Произвёдём поиск по дню недели и времени вылета:");
			System.out.println("Введите день вылета");
			String name = input.nextLine();
			System.out.println("Введите час вылета");
			int time = input.nextInt();
			
			boolean status = false;
			for (int i = 0; i < obj.length; i++) {
				if ((obj[i].getDay().contains(name)) & obj[i].getTimeHour() > time) {
					status = true;
					System.out.println(obj[i].toString());
				}
			}
			if (!status)
				System.out.println("Искомые данные не найдены!");
		}	
}
