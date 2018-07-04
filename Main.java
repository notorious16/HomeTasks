package net.ukr.kurach.d;

import java.util.Scanner;

/**
 * 
 * Выведите на экран прямоугольник из *. Причем высота и ширина прямоугольника
 * вводятся с клавиатуры.
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input height");
		int h = sc.nextInt();
		System.out.println("Input width");
		int w = sc.nextInt();
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				if (j == 1 || j == w || i == 1 || i % h == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
