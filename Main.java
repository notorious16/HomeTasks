package net.ukr.kurach.d;

import java.util.Scanner;
/**
 * 
 * �������� ��������� ������� ��������� 5-� ������� ����� � ���������� � 
 * ������� ����� �� �������� ��� �������.
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a five-figure integer");
		int in�Number = sc.nextInt();
		System.out.println(in�Number / 10000);
		System.out.println(in�Number % 10000 / 1000);
		System.out.println(in�Number % 1000 / 100);
		System.out.println(in�Number % 100 / 10);
		System.out.println(in�Number % 10);
		sc.close();
	}

}
