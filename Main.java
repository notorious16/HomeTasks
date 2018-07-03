package net.ukr.kurach.d;

import java.util.Scanner;

/**
 * In the class was implemented the computation of the circumference.
 * 
 * @version 1.0 01 July 2018
 * @author Denis Kurach
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input radius");
		double r = sc.nextDouble();
		double c = 2 * Math.PI * r;
		System.out.println("Circumference is "+c);
		sc.close();
	}

}
