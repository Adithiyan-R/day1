package capgemini;
import java.util.Scanner;
public class prizeAmount {
 public static void main (String [] args) {
	 Scanner s = new Scanner (System.in);
	 int prize;
	 int rank = s.nextInt();
	 switch(rank)
	 {
	 case 1:
		 prize = 10000;
		 break;
	 case 2:
		 prize = 5000;
		 break;
	 case 3:
		 prize = 1000;
		 break;
	 default:
		 prize=0;	 
	 }
	 System.out.println(prize);
 }
}
