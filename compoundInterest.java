package capgemini;
import java.util.Scanner;
public class compoundInterest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double p = s.nextInt();
	    double temp = p/100;
		double n = s.nextInt();
		double r = s.nextInt();
		double CI = 0;
		for(int i=1;i<=n;i++)
		{
			CI = temp* r;
			temp = CI + p;
			temp = temp/100;
		}
		System.out.println(temp*100);
	}

}
