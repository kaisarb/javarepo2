/**
 * 
 */
package com.kb;

/**
 * @author Кайсар
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
	// Генерация случайного числа, которое будет угадывать пользователь
		Scanner scan = new Scanner(System.in);		
		int theNumber = (int)(Math.random() * 100 + 1);
		//pln(Integer.toString(theNumber));
		int guess = 0;
		while (guess != theNumber) {
			pln("Введите число: ");
			guess = scan.nextInt();
			//pln("");
			p("Вы ввели " + guess + ".");
			if (guess < theNumber) {
				pln(" меньше загаданного. Попробуйте снова.");
			}  //  if (guess < theNumber) 
			else if (guess > theNumber) {
				pln(" больше загаданного. Попробуйте снова.");
			}
			else {
				pln(" Правильно, угадали! Вы выиграли.");
			}
		}   //while (guess != theNumber) 
		
		scan.close();
	}   //   psvm 

}   //  public class hiLo
