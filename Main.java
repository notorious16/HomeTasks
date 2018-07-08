package net.ukr.kurach.d;
/**
 * 
 * Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета нечетных цифр в нем. 
 *
 */
public class Main {

	public static void main(String[] args) {
		int[] array1 = {0,5,2,4,7,1,3,19};
		int number = 0;
		for (int i = 0; i < array1.length; i++) {
			if(array1[i]%2!=0){
			number++;
			}
		}
		System.out.println(number);
	}

}
