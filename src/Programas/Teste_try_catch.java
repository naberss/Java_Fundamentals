package Programas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste_try_catch {

	public static void main(String[] args) {

	method1();

	}
	
	public static void method2() {

		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("*****Method 2 start*****");
			String[] vect = scan.nextLine().split(" ");
			int position = scan.nextInt();
			System.out.println(vect[position]);
			scan.close();
		} catch (InputMismatchException e) {
			System.out.println("please type a number");
			e.printStackTrace();

		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid position");

		}
		System.out.println("*****Method 2 end*****");
		
		
	}
	
	public static void method1() {

		System.out.println("*****Method end 1 start*****");
		method2();
		System.out.println("*****Method end 1 end*****");
		
		
	}

}
