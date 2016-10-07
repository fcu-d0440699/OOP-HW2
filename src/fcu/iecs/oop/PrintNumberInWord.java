package fcu.iecs.oop;
import java.util.Scanner;
public class PrintNumberInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a ;
		String[] name = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a integer: ");
		a =scanner.nextInt();
		
		if(a>0 && a<10){
			System.out.printf("The input integer is ¡§%s¡¨. ",name[a-1]);
		}
		else System.out.println("The input integer is ¡§OTHER¡¨. ");
	}
}
