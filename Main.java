package net.ukr.kurach.d;

import java.util.Scanner;

/**
 * 
 * Вычислить с помощью цикла факториал числа - n введенного с клавиатуры
 * (4<n<16). Факториал числа это произведение всех чисел от этого числа до 1.
 * Например 5!=5*4*3*2*1=120
 *
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Input factorial");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1;
		for (int i = 1; i <= n; i++) {
			a = a * i;
		}
		System.out.println(a);
	}

}
