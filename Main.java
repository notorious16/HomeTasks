package net.ukr.kurach.d;

/**
 * 
 * @author Денис
 *
 *         Треугольник существует только тогда, когда сумма любых двух его
 *         сторон больше третьей. Дано: a, b, c – стороны предполагаемого
 *         треугольника. Напишите программу которая укажет существует такой
 *         треугольник или нет.
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 3;
		int c = 4;
		if (a + b > c && b + c > a && a + c > b) {
			System.out.println("Треугольник существует");
		} else {
			System.out.println("Треугольник не существует");
		}
	}

}
