/**
 * 
 */
package com.kb;

/**
 * @author ������
 *
 */
import java.util.Scanner;
public class hiLo {

	/**
	 * @param args
	 */
	 static void pln(String s1) {
		System.out.println(s1);
	}
	 static void p(String s1) {
			System.out.print(s1);
		} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// ��������� ���������� �����, ������� ����� ��������� ������������
		Scanner scan = new Scanner(System.in);		
		int theNumber = (int)(Math.random() * 100 + 1);
		//pln(Integer.toString(theNumber));
		int guess = 0;
		while (guess != theNumber) {
			pln("������� �����: ");
			guess = scan.nextInt();
			//pln("");
			p("�� ����� " + guess + ".");
			if (guess < theNumber) {
				pln(" ������ �����������. ���������� �����.");
			}  //  if (guess < theNumber) 
			else if (guess > theNumber) {
				pln(" ������ �����������. ���������� �����.");
			}
			else {
				pln(" ���������, �������! �� ��������.");
			}
		}   //while (guess != theNumber) 
		
		scan.close();
	}   //   psvm 

}   //  public class hiLo
