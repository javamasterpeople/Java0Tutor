 /**EasyClassTask9
 * 4_Programming_with_classes
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package programmingWithClasses;

public class Book {
	
	private int id;
	private String name;
	private String authors;
	private String publisher;
	private int year;
	private int sheet;
	private double price;
	private String type;

	//дефалтовый конструткор
	Book (){
		this.id = 0;
		this.name = "‘илософи€ Java";
		this.authors = "Ёккель Ѕрюс";
		this.publisher = "Computer";
		this.year = 2019;
		this.sheet = 1200;
		this.price = 86.24;
		this.type = "“вЄрдый переплЄт";
	}
	
	//нормальный конструткор
	Book (int id, String name, String authors, String publisher, int year, int sheet, double price, String type){
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.publisher = publisher;
		this.year = year;
		this.sheet = sheet;
		this.price = price;
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", authors=" + authors + ", publisher=" + publisher + ", year="
				+ year + ", sheet=" + sheet + ", price=" + price + ", type=" + type + "]";
	}

	/**
	 * @return id
	 */
	int getId() {
		return id;
	}

	/**
	 * @param id задаваемое id
	 */
	void setId(int id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	String getName() {
		return name;
	}

	/**
	 * @param name задаваемое name
	 */
	void setName(String name) {
		this.name = name;
	}

	/**
	 * @return authors
	 */
	String getAuthors() {
		return authors;
	}

	/**
	 * @param authors задаваемое authors
	 */
	void setAuthors(String authors) {
		this.authors = authors;
	}

	/**
	 * @return publisher
	 */
	String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher задаваемое publisher
	 */
	void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return year
	 */
	int getYear() {
		return year;
	}

	/**
	 * @param year задаваемое year
	 */
	void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return sheet
	 */
	int getSheet() {
		return sheet;
	}

	/**
	 * @param sheet задаваемое sheet
	 */
	void setSheet(int sheet) {
		this.sheet = sheet;
	}

	/**
	 * @return price
	 */
	double getPrice() {
		return price;
	}

	/**
	 * @param price задаваемое price
	 */
	void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return type
	 */
	String getType() {
		return type;
	}

	/**
	 * @param type задаваемое type
	 */
	void setType(String type) {
		this.type = type;
	}
}
