package programmingWithClasses;

import java.util.Scanner;

public class Time {
	private int hour;
	private int minutes;
	private int seconds;

	Time (){
		this.hour = 0;
		this.minutes = 0;
		this.seconds = 0;
	}
	Time (int hour, int minutes, int seconds){
		if (hour > 23)
			this.hour = 0;
		else
			this.hour = hour;
		if (minutes > 59)
			this.minutes = 0;
		else
			this.minutes = minutes;
		if (seconds > 59)
			this.seconds = 0;
		else
			this.seconds = seconds;	
	}

	public static void main(String[] args) {
		Time obj1 = new Time ();
		Time obj2 = new Time (14, 22, 54);
		
		obj1.printTime();
		obj2.printTime();
		
		obj2.settingTime();
		obj2.printTime();
		
		obj2.changeHour();
		obj2.printTime();
		
	    obj2.changeMinutes();
	    obj2.printTime();
	    
	    obj2.changeSeconds();
	    obj2.printTime();
	    
	    obj2.changeStaticTime();
	    obj2.printTime();
	    
	

	}
	
	// установка времени
	private void settingTime () {
		Scanner input = new Scanner (System.in);
		int hour = 0;
		int minutes = 0;
		int seconds = 0;
		System.out.println("Установка времени");
		do {
		System.out.println("Введите ЧАСЫ:");
		hour = input.nextInt();
		} while (hour > 23);
		this.hour = hour;
		
		do {
		System.out.println("Введите МИНУТЫ:");
		minutes = input.nextInt();
		} while (minutes > 59);
		this.minutes = minutes;
		
		do {
		System.out.println("Введите СЕКУНДЫ:");
		seconds = input.nextInt();
		} while (seconds > 59);
		this.seconds = seconds;
	}
	
	//метод изменения часов
	private void changeHour () {
		Scanner input = new Scanner (System.in);
		System.out.println ("ИЗМЕНЕНИЕ ЧАСОВ\nВведите новое значение часов:");
		int hour = input.nextInt();
		if (hour > 23)
			this.hour = 0;
		else 
			this.hour = hour;
	}
	
	
	//метод изменения минут
	private void changeMinutes () {
		Scanner input = new Scanner (System.in);
		System.out.println ("ИЗМЕНЕНИЕ ЧАСОВ\nВведите новое значение минут:");
		int minutes = input.nextInt();
		if (minutes > 59)
			this.minutes = 0;
		else 
			this.minutes = minutes;
	}
	
	
	//метод изменения секунд
	private void changeSeconds () {
		Scanner input = new Scanner (System.in);
		System.out.println ("ИЗМЕНЕНИЕ ЧАСОВ\nВведите новое значение секунд:");
		int seconds = input.nextInt();
		if (seconds > 59)
			this.seconds = 0;
		else 
			this.seconds = seconds;
	}

	
	//метод изменения времени на заданное количество
	private void changeStaticTime () {
		Scanner input = new Scanner (System.in);
		System.out.println ("ИЗМЕНЕНИЕ ВРЕМЕНИ НА ЗАДАННОЕ КОЛИЧЕСТВО \n");
		System.out.println ("На сколько нужно изменить часы:");
		int hour = input.nextInt();
		System.out.println ("На сколько нужно изменить минуты:");
		int minutes = input.nextInt();
		System.out.println ("На сколько нужно изменить секунды:");
		int seconds = input.nextInt();
		
		// изменение часов
		if (hour > 0) {
			for (int i = 1; i <= hour; i++) {
				if (this.hour == 23) {
					this.hour = 0;
					continue;
				}
				else this.hour++;
			}
		}
		
		if (hour < 0) {
			for (int i = 1; i <= Math.abs(hour); i++) {
				if (this.hour == 0) {
					this.hour = 23;
					continue;
				}
				else this.hour--;
			}
		}
		
		
		// изменение минут
				if (minutes > 0) {
					for (int i = 1; i <= minutes; i++) {
						if (this.minutes == 59) {
							this.minutes = 0;
							continue;
						}
						else this.minutes++;
					}
				}
				
				if (minutes < 0) {
					for (int i = 1; i <= Math.abs(minutes); i++) {
						if (this.minutes == 0) {
							this.minutes = 59;
							continue;
						}
						else this.minutes--;
					}
				}
				
				// изменение секунд
				if (seconds > 0) {
					for (int i = 1; i <= seconds; i++) {
						if (this.seconds == 59) {
							this.seconds = 0;
							continue;
						}
						else this.seconds++;
					}
				}
				
				if (seconds < 0) {
					for (int i = 1; i <= Math.abs(seconds); i++) {
						if (this.seconds == 0) {
							this.seconds = 59;
							continue;
						}
						else this.seconds--;
					}
				}
	}

	//Метод вывода текущего времени
	private void printTime () {
		System.out.println("Текущее время:");
		System.out.println(this.hour + "  часов  " + this.minutes + "  минут  " + this.seconds + "  секунд");
	}
	}

