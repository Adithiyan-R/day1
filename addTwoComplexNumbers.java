package capgemini;
import java.util.Scanner;
public class addTwoComplexNumbers {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st num real part");
		int a = s.nextInt();
		System.out.println("Enter 1st num imaginary part");
		int b = s.nextInt();
		System.out.println("Enter 2nd num real part");
		int c = s.nextInt();
		System.out.println("Enter 1st num imaginary part");
		int d = s.nextInt();
		int e = a+c;
		int f = b+d;
		System.out.println(e+"+i"+f);
	}
}
