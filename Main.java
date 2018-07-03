package net.ukr.kurach.d;

import java.util.Scanner;

/**
 *
 *Определить количество дней в году, который вводит пользователь. 
 *В високосном годе - 366 дней, тогда как в обычном 365. 
 *Високосный год определяется по следующему правилу:  
 *Год високосный, если он делится на четыре без остатка, 
 *но если он делится на 100 без остатка, 
 *это не високосный год. 
 *Однако, если он делится без остатка на 400, это високосный год. 
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input year");
		int year = sc.nextInt();
		double a = (4.5 % 4);
		System.out.println(a);
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("366");
		}else {
			System.out.println("365");
		}
	}

}
