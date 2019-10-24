 /**CompositionClassTask4
 * 4_Programming_with_classes
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package programmingWithClasses;

import java.util.Scanner;

class Account {
	private String number; // ����� �����
	private boolean statusBlock; //������ ���������� ���� ���
	private double money; //����� �� �����
	
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
	String nameCustomer; // ��� �������
	Account[] accountArray; //����� � �������
	
	//����� ����� �� ������
	void searchAccountNumber () {
		Scanner input = new Scanner (System.in);
		System.out.println ("������� ����� �����");
		String number = input.nextLine();
		boolean status = false;
		for (Account i: accountArray)
			if (number.equals(i.getNumber())) {
				System.out.println("\n����� �����: " + i.getNumber() + "   ������ ����������: " + i.isStatusBlock() + "   �����: " + i.getMoney());
			status = true;
			}
		
		if (!status)
			System.out.println("���������� ���!");		
	}
	
	
	//����� ����� ����� �� ������
	void printSumAllAccount () {
		double sum = 0;
		for (Account i: accountArray)
			sum += i.getMoney();
		System.out.println("����� ����� �� ������ �������: " + sum);		
	}
	
	//����� ����� �� ������ ������� ������������� ������
	void printPlusAccount () {
		double sum = 0;
		for (Account i: accountArray) {
			if (i.getMoney() > 0)
				sum += i.getMoney();
		}
		System.out.println("C���� �� ������ ������� ������� ������������� ������: " + sum);	
	}
	
	//����� ����� �� ������ ������� ������������� ������
	void printMinusAccount () {
		double sum = 0;
		for (Account i: accountArray) {
			if (i.getMoney() < 0)
				sum += i.getMoney();
		}
		System.out.println("C���� �� ������ ������� ������� ������������ ������: " + sum);	
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
		// c����� ������ ������
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
