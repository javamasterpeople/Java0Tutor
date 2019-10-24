 /**CompositionClassTask4
 * 4_Programming_with_classes
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package programmingWithClasses;

import java.util.Scanner;

class Account {
	private String number; // номер счёта
	private boolean statusBlock; //статус блокирован либо нет
	private double money; //сумма на счету
	
	Account (String number, boolean statusBlock, double money){
		this.number = number;
		this.statusBlock = statusBlock;
		this.money = money;
	}
	
	Account (){
		this.number = "00001";
		this.statusBlock = true;
		this.money = 0;
	}


	String getNumber() {
		return number;
	}


	void setNumber(String number) {
		this.number = number;
	}


	boolean isStatusBlock() {
		return statusBlock;
	}


	void setStatusBlock(boolean statusBlock) {
		this.statusBlock = statusBlock;
	}


	double getMoney() {
		return money;
	}


	void setMoney(double money) {
		this.money = money;
	}
	
	
}



public class BankCustomer {
	String nameCustomer; // имя клиента
	Account[] accountArray; //счета у клиента
	
	//Поиск счёта по номеру
	void searchAccountNumber () {
		Scanner input = new Scanner (System.in);
		System.out.println ("Введите номер счёта");
		String number = input.nextLine();
		boolean status = false;
		for (Account i: accountArray)
			if (number.equals(i.getNumber())) {
				System.out.println("\nНомер счёта: " + i.getNumber() + "   Статус блокировки: " + i.isStatusBlock() + "   Сумма: " + i.getMoney());
			status = true;
			}
		
		if (!status)
			System.out.println("Совпадений нет!");		
	}
	
	
	//Вывод общей суммы по счетам
	void printSumAllAccount () {
		double sum = 0;
		for (Account i: accountArray)
			sum += i.getMoney();
		System.out.println("Общая сумма по счетам клиента: " + sum);		
	}
	
	//Вывод суммы по счетам имеющим положительный баланс
	void printPlusAccount () {
		double sum = 0;
		for (Account i: accountArray) {
			if (i.getMoney() > 0)
				sum += i.getMoney();
		}
		System.out.println("Cумма по счетам клиента имеющим положительный баланс: " + sum);	
	}
	
	//Вывод суммы по счетам имеющим отрицательный баланс
	void printMinusAccount () {
		double sum = 0;
		for (Account i: accountArray) {
			if (i.getMoney() < 0)
				sum += i.getMoney();
		}
		System.out.println("Cумма по счетам клиента имеющим отрицателный баланс: " + sum);	
	}
	
	
	BankCustomer (String nameCustomer, Account[] account){
		accountArray = account;
		this.nameCustomer = nameCustomer;
	}
	
	BankCustomer (){
		accountArray = new Account [1];
		this.nameCustomer = "Luka";
			accountArray[0] = new Account ();
	}
	
	
	
	
	
	public static void main (String[] args) {
		// cоздаём массив счетов
		Account[] objAccount1 = new Account [5];
		objAccount1[0] = new Account ("23569752", false, 56332);
		objAccount1[1] = new Account ("23987752", false, 555);
		objAccount1[2] = new Account ("23345652", true, -520);
		objAccount1[3] = new Account ("23569987", false, 0);
		objAccount1[4] = new Account ("55669752", false, 100);
		
		BankCustomer obj1 = new BankCustomer("Luka Abramenko", objAccount1);
		
		obj1.printMinusAccount();
		obj1.printPlusAccount();
		obj1.printSumAllAccount();
		obj1.searchAccountNumber();
	}
}
