package capgemini;
import java.util.Scanner;
public class checkOddOrEven {
	public static void main(String [] args) {
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		if(a%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}
