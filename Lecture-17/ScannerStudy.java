package corejava;
import java.util.Scanner;

public class ScannerStudy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Plese enter your name");
		String firstname = sc.next();//it will take input till a space occures
		String lastname  = sc.next();
		System.out.print("Plese enter your profession: ");
		String profession = sc.next();
		System.out.print("Plese enter your address: ");
		sc.nextLine();
		String address = sc.nextLine();
		
		System.out.println("Name: "+firstname);
		System.out.println("Last name: "+lastname);
		System.out.println("Profession: "+profession);
		System.out.println("Address: "+address);
		

	}

}
