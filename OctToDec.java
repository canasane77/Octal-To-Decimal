import java.util.ArrayList;
import java.util.Scanner;

public class OctToDec
{

	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter Octal Number ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		ArrayList al = new ArrayList();
		int i = 0;
		double sum = 0;
		while(num!=0)
		{
		   int rem = num % 10;
		   double tmp = rem * Math.pow(8, i);
		   sum = sum + tmp;
		   i++;
		   num = num/10;
		}
		
			System.out.print("Decimal :"+Math.round(sum));
		
	}

}
