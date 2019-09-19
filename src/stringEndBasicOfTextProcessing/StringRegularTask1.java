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
		String str = new String ("� ����� ������. ��� ������� � ����! �� �����?\n����� �������, ������� �����. ���� ����� ��������� �������.���-�� ������ ����� ***��. �� � �������.\n����� ���-�� ���� �������. ����� ��� �� ����� �� �����.\n����-�������.");
		System.out.println("�������� �����:\n" + str + "\n");
		System.out.println("����� ���������� ������� �� ���������� �����������:\n");
		for (String i: obj.sortingParagraph(str))
			System.out.println(i);
		
		
	}

	
	//����� ���������� ������� �� ���������� �����������
	private String[] sortingParagraph (String str) {
		// ������ ������ ��������� �� ����� ������ ������ �������
		Pattern pat = Pattern.compile ("[\n]");
		//������ ������ �����������
		Pattern pat2 = Pattern.compile("[.|!\\?]");
		//������ ������ ������� � ���������� � ��� �������� ������
		String[] Paragraph = pat.split(str);
		//������ ��� �������� ���������� ����������� � �������
		int [] counter = new int [Paragraph.length];
		for (int i = 0; i < counter.length; i++)
			counter[i] = 0;
		
		//�������� ������������� ������ � ������� �����������
		for (int i = 0; i < Paragraph.length; i++) {
				Matcher mat = pat2.matcher(Paragraph[i]);
				while (mat.find())
					counter[i]++;	
			}
			
		// ���������� ����������� ���������� �� ������ ��������� ������
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

	//����� ���������� ���� �� ����� � ������ �����������
	private String sortingWords (String str) {
		// ������ ������ ��������� �� ����� ������ ������ �������
				Pattern pat = Pattern.compile ("[\n]");
	    //������ ������ �����������
				Pattern pat2 = Pattern.compile("[.|!\\?]");
	    //������ ������ ������� � ���������� � ��� �������� ������
				String[] Paragraph = pat.split(str);
	    //������ ��� �������� ���������� ����������� � �������
				int [] counter = new int [Paragraph.length];
				for (int i = 0; i < counter.length; i++)
					counter[i] = 0;
				
		//�������� ������������� ������ � ������� �����������
				for (int i = 0; i < Paragraph.length; i++) {
						Matcher mat = pat2.matcher(Paragraph[i]);
						while (mat.find())
							counter[i]++;	
					}
				
				
				
				
				
		// ���������� ����������� ���������� �� ������ ��������� ������
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

