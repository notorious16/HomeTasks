package net.ukr.kurach.d;

import java.util.Scanner;

/**
 * Написать программу которая считает 4 числа c клавиатуры и выведет на экран
 * самое большое из них.
 * 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number");
		int a = sc.nextInt();
		System.out.println("Input second number");
		int b = sc.nextInt();
		System.out.println("Input third number");
		int c = sc.nextInt();
		System.out.println("Input forth number");
		int d = sc.nextInt();

		if (a > b && a > c && a > d) {
			System.out.println("First number: (" + a + ") is the biggest one");
		} else if (b > a && b > c && b > d) {
			System.out.println("Second number: (" + b + ") is the biggest one");
		} else if (c > a && c > b && c > d) {
			System.out.println("Third number: (" + c + ") is the biggest one");
		} else if (d > a && d > b && d > c) {
			System.out.println("Forth number (" + d + ") is the biggest one");
		}
		sc.close();
	}

}
