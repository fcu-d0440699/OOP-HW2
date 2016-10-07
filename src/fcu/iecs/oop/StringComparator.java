package fcu.iecs.oop;
import java.util.Scanner;
public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String a,b;
		
		System.out.println("Enter a string 1: ");
		a =scanner.next();
		System.out.println("Enter a string 2: ");
		b =scanner.next();
		
		if(a.equalsIgnoreCase(b)) System.out.println("The two strings are the same");
		else System.out.println("The two strings are not the same");
	}

}
