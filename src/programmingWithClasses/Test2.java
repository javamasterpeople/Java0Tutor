 /**EasyClassTask2
 * 4_Programming_with_classes
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package programmingWithClasses;

public class Test2 {
	private int a;
	private int b;
	
	//конструкор с входнфми параметрами;
	Test2 (int a, int b){
		this.a = a;
		this.b = b;
	}
	
	//конструткор по умолчанию
	Test2 (){
		this.a = 100;
		this.b = 200;
	}
	

	public static void main(String[] args) {
		Test2 obj = new Test2 ();
		Test2 obj1 = new Test2 (4,8);
		System.out.println("obj.A = " + obj.getA ());
		System.out.println("obj.B = " + obj.getB ());
		System.out.println("obj1.A = " + obj1.getA ());
		System.out.println("obj1.B = " + obj1.getB ());
		obj.setA (44);
		obj.setB (55);
		obj1.setA (33);
		obj1.setB (22);
		System.out.println("obj.A = " + obj.getA ());
		System.out.println("obj.B = " + obj.getB ());
		System.out.println("obj1.A = " + obj1.getA ());
		System.out.println("obj1.B = " + obj1.getB ());
	}

	// геттер А
	public int getA() {
		return a;
	}

	// сеттер A
	public void setA(int a) {
		this.a = a;
	}

	// геттер B
	public int getB() {
		return b;
	}

	//сеттер B
	public void setB(int b) {
		this.b = b;
	}
}
