package capgemini;
import java.util.Scanner;
public class quotientAndRemainder {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int q = a/b;
		int r = a%b;
	    System.out.println("Quotient is "+q+" Reaminder is "+r);			

	}

}
