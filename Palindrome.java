package palindrome;

import java.util.*;

public class Palindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int rem, sum=0, rev=0, temp=0;
		for(int i=n1; i<n2; i++)
		{
			rev = 0;
			temp = i;
			while(temp!=0)
			{
				rem = temp %10;
				rev = rev*10+rem;
				temp/=10;
			}
			if(rev==i)
			{
				sum+=rev;
			}
		}
		System.out.println(sum);
	}
}