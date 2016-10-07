package fcu.iecs.oop;
import java.util.Scanner;
public class PrintNumberInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a ;
		float b ;
		String c ;

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a integer: ");
		a =scanner.nextInt();
		System.out.println("Enter a float point number: ");	
		b =scanner.nextFloat();
		System.out.println("Enter a you name: ");
		c =scanner.next();
		System.out.printf("Hi %s, the multiplication of %d and  %8.5f is %8.2e . ",c,a,b,a*b);
		
	}
}