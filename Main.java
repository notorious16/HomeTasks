package net.ukr.kurach.d;

import java.util.Scanner;

/**
 * С помощью циклов нарисовать «обои». Причем количество полос должно вводиться
 * с клавиатуры.
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of lines");
		int h = 5;
		int w = sc.nextInt();

		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				if (j % 2 == 0) {
					System.out.print("***");
				} else {
					System.out.print("+++");
				}
			}
			System.out.println();
		}
	}
}
