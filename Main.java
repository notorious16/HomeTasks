package net.ukr.kurach.d;

import java.util.Scanner;
/**
 * 
 * Привет
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a five-figure integer");
		int inñNumber = sc.nextInt();
		System.out.println(inñNumber / 10000);
		System.out.println(inñNumber % 10000 / 1000);
		System.out.println(inñNumber % 1000 / 100);
		System.out.println(inñNumber % 100 / 10);
		System.out.println(inñNumber % 10);
		sc.close();
	}

}
