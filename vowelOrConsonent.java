package capgemini;
import java.util.Scanner;
public class vowelOrConsonent {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch==(char)65||ch==(char)69||ch==(char)73||ch=='O'||ch=='U')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonent");
		}
		

	}

}
