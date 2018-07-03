package net.ukr.kurach.d;

/**
 * In the class was implemented the computation of the area of triangle by
 * Heron's formula.
 * 
 * @version 1.0 01 July 2018
 * @author Denis Kurach
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 5;
		int c = 6;
		double p = (a + b + c) / 2; /* finding semiperimeter */
		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c)); /* finding area */
		System.out.println(s);
	}

}
