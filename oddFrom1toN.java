package capgemini;
import java.util.Scanner;
public class oddFrom1toN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=0;
		while(i<=n)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			i++;
		}

	}

}
