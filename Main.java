package net.ukr.kurach.d;

import java.util.Scanner;
/**
 * 
 * Написать программу которая считывает 5-и значное число с клавиатуры и 
 * выводит цифры из которого оно состоит.
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a five-figure integer");
		int inсNumber = sc.nextInt();
		System.out.println(inсNumber / 10000);
		System.out.println(inсNumber % 10000 / 1000);
		System.out.println(inсNumber % 1000 / 100);
		System.out.println(inсNumber % 100 / 10);
		System.out.println(inсNumber % 10);
		sc.close();
	}

}
