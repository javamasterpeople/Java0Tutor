 /**CompositionClassTask3
 * 4_Programming_with_classes
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package programmingWithClasses;

class City {
	String nameCity;  //название города
	boolean capital;  //столица
	boolean region; //областной центр
	
	City (String nameCity, boolean capital, boolean region) {
		this.nameCity = nameCity;
		this.capital = capital;
		this.region = region;
	}
	
	City (){
		this.nameCity = "Меркуловичи";
		this.capital = false;
		this.region = false;
	}
	
	//переопредилили зачем то ту стринг
 public String toString () {
		return "город: " + this.nameCity + "\n";	
	}
}


class Region {
	String nameRegion; //название 
	double squareRegion; //площадь 
	City[] cityArray; //города 
	
	Region (String nameRegion, double squareRegion, String[] nameCity, boolean[] capital, boolean [] region) {
		this.nameRegion = nameRegion;
		this.squareRegion = squareRegion;
		cityArray = new City [nameCity.length];
		for (int i = 0; i < cityArray.length; i++) 
			cityArray[i] = new City (nameCity[i], capital[i], region[i]);
	}
	
	Region (){
		this.nameRegion = "Гомельская область";
		this.squareRegion = 1;
		cityArray = new City [1];
		cityArray[0] = new City ();
	}
}




public class Country {
	String nameCountry; // название государства
	Region [] regionArray; //области
	
	Country (String nameCountry, String[] nameRegion, double[] squareRegion, String[][] nameCity, boolean[][] capital, boolean [][] region){
		this.nameCountry = nameCountry;
		regionArray = new Region [nameRegion.length];
		for (int i = 0; i < regionArray.length; i++) 
			regionArray[i] = new Region (nameRegion[i], squareRegion[i], nameCity[i], capital[i], region[i]);
	}
	
	Country (){
		this.nameCountry = "Бурка на Фасо";
		regionArray = new Region [1];
			regionArray[0] = new Region ();
	}
	
	
	//метод вывода на консоль столицы
	void printCapital () {
		for (Region i: regionArray)
				for (City k: i.cityArray)
					if (k.capital)
					{
						 System.out.println("Столица в данном государстве:");
						 System.out.println(k.toString());
						 return;
					}
	}
	
	
	//метод вывода на консоль областные центры
	void printRegion () {
		System.out.println("Областные центры в данном государстве:");
		for (Region i: regionArray)
				for (City k: i.cityArray)
					if (k.region)
					{
						System.out.println (k.toString());
					}
	}
	
	
	// вывод количества областей
	void printRegionPcs () {
		int counter = 0;
		for (Region i: regionArray)
				for (City k: i.cityArray)
					if (k.region)
						counter++;
		System.out.println("Количество областей: " + counter);
	}
	
	//вывод площади госудпрства
	void printSquare () {
		double counter = 0;
		for (Region i: regionArray)
				counter += i.squareRegion;
		System.out.println("Площадь государства: " + counter);
	}
	
	
	
					
	
	public static void main (String[] args) {
		String[] nameRegion = {"Брестская", "Витебская", "Гомельская", "Гродненская", "Могилёвская", "Минская"};
		double[] squareRegion = {325.02, 654.22, 421.85, 324.21, 444.22, 323.85};
		String[][] nameCity = {{"Барановичи", "Брест", "Береза"},{"Витебск", "Поставы", "Лепель"},{"Гомель", "Речица"},{"Гродно"},{"Могилёв", "Быхов",
			"Бобруйск", "Осиповичи"},{"Минск", "Солигорск"}};
		boolean[][] capital = {{false, false, false},{false, false, false},{false, false},{false},{false, false,
			false, false},{true, false}};
		boolean [][] region = {{false, true, false},{true, false, false},{true, false},{true},{true, false,
			false, false},{true, false}};
		
		Country Belarus = new Country ("Беларусь", nameRegion, squareRegion, nameCity, capital, region );
		
		Belarus.printCapital();
		Belarus.printRegion();
		Belarus.printRegionPcs();
		Belarus.printSquare();
	
	}

}
