 /**StringRegularTask1
 * 3_string end basic of text processing
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package stringEndBasicOfTextProcessing;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegularTask1 {

	public static void main(String[] args) {
		StringRegularTask1 obj = new StringRegularTask1 ();
		String str = new String ("Я ломал стекло. Как шоколад в руке! Не херня?\nОсень настала, холодно стало. Куры гавно перестали клевать.Чья-то корова забар ***ла. Ну и погодка.\nОсень где-то жгут корабли. Осень мне бы прочь от земли.\nАбра-кадабра.");
		System.out.println("Исходный текст:\n" + str + "\n");
		System.out.println("Метод сортировки абзацев по количеству предложений:\n");
		for (String i: obj.sortingParagraph(str))
			System.out.println(i);
		
		
	}

	
	//Метод сортировки абзацев по количеству предложений
	private String[] sortingParagraph (String str) {
		// шаблон поиска переходов на новую строку тоесть абзацев
		Pattern pat = Pattern.compile ("[\n]");
		//шаблон поиска предложений
		Pattern pat2 = Pattern.compile("[.|!\\?]");
		//создаём массив абзацев и закидываем в его элементы абзацы
		String[] Paragraph = pat.split(str);
		//массив для хранения количества предложений в абзацах
		int [] counter = new int [Paragraph.length];
		for (int i = 0; i < counter.length; i++)
			counter[i] = 0;
		
		//начинаем просматривать абзацы и считать предложения
		for (int i = 0; i < Paragraph.length; i++) {
				Matcher mat = pat2.matcher(Paragraph[i]);
				while (mat.find())
					counter[i]++;	
			}
			
		// Производим необходимую сортировку на основе полученнх данных
		for (int i = counter.length - 1 ; i > 0; i--)
            for (int j = 0; j < i; j++)
            	if (counter[j] > counter[j + 1]) {
            		String tempString = Paragraph[j];
                	int tempInt = counter[j];
                	Paragraph[j] = Paragraph[j + 1];
                    counter[j] = counter [j + 1];
                    Paragraph[j + 1] = tempString;
                    counter [j + 1] = tempInt;
                }		
		return Paragraph;		
	}

	//Метод сортировки слов по длине в каждом предложении
	private String sortingWords (String str) {
		// шаблон поиска переходов на новую строку тоесть абзацев
				Pattern pat = Pattern.compile ("[\n]");
	    //шаблон поиска предложений
				Pattern pat2 = Pattern.compile("[.|!\\?]");
	    //создаём массив абзацев и закидываем в его элементы абзацы
				String[] Paragraph = pat.split(str);
	    //массив для хранения количества предложений в абзацах
				int [] counter = new int [Paragraph.length];
				for (int i = 0; i < counter.length; i++)
					counter[i] = 0;
				
		//начинаем просматривать абзацы и считать предложения
				for (int i = 0; i < Paragraph.length; i++) {
						Matcher mat = pat2.matcher(Paragraph[i]);
						while (mat.find())
							counter[i]++;	
					}
				
				
				
				
				
		// Производим необходимую сортировку на основе полученнх данных
				for (int k = 0; k < Paragraph.length; k++)
					for (int m = 0; m <= Paragraph[k].length(); m++)
						
						
				        for (int i = counter.length - 1 ; i > 0; i--)
		                   for (int j = 0; j < i; j++)
		            	if (counter[j] > counter[j + 1]) {
		            		String tempString = Paragraph[j];
		                	int tempInt = counter[j];
		                	Paragraph[j] = Paragraph[j + 1];
		                    counter[j] = counter [j + 1];
		                    Paragraph[j + 1] = tempString;
		                    counter [j + 1] = tempInt;
		                }		
				
				
		return " ";
	}
}

