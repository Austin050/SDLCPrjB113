

import java.util.Scanner;

public class Factorial{   // connecting with the SumofEvenandOdd
	public static void main (String[]arg) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Input the number which you want to calculate : ");
		int num = sc.nextInt();
		int factorial = 1;
//		for (int i = 1; i <= num; i++) {
//			factorial *= i;
//			
//		}
//		System.out.println(num + " factorial is " +factorial);
		for (int i = num; i>=1; i--) {
			factorial *= i;
		}
		System.out.println(num + " factorial is " +factorial);
}
}
