package capgemini;
import java.util.Scanner;
public class avgOF3Numbers {
	public static void main(String [] args) {
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int average = (a+b+c)/3;
		System.out.println(average);
	}
}
