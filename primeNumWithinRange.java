package capgemini;
import java.util.Scanner;
public class primeNumWithinRange {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int range = s.nextInt();
		for(int i=0;i<=range;i++)
		{
			if(i%2==0 || i==1 || i==2)
			{
				continue;
			}
			int count = 0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count=1;
					break;
				}
				else
				{
					count=0;
				}
			}
			if(count==1)
			{
				continue;
			}
			else
			{
				System.out.println(i+" is Prime Number");
			}
		}

	}

}
