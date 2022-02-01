package capgemini;
import java.util.Scanner;
public class largestOfFour {

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int max=0;
	    int a = s.nextInt();
	    int b = s.nextInt();
	    int c = s.nextInt();
	    int d = s.nextInt();
	    
	    if(a>b && a>c)
	    {
	        if(a>d)
	        {
	        	max = a;
	        }
	        else
	        {
	        	max = d;
	        }
	    }
	    else if(b>c && b>d)
	    {
	    	max=b;
	    }
	    else if(c>d)
	    {
	    	max=c;
	    }
	    else
	    {
	    	max = d;
	    }
	    	
	  System.out.println(max);

	}

}
