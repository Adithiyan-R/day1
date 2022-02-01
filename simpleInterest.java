package capgemini;
import java.util.Scanner;
public class simpleInterest {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		int SI;
		System.out.println("Enter principal amount");
		int p= s.nextInt();
		System.out.println("Enter no of years");
		int n= s.nextInt();
		System.out.println("Enter rate of interest");
		int r= s.nextInt();
		SI = (p*n*r)/100;
		System.out.println(SI);
	}
}
