 /**EasyClassTask8
 * 4_Programming_with_classes
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package programmingWithClasses;

class Customer {
	private int id;  // id
	private String surname; //фамилия
	private String name; // имя
	private String nameTwo; // отчество
	private String adress; // адрес
	private long  numberCard;  // номер кредитной карты
	private String numberBaggage;  // номер багажа

	
	Customer (){
		this.id = 0;
		this.surname = "Васин";
		this.name = "Василий";
		this.nameTwo = "Васильевич";
		this.adress = "г. Гомель, проспект Речицкий 999";
		this.numberCard = 4916123456789010l;
		this.numberBaggage = "111111AA11";
	}
	
	Customer (int id, String surname, String name, String nameTwo, String adress, long numberCard, String numberBaggage){
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.nameTwo = nameTwo;
		this.adress = adress;
		this.numberCard = numberCard;
		this.numberBaggage = numberBaggage;
	}

	

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id задаваемое id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname задаваемое surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name задаваемое name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return nameTwo
	 */
	public String getNameTwo() {
		return nameTwo;
	}

	/**
	 * @param nameTwo задаваемое nameTwo
	 */
	public void setNameTwo(String nameTwo) {
		this.nameTwo = nameTwo;
	}

	/**
	 * @return adress
	 */
	public String getAdress() {
		return adress;
	}

	/**
	 * @param adress задаваемое adress
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}

	/**
	 * @return numberCard
	 */
	public long getNumberCard() {
		return numberCard;
	}

	/**
	 * @param numberCard задаваемое numberCard
	 */
	public void setNumberCard(long numberCard) {
		this.numberCard = numberCard;
	}

	/**
	 * @return numberBaggage
	 */
	public String getNumberBaggage() {
		return numberBaggage;
	}

	/**
	 * @param numberBaggage задаваемое numberBaggage
	 */
	public void setNumberBaggage(String numberBaggage) {
		this.numberBaggage = numberBaggage;
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", nameTwo=" + nameTwo + ", adress="
				+ adress + ", numberCard=" + numberCard + ", numberBaggage=" + numberBaggage + "]";
	}
}
