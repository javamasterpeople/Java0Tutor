 /**EasyClassTask10
 * 4_Programming_with_classes
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package programmingWithClasses;

public class Airline {
	
	String destination;
	int numberFly;
	String typeFly;
	int time;
	String day;
	
	// ���������� �����������
	Airline () {
		this.destination = "������";
		this.numberFly = 5358;
		this.typeFly = "MC-100";
		this.time = 2232;
		this.day = "����������� �������";
	}
	
	//����������� � �����������
	Airline (String destination, int numberFly, String typeFly, int time,String day){
		this.destination = destination;
		this.numberFly = numberFly;
		this.typeFly = typeFly;
		this.time = time;
		this.day = day;
	}

	/**
	 * @return destination
	 */
	String getDestination() {
		return destination;
	}

	/**
	 * @param destination ���������� destination
	 */
	void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return numberFly
	 */
	int getNumberFly() {
		return numberFly;
	}

	/**
	 * @param numberFly ���������� numberFly
	 */
	void setNumberFly(int numberFly) {
		this.numberFly = numberFly;
	}

	/**
	 * @return typeFly
	 */
	String getTypeFly() {
		return typeFly;
	}

	/**
	 * @param typeFly ���������� typeFly
	 */
	void setTypeFly(String typeFly) {
		this.typeFly = typeFly;
	}

	/**
	 * @return timeHour
	 */
	int getTimeHour() {
		return time;
	}

	/**
	 * @param timeHour ���������� timeHour
	 */
	void setTimeHour(int timeHour) {
		this.time = timeHour;
	}

	/**
	 * @return day
	 */
	String getDay() {
		return day;
	}

	/**
	 * @param day ���������� day
	 */
	void setDay(String day) {
		this.day = day;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", numberFly=" + numberFly + ", typeFly=" + typeFly
				+ ", time=" + time + ", day=" + day + "]";
	}

	
}
