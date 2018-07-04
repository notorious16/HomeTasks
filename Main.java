package net.ukr.kurach.d;

/**
 * 
 * Напечатайте таблицу умножения на 5. предпочтительно печатать 1 x 5 = 5, 2 x 5
 * = 10, а не просто 5, 10 и т. д.
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h = 1;

		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= 10; j++) {
				int a = 5;
				int b = j * a;
				System.out.print(j + " x " + a + " = " + b);
				System.out.println();
			}
		}
	}

}
